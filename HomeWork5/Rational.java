// import java.util.ArrayList;

public class Rational extends CalcModel {

    public CalcModel reduction(CalcModel calcModel) {
        int m = 1;
        int x = calcModel.getX();
        int y = calcModel.getY();
        if (x < y) {
            m = x;
            x = y;
            y = m;
        }

        while (m != 0) { // * Найдите самый большой общий делитель, подбрасывая и разделяя * /
            m = x % y;
            x = y;
            y = m;
        }
        CalcModel result; //
        if (m == 0) {
            result = new CalcModel(getX(), getY());
        } else {
            result = new CalcModel(getX() / m, getY() / m);
        }
        return result;
    }

    public CalcModel sum(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel sum = new CalcModel(calcModel1.getX() * calcModel2.getY() + calcModel2.getX() * calcModel1.getY(),
                calcModel1.getY() * calcModel2.getY());
        System.out.println(sum);
        return reduction(sum);
    }

    public CalcModel sub(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel sub = new CalcModel(calcModel1.getX() * calcModel2.getY() - calcModel1.getX() * calcModel1.getY(),
                calcModel1.getY() * calcModel2.getY());
        CalcModel result = new CalcModel();
        result = reduction(sub);
        return result;
    }

    public CalcModel mult(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel mult = new CalcModel(calcModel1.getX() * calcModel2.getX(), calcModel1.getY() * calcModel2.getY());
        CalcModel result = new CalcModel();
        result = reduction(mult);
        return result;
    }

    public CalcModel div(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel div = new CalcModel(calcModel1.getX() * calcModel2.getY(), calcModel1.getY() * calcModel2.getX());
        CalcModel result = new CalcModel();
        result = reduction(div);
        return result;
    }
    // @Override
    // public String toString() {
    //     return getX() + "+(/)" + getY() + "(i)";
    // }
}
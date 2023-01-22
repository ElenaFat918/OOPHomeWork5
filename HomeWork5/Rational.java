// import java.util.ArrayList;

public class Rational extends CalcModel {

    public CalcModel reduction(CalcModel calcModel) {
        int m = 1;
        int x = calcModel.x;
        int y = calcModel.y;
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
        CalcModel result = new CalcModel(); //
        if (m == 0) {
            result.x = calcModel.x;
            result.y = calcModel.y;
        } else {
            result.x = calcModel.x / m;
            result.y = calcModel.y / m;
        }
        return result;
    }

    public CalcModel sum(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel sum = new CalcModel(calcModel1.x * calcModel2.y + calcModel2.x * calcModel1.y,
                calcModel1.y * calcModel2.y);
        System.out.println(sum);
        return reduction(sum);
    }

    public CalcModel sub(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel sub = new CalcModel(calcModel1.x * calcModel2.y - calcModel1.x * calcModel1.y,
                calcModel1.y * calcModel2.y);
        CalcModel result = new CalcModel();
        result = reduction(sub);
        return result;
    }

    public CalcModel mult(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel mult = new CalcModel(calcModel1.x * calcModel2.x, calcModel1.y * calcModel2.y);
        CalcModel result = new CalcModel();
        result = reduction(mult);
        return result;
    }

    public CalcModel div(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel div = new CalcModel(calcModel1.x * calcModel2.y, calcModel1.y * calcModel2.x);
        CalcModel result = new CalcModel();
        result = reduction(div);
        return result;
    }
}
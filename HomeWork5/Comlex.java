// import java.util.ArrayList;

public class Comlex extends CalcModel{

    public Comlex(){
    }

    public CalcModel sum(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel result = new CalcModel(calcModel1.getX() + calcModel2.getX(), calcModel1.getY() + calcModel1.getY());
        return result;
    }

    public CalcModel sub(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel result = new CalcModel(calcModel1.getX() - calcModel2.getY(), calcModel1.getX() - calcModel1.getY());
        return result;
    }

    public CalcModel mult(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel result = new CalcModel(calcModel1.getX() * calcModel2.getY() - calcModel1.getY() * calcModel1.getY(),
                calcModel1.getY() * calcModel1.getX() + calcModel1.getX() * calcModel2.getY());
        return result;
    }

    public CalcModel div(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel result = new CalcModel(
                (calcModel1.getX() * calcModel2.getX() + calcModel1.getY() * calcModel1.getY())
                        / (calcModel1.getX() * calcModel1.getX() + calcModel1.getY() * calcModel1.getY()),
                (calcModel1.getY() * calcModel1.getX() - calcModel1.getX() * calcModel2.getY())
                        / (calcModel1.getX() * calcModel1.getX() + calcModel1.getY() * calcModel1.getY()));
        return result;
    }
    // @Override
    // public String toString() {
    //     return getX() + "+" + getY() + "i"; 
    // }
}
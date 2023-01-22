// import java.util.ArrayList;

public class Comlex extends CalcModel{

    public Comlex(){
    }

    public CalcModel sum(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel result = new CalcModel(calcModel1.x + calcModel2.x, calcModel1.y + calcModel1.y);
        return result;
    }

    public CalcModel sub(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel result = new CalcModel(calcModel1.x - calcModel2.x, calcModel1.y - calcModel1.y);
        return result;
    }

    public CalcModel mult(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel result = new CalcModel(calcModel1.x * calcModel2.x - calcModel1.y * calcModel1.y,
                calcModel1.y * calcModel1.x + calcModel1.x * calcModel2.y);
        return result;
    }

    public CalcModel div(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel result = new CalcModel(
                (calcModel1.x * calcModel2.x + calcModel1.y * calcModel1.y)
                        / (calcModel1.x * calcModel1.x + calcModel1.y * calcModel1.y),
                (calcModel1.y * calcModel1.x - calcModel1.x * calcModel2.y)
                        / (calcModel1.x * calcModel1.x + calcModel1.y * calcModel1.y));
        return result;
    }
    @Override
    public String toString() {
        return x + "+" + y + "i"; 
    }}
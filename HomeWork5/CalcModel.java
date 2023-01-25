public class CalcModel {
    private Integer x;
    private Integer y;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public CalcModel(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public CalcModel() {

    }

    public CalcModel sum(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel result = new CalcModel();
        return result;
    }

    public CalcModel sub(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel result = new CalcModel();
        return result;
    }

    public CalcModel mult(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel result = new CalcModel();
        return result;
    }

    public CalcModel div(CalcModel calcModel1, CalcModel calcModel2) {
        CalcModel result = new CalcModel();
        return result;
    }

    @Override
    public String toString() {
        return this.x + "+(/)" + this.y + "(i)";
    }
}

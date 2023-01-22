/**
 * Абстрактный класс реализует интерфейс 
 */
public class CalcModel{
    Integer x, y;

    public CalcModel( Integer x, Integer y) {
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
    return x + "+(/)" + y + "(i)"; 
}
}

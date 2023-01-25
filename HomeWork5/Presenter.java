import java.io.IOException;

public class Presenter {
    View view;
    LoggerClass log = new LoggerClass();
    public Presenter(View v) {
        view = v;
    }

    public void buttonClick (View v) throws IOException {

        CalcModel cm1 = view.userInput();
        CalcModel cm2 = view.userInput();

        Integer oper = view.getOper();

        if (view.choiceTypeNum() == 1) {
            Rational rational = new Rational();
            log.log("Пользователь выбрал рациональные числа");
            if (oper == 1) {
                log.log("Пользователь выбрал +");
                CalcModel cmSum = rational.sum(cm1, cm2);
                view.ptint(cmSum);
            } else if (oper == 2) {
                log.log("Пользователь выбрал -");
                CalcModel cmSum = rational.sub(cm1, cm2);
                view.ptint(cmSum);
            } else if (oper == 4) {
                log.log("Пользователь выбрал /");
                CalcModel cmSum = rational.div(cm1, cm2);
                view.ptint(cmSum);
            } else if (oper == 3) {
                log.log("Пользователь выбрал *");
                CalcModel cmSum = rational.mult(cm1, cm2);
                view.ptint(cmSum);
            }
        } else if (view.choiceTypeNum() == 2) {
            Comlex comlex = new Comlex();
            log.log("Пользователь выбрал комплексные числа");

            if (oper == 1) {
                log.log("Пользователь выбрал +");
                CalcModel cmComSum = comlex.sum(cm1, cm2);
                view.ptint(cmComSum);
            } else if (oper == 2) {
                log.log("Пользователь выбрал -");
                CalcModel cmComSum = comlex.sub(cm1, cm2);
                view.ptint(cmComSum);
            } else if (oper == 4) {
                log.log("Пользователь выбрал /");
                CalcModel cmComSum = comlex.div(cm1, cm2);
                view.ptint(cmComSum);
            } else if (oper == 3) {
                log.log("Пользователь выбрал *");
                CalcModel cmComSum = comlex.mult(cm1, cm2);
                view.ptint(cmComSum);
            }
        }
    }
}

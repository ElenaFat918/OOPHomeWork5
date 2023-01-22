public class Presenter {
    View view;

    public Presenter(View v) {
        view = v;
    }

    public void buttonClick(View v) {

        CalcModel cm1 = view.userInput();
        CalcModel cm2 = view.userInput();

        Integer oper = view.getOper();

        if (view.choiceTypeNum() == 1) {
            Rational rational = new Rational();
            if (oper == 1) {
                CalcModel cmSum = rational.sum(cm1, cm2);
                view.ptint(cmSum);
            } else if (oper == 2) {
                CalcModel cmSum = rational.sub(cm1, cm2);
                view.ptint(cmSum);
            } else if (oper == 4) {
                CalcModel cmSum = rational.div(cm1, cm2);
                view.ptint(cmSum);
            } else if (oper == 3) {
                CalcModel cmSum = rational.mult(cm1, cm2);
                view.ptint(cmSum);
            }
        } else if (view.choiceTypeNum() == 2) {
            Comlex comlex = new Comlex();
            if (oper == 1) {
                CalcModel cmComSum = comlex.sum(cm1, cm2);
                view.ptint(cmComSum);
            } else if (oper == 2) {
                CalcModel cmComSum = comlex.sub(cm1, cm2);
                view.ptint(cmComSum);
            } else if (oper == 4) {
                CalcModel cmComSum = comlex.div(cm1, cm2);
                view.ptint(cmComSum);
            } else if (oper == 3) {
                CalcModel cmComSum = comlex.mult(cm1, cm2);
                view.ptint(cmComSum);
            }
        }
    }
}

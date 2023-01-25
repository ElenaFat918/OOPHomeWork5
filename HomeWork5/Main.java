import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new View());
        try {
            presenter.buttonClick(new View());
        } catch (IOException e) {
            System.out.println("Такого пункта в меню нет");
            e.printStackTrace();
        }
    }
}

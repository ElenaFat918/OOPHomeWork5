import java.util.Scanner;

public class View {

	public Integer choiceTypeNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Вберите тип для ваших чисел: 1 -рациональное число, 2 -комплексное");
		int choice = scanner.nextInt();
		return choice;
	}

	public CalcModel userInput() {
		Scanner scanner = new Scanner(System.in);
		int choice = choiceTypeNum();
		CalcModel calcModel;

		if (choice == 1) {
			System.out.println(
					"Введите рациональное число в формате 1/2 : ");
			String userInput = scanner.nextLine();
			String[] temp;
			temp = userInput.split("/");
			calcModel = new CalcModel(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
			return calcModel;

		} else if (choice == 2) {
			System.out.println(
					"Введите комплексное число в формате 1+2i : ");
			String userInput = scanner.nextLine();
			String[] temp;
			temp = userInput.split("\\+");
			calcModel = new CalcModel(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
			return calcModel;

		} else
			throw new NullPointerException("Пользователь не найден");
	}

	public Integer getOper() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Вберите перацию с числами: 1 +, 2 -, 3 *, 4 / ");
		int ch = scanner.nextInt();
		return ch;
	}

	public void ptint(CalcModel calcModel) {
		System.out.println(calcModel);
	}
}
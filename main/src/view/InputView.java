package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static String[] inputNumbers() {
        OutputView.pleaseInput();
        return scanner.nextLine().split("");
    }
}

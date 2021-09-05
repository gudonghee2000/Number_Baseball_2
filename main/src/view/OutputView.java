package view;

public class OutputView {
    private OutputView() {
    }

    public static void pleaseInput() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void showBalls(int balls) {
        System.out.print(balls + "볼 ");
    }

    public static void showStrikes(int strikes) {
        System.out.print(strikes + "스트라이크");
    }

    public static void showNothing() {
        System.out.print("낫싱");
    }
}

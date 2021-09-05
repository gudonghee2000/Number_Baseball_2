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

    public static void showGameOver() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void restartGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}

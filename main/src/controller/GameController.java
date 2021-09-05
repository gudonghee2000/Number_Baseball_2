package controller;

import model.InputNumbers;
import utils.RandomUtil;
import model.AnswerNumbers;
import view.InputView;
import view.OutputView;

public class GameController {
    private GameController() {
    }

    public static void runGame() {
        boolean gameRestart = true;
        while (gameRestart) {
            playGame();
            gameRestart = restartGame(InputView.restartGame());
        }
    }

    private static void playGame() {
        AnswerNumbers answerNumbers = new AnswerNumbers(RandomUtil.createNumbers());
        while (true) {
            InputNumbers inputNumbers = new InputNumbers(InputView.inputNumbers());
            checkGameHint(answerNumbers.getBalls(inputNumbers), answerNumbers.getStrikes(inputNumbers));
            if (isGameOver(answerNumbers.getStrikes(inputNumbers))) {
                OutputView.showGameOver();
                break;
            }
        }
    }

    private static boolean isGameOver(int strikes) {
        if (strikes == 3) {
            return true;
        }
        return false;
    }

    private static void checkGameHint(int balls, int strikes) {
        if (balls > 0) {
            OutputView.showBalls(balls);
        }
        if (strikes > 0) {
            OutputView.showStrikes(strikes);
        }
        if (balls == 0 && strikes == 0) {
            OutputView.showNothing();
        }
        System.out.println();
    }

    private static boolean restartGame(String number) {
        if (number.matches("^[1]$")) {
            return true;
        }
        return false;
    }
}

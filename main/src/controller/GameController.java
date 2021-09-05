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
        boolean gameRestart = false;
        while (!gameRestart) {
            playGame();
        }
    }

    private static void playGame() {
        AnswerNumbers answerNumbers = new AnswerNumbers(RandomUtil.createNumbers());
        boolean gameFinish = false;
        while (!gameFinish) {
            InputNumbers inputNumbers = new InputNumbers(InputView.inputNumbers());
            checkGameHint(answerNumbers.getBalls(inputNumbers), answerNumbers.getStrikes(inputNumbers));
        }
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
}

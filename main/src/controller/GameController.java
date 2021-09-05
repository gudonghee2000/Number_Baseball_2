package controller;

import model.InputNumbers;
import utils.RandomUtil;
import model.AnswerNumbers;
import view.InputView;

public class GameController {
    private GameController() {
    }

    public static void runGame() {
        AnswerNumbers answerNumber = new AnswerNumbers(RandomUtil.createNumbers());
        boolean yes = false;
        while (!yes) {
            InputNumbers inputNumbers = new InputNumbers(InputView.inputNumbers());
        }
    }
}

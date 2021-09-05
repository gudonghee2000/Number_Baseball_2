package controller;

import utils.RandomUtil;
import model.AnswerNumbers;

public class GameController {
    private GameController() {
    }

    public static void runGame() {
        AnswerNumbers answerNumber = new AnswerNumbers(RandomUtil.createNumbers());
    }
}

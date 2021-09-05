package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnswerNumbers {
    private List<Baseball> numbers = new ArrayList<>();

    public AnswerNumbers(int[] numbers) {
        this.numbers = Arrays.stream(numbers).
                mapToObj(Baseball::new).
                collect(Collectors.toList());
    }
}

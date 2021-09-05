package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AnswerNumbers {
    private List<Baseball> numbers = new ArrayList<>();
    private final int MIN_SIZE = 0;
    private final int MAX_SIZE = 3;

    public AnswerNumbers(int[] numbers) {
        this.numbers = Arrays.stream(numbers).
                mapToObj(Baseball::new).
                collect(Collectors.toList());
    }

    public int getStrikes(InputNumbers inputNumbers) {
        return (int) IntStream.range(MIN_SIZE, MAX_SIZE).
                filter(index -> numbers.get(index).equals(inputNumbers.getInputNumbers().get(index))).
                count();
    }

    public int getBalls(InputNumbers inputNumbers) {
        return (int) IntStream.range(MIN_SIZE, MAX_SIZE).
                filter(index -> numbers.contains(inputNumbers.getInputNumbers().get(index))).
                filter(index -> !numbers.get(index).equals(inputNumbers.getInputNumbers().get(index))).
                count();
    }
}

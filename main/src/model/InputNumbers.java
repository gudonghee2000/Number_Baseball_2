package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputNumbers {
    private List<Baseball> numbers = new ArrayList<>();
    private static final int NUMBER_SIZE = 3;

    public InputNumbers(String[] numbers) {
        isValidationNumbers(numbers);
        this.numbers = Arrays.stream(numbers).map(Baseball::new).collect(Collectors.toList());
    }

    private static void isValidationNumbers(String[] numbers) {
        if (numbers.length != NUMBER_SIZE) {
            throw new IllegalArgumentException("입력한 숫자가 3개가 아닙니다.");
        }
        if (Arrays.stream(numbers).collect(Collectors.toSet()).size() != NUMBER_SIZE) {
            throw new IllegalArgumentException("입력한 숫자중 중복되는 숫자가 있습니다.");
        }
    }
}

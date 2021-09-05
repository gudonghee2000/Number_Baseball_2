package utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
    private static final Random random = new Random();
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private static final int MAX_SIZE = 3;

    private RandomUtil() {
    }

    private static int createNumber(int startNumber, int endNumber) {
        return random.nextInt(endNumber) + startNumber;
    }

    public static int[] createNumbers() {
        Set<Integer> numbers = new HashSet<>(3);

        while (numbers.size() < MAX_SIZE) {
            numbers.add(createNumber(MIN_NUMBER, MAX_NUMBER));
        }

        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }
}

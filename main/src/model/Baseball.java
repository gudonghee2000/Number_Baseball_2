package model;

public class Baseball {
    private int number;

    public Baseball(int number) {
        this.number = number;
    }

    public Baseball(String number) {
        isValidationNumber(number);
        this.number = Integer.parseInt(number);
    }

    private static void isValidationNumber(String number) {
        if (number.matches("^[^1-9]$")) {
            throw new IllegalArgumentException("입력한 숫자중 숫자가 아닌 것이 있습니다.");
        }
    }
}

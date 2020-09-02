package week2.Task1;

public class DigitsClass {
    private int digit1 = 1;
    private int digit2 = 2;

    public void info() {
        System.out.println("digit 1 = " + digit1 + ", digit 2 = " + digit2);
    }

    public void setDigits(int digit1, int digit2) {
        this.digit1 = digit1;
        this.digit2 = digit2;
    }

    public int sum() {
        return digit1 + digit2;
    }

    public int max(){
        return Math.max(digit1, digit2);
    }

}

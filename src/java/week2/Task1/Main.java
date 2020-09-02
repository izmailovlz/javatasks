package week2.Task1;

public class Main {
    public static void main(String[] args) {
        DigitsClass digitsClass = new DigitsClass();
        digitsClass.info();
        System.out.println("max = " + digitsClass.max());
        digitsClass.setDigits(10, 22);
        digitsClass.info();
        System.out.println("sum = " + digitsClass.sum());
    }
}

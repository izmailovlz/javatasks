package week2.Task5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arrLength = 20;
        int[] array = new int[arrLength];
        int max = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < arrLength; i++) {
            array[i] = (int) (Math.random() * 10+1);
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
            sum += array[i];
        }

        int average = sum / arrLength;

        System.out.println("Массив: " + Arrays.toString(array) + "\n"
                + "Максимальное значение " + max + "\n"
                + "Минимальное значение " + min + "\n"
                + "Среднее значение " + average);
    }
}

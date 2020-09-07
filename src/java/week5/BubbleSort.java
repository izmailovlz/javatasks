package week5;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] digits = new int[1000];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(digits));

        int count = 0;
        long start = System.currentTimeMillis();
        for (int k = digits.length - 1; k >= 0; k--) {
            for (int j = 0; j < k; j++) {
                if (digits[j] > digits[k]) {
                    int t = digits[j];
                    digits[j] = digits[k];
                    digits[k] = t;
                    count++;
                }
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println(Arrays.toString(digits) + "\nВремя: " + (stop - start) + "\nПерестановок: " + count);
    }
}

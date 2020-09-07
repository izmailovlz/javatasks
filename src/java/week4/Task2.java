package week4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        addElements(arrayList);
        addElements(linkedList);
        randomElement(arrayList);
        randomElement(linkedList);
    }

    public static void addElements(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
        System.out.println("Время добавления элементов в коллекцию: " + (System.currentTimeMillis() - start));
    }

    public static void randomElement(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            int random = (int) (Math.random() * (1_000_000));
            list.get(random);
        }
        System.out.println("Время выборки 100 тыс. элементов: " + (System.currentTimeMillis() - start));
    }
}

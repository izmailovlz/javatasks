package week4;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> objects = Arrays.asList(1, 2, 3, 1, 2, 1, 1, 1, 1, 1, 9, 4);
        Collection<Object> result = removeDuplicates(objects);
        System.out.println(result.toString()
        );
    }

    public static Collection<Object> removeDuplicates(List<Integer> collection) {
        TreeSet<Object> objects = new TreeSet<>(collection);
        return objects;
    }
}

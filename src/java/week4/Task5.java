package week4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(4,5,6,1,2,3,7));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,3,5,7,9));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(8,3,7,7,9));

        Set<Integer> union = union(set1, set2, set3);
        Set<Integer> intersection = intersection(set1, set2, set3);
        System.out.println(union + "\n" + intersection);

    }

    public static Set<Integer> union(Set<Integer>... set){
        Set<Integer> resultSet = new HashSet<>();
        for (int i=0; i< set.length; i++) {
            resultSet.addAll(set[i]);
        }
        return resultSet;
    }
    public static Set<Integer> intersection(Set<Integer>... set){
        Set<Integer> resultSet = new HashSet<>();
        resultSet.addAll(set[0]);
        for (int i=1; i< set.length; i++) {
            resultSet.retainAll(set[i]);
        }
        return resultSet;
    }

}

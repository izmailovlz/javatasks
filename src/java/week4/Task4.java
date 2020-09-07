package week4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{2,4,5,6,3,2,1,5,6,4,3,1,3,0};
        System.out.println(arrayToMap(array));
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks){
        HashMap<K, Integer> result = new HashMap<>();
        Arrays.sort(ks);
        int count =1;
        for (int i=0; i< ks.length-1; i++){
            if (ks[i+1] == ks [i]){
                count++;
                result.put(ks[i],count);
            } else {
                result.put(ks[i],count);
                count =1;
            }
        }

        return result;
    }
}

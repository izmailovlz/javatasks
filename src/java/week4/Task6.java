package week4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        HashMap<String, Product> map = new HashMap<>();
        map.put("ball", new Product("sport equipment"));
        map.put("tank", new Product("military equipment"));
        map.put("pen", new Product("office equipment"));
        map.put("gun", new Product("hunters equipment"));
        map.put("doll", new Product("girls toy"));
        printPairs(map);
        printProductNames(map);
        printProductValues(map);

    }

    //Перебрать и распечатать пары значений
    public static void printPairs(HashMap<String, Product> map) {
        for (Map.Entry<String, Product> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    //Перебрать и распечатать набор из имен продуктов
    public static void printProductNames(HashMap<String, Product> map) {
        for (String entry : map.keySet()) {
            System.out.println(entry);
        }
    }

    //Перебрать и распечатать значения продуктов - values()
    public static void printProductValues(HashMap<String, Product> map) {
        Collection<Product> values = map.values();
        for (Product entry : map.values()) {
            System.out.println(entry.getName());
        }
    }

    static class Product {
        private String name;

        public Product(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

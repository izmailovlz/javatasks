package week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Cоздать типизированный файл записей со сведениями о телефонах абонентов; каждая запись имеет поля:
 * фамилия абонента, год установки телефона, номер телефона. По заданной фамилии абонента выдать номера
 * его телефонов. Определить количество установленных телефонов с N-го года.
 */
public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files/abonents"));
        ArrayList<User> abonents = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(";");
            abonents.add(new User(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2])));
        }
        getPhNumbers(abonents, "petrov");
        countPhones(abonents, "petrov", 2000);
    }

    public static void getPhNumbers(List<User> list, String surname) {
        StringBuilder sb = new StringBuilder();
        for (User u : list) {
            if (u.getSurname().equals(surname)) {
                sb.append(u.getPhNum()+ " ");
            }
        }
        System.out.println("Абонент: " + surname + ". Номера телефонов: " + sb);
    }

    public static void countPhones(List<User> list, String surname, Integer year) {
        int count = 0;
        for (User u : list) {
            if (u.getSurname().equals(surname) && u.getPhYear() > year) {
                count++;
            }
        }
        System.out.println("Абонент: " + surname + ". Количество установленных телефонов с " + year
                + " года, " + count + " шт");
    }


    private static class User {
        private String surname;
        private int phYear;
        private int phNum;

        public User(String surname, int phYear, int phNum) {
            this.surname = surname;
            this.phYear = phYear;
            this.phNum = phNum;
        }

        public String getSurname() {
            return surname;
        }

        public int getPhYear() {
            return phYear;
        }

        public int getPhNum() {
            return phNum;
        }
    }
}

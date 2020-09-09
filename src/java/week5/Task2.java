package week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Считать данные с файла введеного пользователем, отсортировать и сохранить в другой файл
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Ввести слова через пробел");
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("files/fromUser");
        pw.println(scanner.nextLine());
        scanner.close();
        pw.close();

        Scanner scanner2 = new Scanner(new File("files/fromUser"));
        PrintWriter pw2 = new PrintWriter("files/sorted.txt");
        while (scanner2.hasNextLine()) {
            String[] string = scanner2.nextLine().split(" ");

            Arrays.sort(string);
            for (String s : string) {
                pw2.print(s + " ");
            }
        }
        scanner2.close();
        pw2.close();
    }
}

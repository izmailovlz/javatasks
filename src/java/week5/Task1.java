package week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Дан текстовый файл, содержащий целые числа. Удалить из него все четные числа.
public class Task1 {
    public static void main(String[] args) {
        File fileIn = new File("files/digits");
        File fileOut = new File("files/digisOUT");
        StringBuilder sb = new StringBuilder();

        try (
                Scanner scanner = new Scanner(fileIn);
                PrintWriter pw = new PrintWriter(fileOut)
        ) {
            while (scanner.hasNextLine()) {
                String[] str = scanner.nextLine().split("\\s");
                for (String s : str) {
                    if (Integer.parseInt(s) % 2 == 0) {
                        sb.append(s + " ");
                    }
                }
            }
            pw.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

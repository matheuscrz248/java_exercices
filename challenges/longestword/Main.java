package challenges.longestword;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Retorne a maior palavra
        Entrada / Saída
        "Java e Programacao" / "Programacao"
        */

        Scanner sc = new Scanner(System.in);

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            String[] sentence = in.split(" ");

            int count = sentence[0].length();
            String longestWord = sentence[0];
            for (String word : sentence) {
                if (word.length() > count) {
                    longestWord = word;
                }
            }

            System.out.println(longestWord);

        }
        sc.close();
    }
}

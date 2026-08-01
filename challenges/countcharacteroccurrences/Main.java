package challenges.countcharacteroccurrences;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Conte quantas vezes um caractere aparece
        Entrada / Saída
        "banana" "a" / "3"
        */

        Scanner sc = new Scanner(System.in);

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            String[] s = in.split(" ");

            String word = s[0];
            char letter = s[1].charAt(0);

            int countChar = 0;

            for (char c : word.toCharArray()) {
                if (c == letter) {
                    countChar++;
                }
            }

            System.out.println(countChar);

        }
        sc.close();
    }
}

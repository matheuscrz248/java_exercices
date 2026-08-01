package challenges.countvowels;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Conte o número de vogais
        "Abacate" / 4
        */

        Scanner sc = new Scanner(System.in);

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            int vowels = 0;
            for (char c : in.toCharArray()) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    vowels++;
                }
            }

            System.out.println("Vowels: " + vowels);

        }

        sc.close();
    }
}

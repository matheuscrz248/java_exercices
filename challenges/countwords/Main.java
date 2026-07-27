package challenges.countwords;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Conte o número de palavras.
        Entrada	/ Saída
        "Aprender Java é muito legal" / 5
        */

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            String[] words = in.split(" ");

            int total = words.length;

            System.out.println(total);

        }
    }
}

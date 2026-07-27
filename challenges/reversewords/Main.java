package challenges.reversewords;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Inverta a ordem das palavras.
        Entrada	/ Saída
        "Olá Mundo"	/ "Mundo Olá"
        */

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            String[] words = in.split(" ");

            int i2 = words.length;
            for (int i = 0; i < i2; i++) {
                i2--;

                String temp = words[i];
                words[i] = words[i2];
                words[i2] = temp;
            }

            System.out.println(String.join(" ", words));
        }
    }
}

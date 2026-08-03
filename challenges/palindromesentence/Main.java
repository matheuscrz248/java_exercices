package challenges.palindromesentence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Verifique se uma frase é palíndroma.
        Entrada	/ Saída
        "Ame a ema"	/ true
        */

        Scanner sc = new Scanner(System.in);

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            String sentence = in.replace(" ", "").toLowerCase();

            boolean isPalindrome = true;
            int i2 = sentence.length();
            for (int i = 0; i < i2; i++) {
                i2--;

                if (sentence.charAt(i) != sentence.charAt(i2)) {
                    isPalindrome = false;
                    break;
                }

            }

            System.out.println(isPalindrome);

        }
        sc.close();
    }
}

package challenges.palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Verifique se uma palavra ou número é palíndromo.
        Entrada	/ Saída
        121	/ true
        1234 / false
        */

        while (true) {

            boolean isPalindrome = true;

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            int i2 = in.length();
            for (int i = 0; i < i2; i++) {
                i2--;

                if (in.charAt(i) != in.charAt(i2)) {
                    isPalindrome = false;
                    break;
                }

            }

            System.out.println(isPalindrome);

        }
    }
}

package challenges.reverseinteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Inverta um número inteiro.
        Entrada	/ Saída
        123	/ 321
        */

        Scanner sc = new Scanner(System.in);

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            char[] ch = in.toCharArray();
            char temp;
            int i2 = ch.length;
            for (int i = 0; i < i2; i++) {
                i2--;

                temp = ch[i];
                ch[i] = ch[i2];
                ch[i2] = temp;
            }

            System.out.println(Integer.parseInt(new String(ch)));

        }
        sc.close();
    }
}

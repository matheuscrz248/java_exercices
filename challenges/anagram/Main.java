package challenges.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Verifique se duas palavras são anagramas.
        Entrada / Saída
        "amor", "roma" true
        "amor", "casa" false
        */

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            String[] words = in.split(" ");
            String word1 = words[0];
            String word2 = words[1];

            char[] c1 = word1.toCharArray();
            char[] c2 = word2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            boolean anagram = Arrays.equals(c1, c2);

            System.out.println(anagram);



        }
    }
}

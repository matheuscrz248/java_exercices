package challenges.mostcommomword;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        Retorne a palavra que mais aparece em uma frase (ignore maiúsculas/minúsculas).
        Entrada	/ Saída
        "Java é java" /	"java"
        */

        String text = "python java java c css";
        String[] words = text.toLowerCase().split(" ");
        Arrays.sort(words);

        String mcw = words[0];
        int maxCount = 1;
        int count = 1;

        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(words[i - 1])) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                mcw = words[i];
            }
        }

        System.out.println(mcw);

    }
}

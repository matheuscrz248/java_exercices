package challenges.asteriskpyramid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Imprima uma pirâmide com n níveis.
        Entrada	/ Saída
        3 / *, ***, *****
        */

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            int level = Integer.parseInt(in);
            int spaces = level;

            int ast = 1;
            for (int i = 1; i <= level; i++) {

                spaces--;

                System.out.println(" ".repeat(spaces) + "*".repeat(ast));

                ast += 2;

            }

        }
    }
}

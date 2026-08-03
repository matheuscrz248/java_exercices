package challenges.sumofeven;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Some apenas números pares.
        Entrada	/ Saída
        [1,2,3,4,6]	/ 12
        */

        Scanner sc = new Scanner(System.in);

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            int[] numbers = Arrays.stream(in.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int sum = 0;
            for (int n : numbers) {
                if (n % 2 == 0) {
                    sum += n;
                }
            }

            System.out.println(sum);

        }
        sc.close();
    }
}

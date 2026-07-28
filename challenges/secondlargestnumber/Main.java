package challenges.secondlargestnumber;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Retorne o segundo maior número de um array.
        Entrada	/ Saída
        [10, 5, 8, 20] / 10
        */

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            int[] numbers = Arrays.stream(in
                    .split(" "))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();

            System.out.println(numbers[numbers.length - 2]);
        }
    }
}

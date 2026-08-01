package challenges.removeduplicatesarray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Retorne apenas valores únicos
        Entrada / Saída
        [1,2,2,3,4,4,5] / [1,2,3,4,5]
        */

        Scanner sc = new Scanner(System.in);

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            int[] numbers = Arrays.stream(in.split(" "))
                    .mapToInt(Integer::parseInt)
                    .distinct()
                    .toArray();

            System.out.println(Arrays.toString(numbers));
        }

        sc.close();
    }
}

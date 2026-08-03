package challenges.gradeaverage;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Calcule a média e retorne o status.
        Entrada	/ Saída
        [7.0, 8.0, 6.0]	/ "Aprovado"
        */

        Scanner sc = new Scanner(System.in);

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            double[] grade = Arrays.stream(in.split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            double sum = 0;
            for (double g : grade) {
                sum += g;
            }

            if (sum / grade.length >= 7) {
                System.out.println("Approved");
            }
            else {
                System.out.println("Failed");
            }

        }
        sc.close();
    }
}

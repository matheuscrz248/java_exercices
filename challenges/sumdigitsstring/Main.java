package challenges.sumdigitsstring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Some os dígitos presentes em uma String.
        Entrada / Saída
        "a1b2c3" / 6
        */

        Scanner sc = new Scanner(System.in);

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            int sum = 0;
            for (char c : in.toCharArray()) {
                if (Character.isDigit(c)) {
                    sum += Character.getNumericValue(c);
                }
            }

            System.out.println(sum);

        }

        sc.close();
    }
}

package challenges.primenumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Verifique se o número é primo
        Entrada / Saída
        "7" / true
        */

        Scanner sc = new Scanner(System.in);

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            int number = Integer.parseInt(in);

            boolean isPrime = true;
            if (number > 1) {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            else {
                isPrime = false;
            }

            System.out.println(isPrime);

        }
        sc.close();
    }
}

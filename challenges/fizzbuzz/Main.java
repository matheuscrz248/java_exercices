package challenges.fizzbuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Imprima números de 1 até n seguindo as regras de FizzBuzz
        Entrada	/ Saída
        "15" / "1 2 Fizz 4 Buzz FizzBuzz"
        */

        Scanner sc = new Scanner(System.in);

        while (true) {

            String in = sc.nextLine();

            if (in.equals("stop")) {
                break;
            }

            int n = Integer.parseInt(in);


            for (int i = 1; i <= n; i++) {

                if ((i % 15) == 0) {
                    System.out.println("FizzBuzz");
                }
                else if ((i % 3) == 0) {
                    System.out.println("Fizz");
                }
                else if ((i % 5) == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }

            }

        }
        sc.close();
    }
}

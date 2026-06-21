package array.evennumbers;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers will you enter?");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        int[] number = new int[n];
        int totalEvenNumbers = 0;


        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            number[i] = scanner.nextInt();
            scanner.nextLine();

            if (number[i] % 2 == 0) {
                totalEvenNumbers++;
            }
        }


        int[] evenNumbers = new int[totalEvenNumbers];

        int evenNumbersIndex = 0;
        for (int i = 0; i < n; i++) {
            if (number[i] % 2 == 0) {
                evenNumbers[evenNumbersIndex] = number[i];
                evenNumbersIndex++;
            }

        }

        System.out.printf("Total even numbers: %d%n", totalEvenNumbers);

        System.out.println("Even numbers:");
        for (int i = 0; i < totalEvenNumbers; i++) {
            System.out.printf("%d ", evenNumbers[i]);
        }


        scanner.close();
    }
}

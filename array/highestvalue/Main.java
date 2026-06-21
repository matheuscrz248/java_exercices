package array.highestvalue;

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

        int[] numbers = new int[n];
        int highestValue;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int highestValueIndex = 0;
        highestValue = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > highestValue) {
                highestValue = numbers[i];
                highestValueIndex = i;
            }
        }

        System.out.printf("%nHighest value: %d%n", highestValue);
        System.out.printf("Highest value position: %d%n", highestValueIndex);

        scanner.close();
    }
}

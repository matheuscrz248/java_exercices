package array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to type:");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number:");
            vect[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\nNegative numbers:");

        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        System.out.println("\nPositive numbers:");

        for (int i = 0; i < n; i++) {
            if (vect[i] > 0) {
                System.out.println(vect[i]);
            }
        }

    }
}

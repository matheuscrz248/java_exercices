package array.sum;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers will you enter?");
        int n = scanner.nextInt();
        scanner.nextLine();

        double[] vect = new double[n];
        double vectSum = 0, vectMedia = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number: ");
            vect[i] = scanner.nextDouble();
            scanner.nextLine();

            vectSum += vect[i];
            vectMedia = vectSum / n;
        }

        System.out.printf("%nValues: ");

        for (int i = 0; i < n; i++) {
            System.out.print(vect[i] + " ");
        }

        System.out.printf("%nSum: %.1f%nMedia: %.1f%n", vectSum, vectMedia);

        scanner.close();
    }
}

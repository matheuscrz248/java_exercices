package array.heights;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people will be entered?");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        int underSixteenCount = 0;
        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        double heightsum = 0, averageheight, percentheight;

        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d data%n", i + 1);

            System.out.print("Name: ");
            name[i] = scanner.nextLine();

            System.out.print("Age: ");
            age[i] = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Height: ");
            height[i] = scanner.nextDouble();
            scanner.nextLine();

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            heightsum += height[i];

            if (age[i] < 16) {
                underSixteenCount++;
            }
        }

        String[] underSixteenName = new String[underSixteenCount];

        int underSixteenIndex = 0;
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                underSixteenName[underSixteenIndex] = name[i];
                underSixteenIndex++;
            }
        }

        averageheight = heightsum / n;
        percentheight = (underSixteenCount / (double) n) * 100;

        System.out.printf("Average height: %.2f", averageheight);
        System.out.printf("%nPeople under 16 years old: %.2f%%%n", percentheight);

        for (int i = 0; i < underSixteenCount; i++) {
            System.out.println(underSixteenName[i]);
        }

        scanner.close();
    }
}

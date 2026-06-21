package array.belowaverage;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos os elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many elements will the vector have?");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        double[] vector = new double[n];
        double vectorAverage, vectorTotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            vector[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            vectorTotal += vector[i];
        }

        vectorAverage = vectorTotal / n;

        System.out.printf("%nVector average: %.3f%n", vectorAverage);
        System.out.println("Elements below average: ");

        for (int i = 0; i < n; i++) {
            if (vector[i] < vectorAverage) {
                System.out.println(vector[i]);
            }
        }

        scanner.close();
    }
}

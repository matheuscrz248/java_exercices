package array.sum_vectors;

import java.util.Locale;
import java.util.Scanner;

// Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
// terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
// o vetor C gerado.

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many values will each vector have?");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        int[] vectorC = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the values of vector A: ");
            vectorA[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the values of vector B: ");
            vectorB[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        System.out.printf("%nResulting vector:%n");
        for (int i = 0; i < n; i++) {
            System.out.println(vectorC[i]);
        }



        scanner.close();
    }
}

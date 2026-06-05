package array.even_average;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NÚMERO PAR"

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many elements will the vector have?");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        int[] vector = new int[n];
        double evenAverage, evenCount = 0, evenSum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            vector[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            if (vector[i] % 2 == 0) {
                evenSum += vector[i];
                evenCount++;
            }
        }

        evenAverage = evenSum / evenCount;

        if (evenCount > 0) {
            System.out.printf("%nEven average: %.1f%n", evenAverage);
        }
        else {
            System.out.printf("%nNO EVEN NUMBER");
        }

        scanner.close();
    }
}

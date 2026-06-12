package matrix.matrix1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the matrix size:");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[n][n];

        System.out.println("\nEnter the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nMain diagonal: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", matrix[i][i]);
        }

        scanner.close();
    }
}

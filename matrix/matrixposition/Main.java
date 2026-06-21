package matrix.matrixposition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("\nEnter the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nEnter a matrix element:");
        int position = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == position) {
                    System.out.printf("%nPosition %d,%d:%n", i, j);

                    if ((j - 1) >= 0) {
                        System.out.printf("Left: %d%n", matrix[i][j - 1]);
                    }
                    if ((j + 1) <= n - 1) {
                        System.out.printf("Right: %d%n", matrix[i][j + 1]);
                    }
                    if ((i - 1) >= 0) {
                        System.out.printf("Up: %d%n", matrix[i - 1][j]);
                    }
                    if ((i + 1) <= m - 1) {
                        System.out.printf("Down: %d%n", matrix[i + 1][j]);
                    }

                }
            }
        }
        scanner.close();
    }
}

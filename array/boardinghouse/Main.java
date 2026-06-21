package array.boardinghouse;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int totalRooms = 10;

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] name = new String[totalRooms];
        String[] email = new String[totalRooms];
        boolean[] occupied = new boolean[totalRooms];

        for (int i = 0; i < n; i++) {
            int roomIndex = -1;

            System.out.printf("%nRent #%d%n", i + 1);

            System.out.print("Name: ");
            String nameAux = scanner.nextLine();

            System.out.print("Email: ");
            String emailAux = scanner.nextLine();

            int aux;
            do {
                System.out.print("Room: ");
                aux = scanner.nextInt();
                scanner.nextLine();

                if (aux < 0 || aux > (totalRooms - 1)) {
                    System.out.println("This room does not exist!\n");
                } else {
                    roomIndex = aux;
                    if (occupied[roomIndex]) {
                        System.out.println("The chosen room is already occupied, choose another one!\n");
                    }
                }

            } while (roomIndex == -1 || occupied[roomIndex]);

            occupied[roomIndex] = true;
            name[roomIndex] = nameAux;
            email[roomIndex] = emailAux;
        }

        System.out.println("\nBusy rooms:");

        for (int i = 0; i < totalRooms; i++) {
            if (occupied[i]) {
                System.out.printf("%d: %s, %s%n", i, name[i], email[i]);
            }
        }

        scanner.close();
    }
}
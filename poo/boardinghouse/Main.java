package poo.boardinghouse;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int totalRooms = 10;

        Rent[] vect = new Rent[totalRooms];

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.printf("%nRent #%d%n", i + 1);

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            int roomNumber;
            do {
                System.out.print("Room: ");
                roomNumber = scanner.nextInt();
                scanner.nextLine();

                if (roomNumber < 0 || roomNumber > (totalRooms - 1)) {
                    System.out.println("This room does not exist!\n");
                } else {
                    if (vect[roomNumber] != null) {
                        System.out.println("The chosen room is already occupied, choose another one!\n");
                    }
                }

            } while (roomNumber < 0 || roomNumber > (totalRooms - 1) || vect[roomNumber] != null);

            vect[roomNumber] = new Rent(name, email, roomNumber);

        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i <= (totalRooms -1); i++) {
            if (vect[i] != null) {
                System.out.println(vect[i]);
            }
        }

    }
}

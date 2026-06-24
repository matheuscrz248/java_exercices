package poo.ordersummary.application;

import poo.ordersummary.model.entities.Client;
import poo.ordersummary.model.entities.Order;
import poo.ordersummary.model.entities.OrderItem;
import poo.ordersummary.model.entities.Product;
import poo.ordersummary.model.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Birthdate (DD/MM/YYYY): ");
        String birthdate = scanner.nextLine();

        Client client = new Client(name, email, LocalDate.parse(birthdate, fmt));

        System.out.println("\nEnter order data");
        System.out.print("Status: ");
        String status = scanner.nextLine();

        LocalDateTime now = LocalDateTime.now();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

        System.out.print("\nHow many items to this order? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int quantity = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("%nEnter #%d item data%n", i + 1);
            System.out.print("Product name: ");
            String productName = scanner.nextLine();

            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            quantity = scanner.nextInt();
            scanner.nextLine();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);

        scanner.close();
    }
}

package poo.emailsms.application;

import java.util.Locale;
import java.util.Scanner;
import poo.emailsms.entities.Order;
import poo.emailsms.services.EmailService;
import poo.emailsms.services.NotificationService;
import poo.emailsms.services.OrderService;
import poo.emailsms.services.SmsService;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Customer: ");
        String customer = sc.nextLine();

        System.out.print("Product: ");
        String product = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        Order order = new Order(customer, product, price);

        System.out.println("\nSms or email:");
        String option = sc.nextLine();
        System.out.println();


        NotificationService notification;

        if (option.equalsIgnoreCase("email")) {
            notification = new EmailService();
        } else if (option.equalsIgnoreCase("sms")) {
            notification = new SmsService();
        } else {
            System.out.println("Invalid option!");
            return;
        }

        OrderService orderService = new OrderService(notification);
        orderService.processOrder(order);

    }
}

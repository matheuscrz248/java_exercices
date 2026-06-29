package poo.usedproduct.application;

import poo.usedproduct.entities.ImportedProduct;
import poo.usedproduct.entities.Product;
import poo.usedproduct.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Product> productsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("%nProduct #%d data%n", i + 1);
            System.out.print("Common, used or imported (c/u/i)? ");
            String s = scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            double productType;
            switch (s) {
                case "c" -> {

                    Product product = new Product(name, price);
                    productsList.add(product);

                }
                case "u" -> {

                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String date = scanner.nextLine();

                    LocalDate dateParsed = LocalDate.parse(date, fmt);

                    Product product = new UsedProduct(name, price, dateParsed);

                    productsList.add(product);
                }
                case "i" -> {
                    System.out.print("Customs fee: ");
                    double customsFee = scanner.nextDouble();
                    scanner.nextLine();

                    Product product = new ImportedProduct(name, price, customsFee);

                    productsList.add(product);
                }
            }

        }

        System.out.println("\nPRICE TAGS:");

        for (Product product : productsList) {
            System.out.println(product.priceTag());
        }

    }
}


package poo.individualcompany.application;

import poo.individualcompany.entities.CompanyTaxpayer;
import poo.individualcompany.entities.IndividualTaxpayer;
import poo.individualcompany.entities.Taxpayer;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Taxpayer> taxpayerList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("%nTax payer #%d data:%n", i + 1);

            System.out.print("Individual or company (i/c)? ");
            String choice = scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = scanner.nextDouble();
            scanner.nextLine();

            if (choice.equals("i")) {
                System.out.print("Health expenditures: ");
                double healthExp = scanner.nextDouble();
                scanner.nextLine();

                Taxpayer taxpayer = new IndividualTaxpayer(name, anualIncome, healthExp);
                taxpayerList.add(taxpayer);
            }
            else if (choice.equals("c")) {
                System.out.print("Number of employees: ");
                int employeesNumber = scanner.nextInt();
                scanner.nextLine();

                Taxpayer taxpayer = new CompanyTaxpayer(name, anualIncome, employeesNumber);
                taxpayerList.add(taxpayer);
            }
            else {
                System.out.println("Error");
            }

        }

        System.out.println("\nTAXES PAID");
        for (Taxpayer tp : taxpayerList) {
            System.out.printf("%s: $ %.2f%n", tp.getName(), tp.calculateTax());
        }

        double totalTaxes = 0;
        for (Taxpayer tp : taxpayerList) {
            totalTaxes += tp.calculateTax();
        }

        System.out.printf("%nTOTAL TAXES: $ %.2f", totalTaxes);



    }
}

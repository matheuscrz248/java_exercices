package poo.contractprocessing.application;

import poo.contractprocessing.entities.Contract;
import poo.contractprocessing.entities.Installment;
import poo.contractprocessing.services.ContractService;
import poo.contractprocessing.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the details of contract");

        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.print("Contract amount: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("\nEnter the number of installments: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);

        System.out.println("\nInstallments: ");

        for (Installment i : contract.getInstallments()) {
            System.out.println(i);
        }

        sc.close();

    }
}

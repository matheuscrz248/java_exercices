package poo.banksystem.application;

import poo.banksystem.entities.Account;
import poo.banksystem.services.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Customer name: ");
        String name = sc.nextLine();

        Account account = new Account(name, 0.0);

        String in;
        System.out.println("\n(Enter 'exit' to stop program)");


        OperationProcess operationChoice = new OperationProcess();
        while (true) {

            System.out.printf("%nBalance: $%.2f%n", account.getBalance());
            System.out.println("Operation type (choose the number):");
            System.out.println("1 - Withdrawal");
            System.out.println("2 - Deposit");
            System.out.println("3 - Loan");
            System.out.println("4 - Print history");
            in = sc.nextLine();

            if (in.equals("exit")) {
                break;
            }

            int n = Integer.parseInt(in);

            String operation;
            switch (n) {
                case 1:
                    operationChoice.setOperationProcess(new Withdrawal());
                    operation = "Withdrawl";
                    break;
                case 2:
                    operationChoice.setOperationProcess(new Deposit());
                    operation = "Deposit";
                    break;
                case 3:
                    operationChoice.setOperationProcess(new Loan());
                    operation = "Loan";
                    break;
                case 4:
                    account.printHistory();
                    continue;

                default:
                    System.out.println("Invalid option!");
                    continue;
            }

            System.out.print("\n" + operation + " amount: $ ");
            double amount = sc.nextDouble();
            sc.nextLine();

            operationChoice.process(amount, account);

        }
    }
}

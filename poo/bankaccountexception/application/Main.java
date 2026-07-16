package poo.bankaccountexception.application;

import poo.bankaccountexception.entities.Account;
import poo.bankaccountexception.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        sc.nextLine();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.print("\nEnter amount for withdraw: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        try {
            acc.withdraw(amount);
            System.out.printf("New balance: %.2f%n", acc.getBalance());
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

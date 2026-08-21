package poo.banksystem.services;

import poo.banksystem.entities.Account;

public interface OperationService {

    double paymentFee(Double amount);

    void process(Double amount, Account account);

    double amountProcessed();

    default void printReceipt(String operation, double fee, double amountProcessed) {
        System.out.println(operation + " completed!");
        System.out.printf("Fee paid: $%.2f%n", fee);
        System.out.printf("Amount processed: $%.2f%n", amountProcessed);
    }
}

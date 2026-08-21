package poo.banksystem.services;

import poo.banksystem.entities.Account;

public class Withdrawal implements OperationService {

    private static final double FEE_PERCENTAGE = 0.05;
    private double amountProcessed;

    @Override
    public double paymentFee(Double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public void process(Double amount, Account account) {

        if (amount <= account.getBalance() && amount > 0) {
            amountProcessed = amount - paymentFee(amount);
            account.setBalance(account.getBalance() - amountProcessed);
            printReceipt("Withdrawal", paymentFee(amount), amountProcessed);
        }
        else {
            if (amount <= 0) {
                System.out.println("Invalid value");
            }
            else {
                System.out.println("Insufficient funds");
            }
        }

    }

    @Override
    public double amountProcessed() {
        return amountProcessed;
    }

}

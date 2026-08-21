package poo.banksystem.services;

import poo.banksystem.entities.Account;

public class Deposit implements OperationService {

    private static final double FEE_PERCENTAGE = 0.03;
    private double amountProcessed;

    @Override
    public double paymentFee(Double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public void process(Double amount, Account account) {

        if (amount > 0) {
            amountProcessed = amount - paymentFee(amount);
            account.setBalance(account.getBalance() + amountProcessed);
            printReceipt("Deposit", paymentFee(amount), amountProcessed);
        }
        else {
            System.out.println("Invalid value!");
        }

    }

    @Override
    public double amountProcessed() {
        return amountProcessed;
    }

}

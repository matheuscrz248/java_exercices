package poo.banksystem.services;

import poo.banksystem.entities.Account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OperationProcess {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private OperationService operationService;

    public OperationProcess() {
    }

    public void setOperationProcess(OperationService operationService) {
        this.operationService = operationService;
    }

    public void process(Double amount, Account account) {
        operationService.process(amount, account);
        account.addHistory(operationService.getClass().getSimpleName() + " - " + LocalDateTime.now().format(fmt) + "\n"
                + "Amount: $ " + String.format("%.2f", amount) + "\n"
                + "Fee paid: $ " + String.format("%.2f", operationService.paymentFee(amount)) + "\n"
                + "Amount processed: $ " + String.format("%.2f", operationService.amountProcessed()) + "\n"
                + "New balance: $ " + String.format("%.2f", account.getBalance()));
    }

}

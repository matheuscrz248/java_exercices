package poo.banksystem.entities;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String name;
    private Double balance;
    List<String> historyList = new ArrayList<>();

    public Account(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void addHistory(String entry) {
        historyList.add(entry);
    }

    public void printHistory() {
        System.out.println("\nOperation history:");

        for (String h : historyList) {
            System.out.println("\n===================================");
            System.out.println(h);
            System.out.println("===================================");
        }

    }


}

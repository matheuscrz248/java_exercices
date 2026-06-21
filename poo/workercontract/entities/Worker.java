package poo.workercontract.entities;

import poo.workercontract.entitiesenums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private final List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(int index) {
        contracts.remove(index);
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void showContracts() {
        for (int i = 0; i < contracts.size(); i++) {
            System.out.println("\n========= Contract #" + (i + 1) + " =========");
            System.out.println(contracts.get(i));
        }
    }

    public boolean hasContractsInMonth(int year, int month) {

        for (HourContract c : contracts) {
            if (c.getDate().getYear() == year && c.getDate().getMonthValue() == month) {
                return true;
            }
        }

        return false;
    }

    public double income(int year, int month) {
        double sum = baseSalary;


        for (HourContract c : contracts) {
            if (c.getDate().getYear() == year && c.getDate().getMonthValue() == month) {

                sum += c.totalValue();
            }
        }

        return sum;
    }

    @Override
    public String toString() {
        return "\n========= Worker =========" +
                "\nName: " + name +
                "\nLevel: " + level +
                "\nBase salary: " + baseSalary +
                "\n==========================";
    }
}

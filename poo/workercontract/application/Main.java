package poo.workercontract.application;

import poo.workercontract.entities.Department;
import poo.workercontract.entities.HourContract;
import poo.workercontract.entities.Worker;
import poo.workercontract.entitiesenums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();

        Department department = new Department(departmentName);

        System.out.println("\n======== Worker data ========");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();

        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("=============================\n");

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, department);

        System.out.print("How many contracts for this worker? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.printf("%n======== Contract #%d data ========%n", i + 1);

            System.out.print("Date (DD/MM/YYYY): ");
            String date = scanner.nextLine();

            System.out.print("Value per hour: ");
            Double valuePerHour = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Duration (hours): ");
            Integer hours = scanner.nextInt();
            scanner.nextLine();

            System.out.println("==================================");

            LocalDate dateParsed = LocalDate.parse(date, fmt);

            HourContract contract = new HourContract(dateParsed, hours, valuePerHour);

            worker.addContract(contract);
        }

        worker.showContracts();

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthYear = scanner.nextLine();
        String[] parts = monthYear.split("/");

        int month = Integer.parseInt(parts[0]);
        int year = Integer.parseInt(parts[1]);

        System.out.printf("%nName: %s", worker.getName());
        System.out.printf("%nDepartment: %s", departmentName);

        if (worker.hasContractsInMonth(year, month)) {
            System.out.printf("%nBase salary: $ %.2f%nIncome for %s: $ %.2f%n", worker.getBaseSalary(), monthYear, worker.income(year, month));

        }
        else {
            System.out.printf("%nBase salary: $ %.2f%nThere are no contracts for %s.", worker.getBaseSalary(), monthYear);
        }

    }
}

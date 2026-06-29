package poo.outsourcedemployee.application;

import poo.outsourcedemployee.entities.Employee;
import poo.outsourcedemployee.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("%nEmployee #%d data%n", i + 1);
            System.out.print("Outsourced (y/n)? ");
            String s = scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            scanner.nextLine();

            double additionalCharge;
            if (s.equals("y")) {

                System.out.print("Additional charge: ");
                additionalCharge = scanner.nextDouble();
                scanner.nextLine();

                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employeeList.add(employee);

            } else if (s.equals("n")) {

                Employee employee = new Employee(name, hours, valuePerHour);
                employeeList.add(employee);

            }

        }

        System.out.println("\nPAYMENTS:");

        for (Employee emp : employeeList) {
            System.out.println(emp.getName() + " - $ " + emp.payment());
        }

    }
}

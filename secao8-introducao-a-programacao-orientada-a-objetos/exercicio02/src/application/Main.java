package application;


import entities.Employee;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Olá, seja bem vindo!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Salário bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Desconto: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.print("Qual percentual aumentar o salário? (%): ");
        employee.increaseSalary(sc.nextDouble());

        System.out.println(employee);

        sc.close();
    }


}
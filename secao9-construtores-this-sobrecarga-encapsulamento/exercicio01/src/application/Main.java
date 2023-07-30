package application;


import entities.Account;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, welcome to thgomesdev bank!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Want to make inital deposit (y/n)?:");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, name, initialDeposit);
        }else {
            account = new Account(number, name);
        }


        System.out.println("Account data:");
        System.out.println(account.toString());

        double amount;

        System.out.print("Enter a deposit value: ");
        amount = sc.nextDouble();
        account.depositAmount(amount);

        System.out.println("Updated account data:");
        System.out.println(account.toString());

        System.out.print("Enter a withdraw value: ");
       amount = sc.nextDouble();
        account.withdrawAmount(amount);

        System.out.println("Updated account data:");
        System.out.println(account.toString());

        sc.close();
    }


}
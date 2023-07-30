package application;


import entities.CurrencyConverter;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do dolar ?: ");
        double price = sc.nextDouble();
        System.out.print("Quantos doláres você vai comprar?: ");
        int quantity = sc.nextInt();

        System.out.printf("Total a ser pago em reais: %.2f", CurrencyConverter.finalPrice(price,quantity));

        sc.close();
    }


}
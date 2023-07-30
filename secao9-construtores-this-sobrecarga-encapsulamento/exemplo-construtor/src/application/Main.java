package application;


import entities.Product;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Olá, seja bem vindo!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as informações do produto:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println(product);

        System.out.print("Insira o número de produtos a serem adicionados no estoque: ");
        product.addProducts(sc.nextInt());

        System.out.print("Insira o número de produtos a serem removidos no estoque: ");
        product.removeProducts(sc.nextInt());


        sc.close();
    }


}
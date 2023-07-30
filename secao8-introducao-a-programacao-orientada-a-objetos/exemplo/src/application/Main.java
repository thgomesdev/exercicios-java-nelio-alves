package application;


import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Olá, seja bem vindo!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Insira as informações do produto:");
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Preço: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade: ");
        product.quantity = sc.nextInt();

        System.out.println(product);

        System.out.print("Insira o número de produtos a serem adicionados no estoque: ");
        product.addProducts(sc.nextInt());

        System.out.print("Insira o número de produtos a serem removidos no estoque: ");
        product.removeProducts(sc.nextInt());


        sc.close();
    }


}
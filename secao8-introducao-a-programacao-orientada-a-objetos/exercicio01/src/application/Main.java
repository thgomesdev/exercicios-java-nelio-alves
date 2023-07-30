package application;


import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Olá, seja bem vindo!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Insira a largura e altura do retângulo:");
        rectangle.width = sc.nextInt();
        rectangle.height = sc.nextInt();

        System.out.println(rectangle);

        sc.close();
    }


}
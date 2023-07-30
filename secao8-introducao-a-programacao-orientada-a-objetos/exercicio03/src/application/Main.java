package application;


import entities.Student;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Olá, seja bem vindo!");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Nome: ");
        student.name = sc.nextLine();
        System.out.print("N1: ");
        student.n1 = sc.nextInt();
        System.out.print("N2: ");
        student.n2 = sc.nextInt();
        System.out.print("N3: ");
        student.n3 = sc.nextInt();

        System.out.printf("NOTA FINAL = %.2f%n", student.calculateGrade());

        if (student.grade < 60.0){
            System.out.println("REPROVADO");
            System.out.printf("FALTARAM %.2f PONTOS", student.missing);
        }else{
            System.out.println("APROVADO!");
        }

        sc.close();
    }


}
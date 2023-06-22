import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// EXERCÍCIO 05
		
		System.out.printf("EXERCÍCIO 05 - Insira o código de uma peça, o número de uma peça e o valor unitário da mesma, faça isso duas vezes: %n");
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, num1, cod2, num2;
		double valor1, valor2;
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		sc.nextLine();
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();
				
		double total = (num1 * valor1) + (num2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		sc.close();
	}

}

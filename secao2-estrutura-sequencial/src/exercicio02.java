import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// EXERCÍCIO 02
		
		System.out.printf("EXERCÍCIO 02 - Insira o valor do raio de um círculo: %n");
		
		Scanner sc = new Scanner(System.in);
		
		double pi, area;
		
		pi = 3.14159;
		area = pi * Math.pow(sc.nextInt(), 2);
		
		
		System.out.printf("O valor da área é %.4f %n", area);
		
		sc.close();
	}

}

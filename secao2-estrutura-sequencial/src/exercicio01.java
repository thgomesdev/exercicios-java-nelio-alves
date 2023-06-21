import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// EXERCÍCIO 01
		
		System.out.printf("EXERCÍCIO 01 - Insira dois valores para soma: %n");
		
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("O resultado é " + (x + y));
		
		sc.close();
	}

}

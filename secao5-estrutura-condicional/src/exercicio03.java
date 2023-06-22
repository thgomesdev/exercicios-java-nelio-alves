import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// EXERCÍCIO 03
		
		System.out.printf("EXERCÍCIO 03 - Insira dois números inteiros: %n");
				
		int A, B;
				
		A = sc.nextInt();
		B = sc.nextInt();
				
		if((A % B) == 0 || (B % A) == 0) {
			System.out.printf("SÃO MULTIPLOS! %n");
		} else {
			System.out.printf("NÃO SÃO MULTIPLOS! %n");
		}
				
		sc.close();
		
	}

}

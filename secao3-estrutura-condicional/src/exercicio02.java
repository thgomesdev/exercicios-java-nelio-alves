import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// EXERCÍCIO 02
			
		System.out.printf("EXERCÍCIO 02 - Insira um número inteiro: %n");
		
		int inteiro;
		
		inteiro = sc.nextInt();
		
		if((inteiro % 2) == 0) {
			System.out.printf("PAR %n");
		}else {
			System.out.printf("IMPAR %n");
		}
				
		sc.close();
		
	}

}

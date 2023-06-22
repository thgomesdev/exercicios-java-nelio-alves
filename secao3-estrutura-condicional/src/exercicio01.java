import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// EXERCÍCIO 01
		
		System.out.printf("EXERCÍCIO 01 - Insira um número inteiro: %n");
		
		int inteiro;
		
		inteiro = sc.nextInt();
		
		if(inteiro < 0) {
			System.out.printf("NEGATIVO %n");
		}else {
			System.out.printf("NÃO NEGATIVO %n");
		}
				
		sc.close();
		
	}

}

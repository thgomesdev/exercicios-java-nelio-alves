import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// EXERCÍCIO 03
		
		System.out.printf("EXERCÍCIO 03 - Insira quatro valores inteiros: %n");
		
		Scanner sc = new Scanner(System.in);
				
		int A, B, C, D, diferenca;
				
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		diferenca = (A * B - C * D);
						
		System.out.printf("A diferença do produto de A e B pelo produto de C e D é: %d %n", diferenca);
		
		sc.close();
	}

}

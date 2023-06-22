import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// EXERCÍCIO 05
		
		System.out.printf("EXERCÍCIO 05 - Insira o código e quantidade do item: %n"
							+ "|  1  |  Cachorro Quente  |  R$4.00  | %n" 
							+ "|  2  |      X-Salada     |  R$4.50  | %n"
							+ "|  3  |      X-Bacon      |  R$5.00  | %n" 
							+ "|  4  |  Torrada Simples  |  R$2.00  | %n"
							+ "|  5  |    Refrigerante   |  R$1.50  | %n");
		
		int codigo, quantidade;
				
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		
		double total;
		
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
				
		sc.close();
		
	}

}

import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Insira o código do combustível");
		int tipo = sc.nextInt();
		
		int gasolina = 0, alcool = 0, diesel = 0;
		
		while(tipo != 4) {
			if(tipo == 1) {
				alcool += 1;
			}else if (tipo == 2) {
				gasolina += 1;
			}else if (tipo == 3) {
				diesel += 1;
			}else {
				System.out.println("Código inválido!");
			}	
			
			System.out.println("Insira o código do combustível");
			tipo = sc.nextInt();
		}
		
		System.out.printf("MUITO OBRIGADO! %n Alcool: %d %n Gasolina: %d %n Diesel: %d", alcool, gasolina, diesel);
				
		sc.close();
		
	}

}

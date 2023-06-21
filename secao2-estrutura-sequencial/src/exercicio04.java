import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// EXERCÍCIO 04
		
		System.out.printf("EXERCÍCIO 04 - Insira seu número de funcionário, horas trabalhadas e valor que recebe por hora: %n");
		
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorHora;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		double salario = horas * valorHora;
		
		System.out.printf("NUMBER = %d %nSALARY = U$ %.2f %n", numero, salario);
		
		sc.close();
	}

}

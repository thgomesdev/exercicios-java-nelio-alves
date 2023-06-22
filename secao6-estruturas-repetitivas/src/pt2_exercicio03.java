import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class pt2_exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um inteiro:");
		int N = sc.nextInt();

		for(int i = 1; i <= N; i++) {
			System.out.println("Insira 3 números com casas decimais:");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();

			double total = x * 2.0 + y * 3.0 + z * 5.0 / 10.0;
			System.out.printf("Resultado: %.2f %n", total);
		}
		sc.close();

	}

}

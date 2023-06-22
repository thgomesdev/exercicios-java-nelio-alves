import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class pt2_exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um inteiro:");
		int N = sc.nextInt();

		System.out.printf("Insira %d números inteiros: %n", N);

		int in = 0, out = 0;
		for(int i = 1; i <= N; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <= 20 ){
				in += 1;
			}else{
				out += 1;
			}
		}

		System.out.printf("%d in %n%d out", in, out);

		sc.close();

	}

}

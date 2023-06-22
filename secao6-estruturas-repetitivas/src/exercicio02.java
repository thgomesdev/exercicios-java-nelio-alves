import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insira dois números:");		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("PRIMEIRO QUADRANTE!");
			}else if (x < 0 && y > 0) {
				System.out.println("SEGUNDO QUADRANTE!");
			}else if (x < 0 && y < 0) {
				System.out.println("TERCEIRO QUADRANTE!");
			}else {
				System.out.println("QUARTO QUADRANTE!");
			}	
			
			System.out.println("Insira dois números novamente:");	
			x = sc.nextInt();
			y = sc.nextInt();
		}
				
		sc.close();
		
	}

}

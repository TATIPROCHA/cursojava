import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
	
		
		int soma = numero1  + numero2;
				
		System.out.println("SOMA = "+ soma);
		
		sc.close();
		
		
		
	}

}

import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
 
		String x; 
		int y;
		double w;
		//char z;
		x = sc.next();
		y = sc.nextInt();
		w = sc.nextDouble();
		//z = sc.next().charAt(0);
		
		//System.out.println("Você digitou o valor: " + x);
		//System.out.println("Você digitou o valor: " + y);
		//System.out.printf("Você digitou o valor: %.2f%n" , w);		
		//System.out.printf("Você digitou o valor:" +	 z);
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(w);
	



		
		
		sc.close();
	}

}

import java.util.Locale;
import java.util.Scanner;

public class IntervaloNumero {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	

		double numero = sc.nextDouble();

		if (numero < 0.0 || numero > 100.0) {
			System.out.println("FORA DO INTERVALO");
		} 
		else if (numero <= 25.0) {
			System.out.println("INTERVALO [0,25]");

		} 
		else if (numero <= 50.0) {
			System.out.println("INTERVALO [25,50]");

		} 
		else if (numero <= 75.0) {
			System.out.println("INTERVALO [50,75]");
		} 
		else {
			System.out.println("INTERVALO [75,100]");

		}

		sc.close();

	}

}

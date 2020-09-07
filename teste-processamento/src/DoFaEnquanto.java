import java.util.Locale;
import java.util.Scanner;

public class DoFaEnquanto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
	
		char resp;
		
	do {
			System.out.print("DIGITE A TEMPERATURA EM CELSIUS : ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("EQUIVALENTE EM FAHRENHEIT  :%.2f%n ", F);
			System.out.print("Deseja repetir (s/n) : ");
			resp = sc.next().charAt(0);
				} while (resp != 'n');
	{
			sc.close();

		}
		
		
	}

}

import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		
		if(numero % 2 ==0) {

			System.out.println("Número é PAR");
		} else {
			System.out.println("Número é IMPAR");
		}
		
		
		sc.close();
	}

}

import java.util.Scanner;

public class WhileExercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != y) {
			if (x < y) {
				System.out.println("CRESCENTE");
				
			} else {
				System.out.println("DECRESCENTE");

			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		
		
		
		sc.close();
		
	}

}

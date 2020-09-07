import java.util.Scanner;

public class ForTesteMesa6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x = 8; 
		int y = 3; 
		for (int i=0; y<x; i++){ 
			x = x - 2; y = y + 1; 
			System.out.println(i);
		}
		
		sc.close();


	}

}

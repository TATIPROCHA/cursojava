import java.util.Scanner;

public class ForTesteMesa1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int x = 4; 
		int y = x + 2; 
		
		for (int i=0; i<x; i++)
		
		{ System.out.print(x+" "+y);
		
		y = y + i; }

	
		sc.close();
	}
	
	
	

}

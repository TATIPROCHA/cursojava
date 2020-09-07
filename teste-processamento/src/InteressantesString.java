
public class InteressantesString {

	public static void main(String[] args) {

		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		//converter para letra minuscula 
		String s01 = original.toLowerCase();
		//converter para letra maiuscula
		String s02 = original.toUpperCase();
		//elimina espaço no canto da string
		String s03 = original.trim();
		//imprimir a partir da posicao que solicitei 
		String s04 = original.substring(2);
		//imprimir a partir da posicao que solicitei e
		String s05 = original.substring(2, 9);
		//imprimir a partir da posicao que solicitei e
		String s06 = original.replace('a', 'x');
		//imprimir a partir da posicao que solicitei e
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");				
		

		System.out.println("Original : -" + original + "-");
		
		//converter para letra minuscula
		System.out.println("toLowerCase: -" + s01 + "-");
		//converter para letra maiuscula		
		System.out.println("toUpperCase: -" + s02 + "-");
		//elimina espaço no canto da string 
		System.out.println("trim: -" + s03 + "-");
		//imprimir a partir da posicao que solicitei  
		System.out.println("substring (2): -" + s04 + "-");
		//imprimir a partir da posicao que solicitei  
		System.out.println("substring (2): -" + s05 + "-");
		//imprimir a partir da posicao que solicitei  
		System.out.println("replace : -" + s06 + "-");
		//imprimir a partir da posicao que solicitei  
		System.out.println("replace : -" + s07 + "-");
		System.out.println("indexOf : -" + i + "-");
		System.out.println("lastIndexOf : -" + j + "-");
		
		
		
	}

}

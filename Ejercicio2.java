import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		String numeros="";
		String letras="";
		String resto="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto");
		String cadena=sc.nextLine();
		
		for(int cont=0;cont<cadena.length();cont++) {
			char a=cadena.charAt(cont);
			if(Character.isDigit(a)) {
				numeros=numeros+a;
			}else {
				if(Character.isLetter(a)) {
					letras=letras+a;
				}else {
					resto=resto+a;
				}
			}
		}
		System.out.println("Cadena numeros "+numeros);
		System.out.println("Cadena letras "+letras);
		System.out.println("Cadena resto "+resto);
		
		impresionCadenas(numeros, letras, resto);
		sc.close();
	}
	
	public static void impresionCadenas(String numeros, String letras, String resto){
		for(int i=0; i<numeros.length();i++) {
			char a=numeros.charAt(i);
			System.out.println(a);
		}
		for(int i=0; i<letras.length();i++) {
			char a=letras.charAt(i);
			System.out.println(a);
		}
		for(int i=0; i<resto.length();i++) {
			char a=resto.charAt(i);
			System.out.println(a);
		}
	}
}

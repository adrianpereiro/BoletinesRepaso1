import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int suma=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto");
		String cadena=sc.nextLine();
		
		for(int cont=0;cont<cadena.length();cont++) {
			char a=cadena.charAt(cont);
			if(a>='0' && a<='9') {
				int numero = a-48;
				suma=suma+numero;
			}
		}
		
		System.out.println("La suma de los numeros de la cadena es "+suma);
		sc.close();
	}

}

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int operacion = 0;
		int multiplicacion = 1;
		int[] arrayEnteros= new int [2];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elige una opción:\n 1. Suma\n 2. Resta \n 3. Multiplicacion\n");
		int opcion=sc.nextInt();
		
		System.out.println("Introduce los valores");
		for(int i=0;i<arrayEnteros.length;i++) {
			arrayEnteros[i]= sc.nextInt();
		}
		operacion=arrayEnteros[0];
		switch(opcion) {
		case 1:
			for(int i=1; i<arrayEnteros.length; i++){
				operacion= operacion + arrayEnteros[i];
			}
			System.out.println("La suma de los valores del array es "+operacion);
			break;
			
		case 2:
			for(int i=1; i<arrayEnteros.length; i++){
				operacion= operacion - arrayEnteros[i];
				System.out.println("La resta de los valores del array es "+operacion);
			}
			System.out.println(operacion);
			break;
			
		case 3:
			for(int i=0; i<arrayEnteros.length; i++){
				multiplicacion= multiplicacion * arrayEnteros[i];
			}
			System.out.println("La multiplicacion de los valores del array es "+multiplicacion);
			break;
			
		default:
			System.out.println("Opción no valida");
		}
		
       sc.close();
	}

}
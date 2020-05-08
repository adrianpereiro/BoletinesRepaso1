import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] array = new int [3];
		for(int i=0;i<array.length;i++) {
			System.out.println("Introduce el numero de valores");
			int numeros=sc.nextInt();
			array [i]= numeros; 
	
		}for(int i=0; i< array.length; i++) {
			System.out.println("El valor es:"+array[i]);
		}	
		 sc.close();

	}

}

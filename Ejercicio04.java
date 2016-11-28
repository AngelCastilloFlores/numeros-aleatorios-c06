import java.util.Scanner;

//Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.


public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa muestra 20 números aleatorios del 1 al 10.");
		
		for (int i = 0; i <= 20; i++){
			
			
			int numero = (int)(Math.random()*10 + 1);
			
			System.out.println(numero);
		}
		
		

		
		
		
		
		
		

	}

}

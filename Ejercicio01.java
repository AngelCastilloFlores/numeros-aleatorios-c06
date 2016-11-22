import java.util.Scanner;

//Escribe un programa que muestre la tirada de tres dados. 
//Se debe mostrar también la suma total (los puntos que suman entre los tres dados).
public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa muestra la tirada de 3 dados junto a su suma.");
		
		//Hay que hacer tres variables porque cada vez que se pone se ejecuta una sola vez, en este caso son 3 dados.
		int tirada1 = (int)(Math.random() * 6 + 1) ; 
		int tirada2 = (int)(Math.random() * 6 + 1) ;
		int tirada3 = (int)(Math.random() * 6 + 1) ;
		
		
		for (int i = 0; i<3; i++){
			System.out.println(tirada1);//con la multiplicación. se tiene la amplitud y con la suma desde donde empieza
		
			
			
			
			
		
		}

	}

}

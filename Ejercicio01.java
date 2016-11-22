import java.util.Scanner; // No está terminado

//Escribe un programa que muestre la tirada de tres dados. 
//Se debe mostrar también la suma total (los puntos que suman entre los tres dados).
public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa muestra la tirada de 3 dados junto a su suma.");
		
		int Totalsuma;
		
		for (int i = 0; i<1; i++){
			
		//Hay que hacer tres variables porque cada vez que se pone se ejecuta una sola vez, en este caso son 3 dados.
		int tirada1 = (int)(Math.random()*6 + 1);// Aquí estableceremos los rangos.
		int tirada2 = (int)(Math.random()*6 + 1);
		int tirada3 = (int)(Math.random()*6 + 1);
		
		System.out.println("La tirada 1 ha sacado: "+ tirada1);
		System.out.println("La tirada 2 ha sacado: "+ tirada2);
		System.out.println("La tirada 3 ha sacado: "+ tirada3);
		
		Totalsuma = (tirada1 + tirada2 + tirada3);
		
		System.out.println("La suma de las 3 tiradas es de: " + Totalsuma);
		
		}
		


		
	}

}

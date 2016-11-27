import java.util.Scanner;

//Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. 
//Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. 
//Cada palo está formado por 13 cartas, 
//de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1). 
//Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).

public class cartas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa muestra al azar el nombre de una carta: ");
		System.out.println("******************************************************");
		
		String palo = "";
		String carta = "";
		int numeroPalo = (int)(Math.random()*4 + 1);
		
		switch (numeroPalo){
		case 1:
			palo = "Picas";
			break;
		case 2:
			palo = "Corazones";
			break;
		case 3:
			palo = "Diamantes";
			break;
		case 4:
			palo = "Treboles";
			break;
			default:
		}
		
		int numeroCarta = (int)(Math.random()*13 + 1);
		
		switch (numeroCarta){
		case 1:
			carta = "As";
			break;
		case 2:
			carta = "J";
			break;
		case 3:
			carta = "Q";
			break;
		case 4:
			carta = "K";
			break;
			default:
				
				carta = String.valueOf(numeroCarta);
		}
		
		System.out.println(carta + " de " + palo);

	}

}

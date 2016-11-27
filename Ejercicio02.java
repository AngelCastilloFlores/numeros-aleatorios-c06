import java.util.Scanner;

//Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. 
//Esta baraja est� dividida en cuatro palos: picas, corazones, diamantes y tr�boles. 
//Cada palo est� formado por 13 cartas, 
//de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que ser�a el 1). 
//Para convertir un n�mero en una cadena de caracteres podemos usar String.valueOf(n).

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String palo ="";
		String carta ="";
		int numeroPalo = (int)(Math.random()*4 + 1);
		
		System.out.println("Este programa muestra el nombre de una carta de la baraja francesa.");
		
		switch (numeroPalo) {
		case 1: 
			palo = "picas";
			break;
		case 2:
			palo = "corazones";
			break;
		case 3:
			palo = "diamantes";
			break;
		case 4:
			palo = "treboles";
			default:
		}
				
		int numeroCarta = (int)(Math.random()*13 + 1);
		
		switch (numeroCarta) {
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
		
		System.out.println(carta +  " de " + palo);
		
			
			}
		}

	



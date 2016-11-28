import java.util.Scanner;

//Escribe un programa que piense un número al azar entre 0 y 100. 
//El usuario debe adivinarlo y tiene para ello 5 oportunidades. 
//Después de cada intento fallido, el programa dirá cuántas oportunidades quedan 
//y si el número introducido es menor o mayor que el número secreto.

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int oportunidades = 5;
		boolean acertado = true;
		int numeroSecreto = (int)(Math.random()*100 + 0);
		
		System.out.println("El programa pensará un numero entre 0 y 100.");
		System.out.println("Usted tendrá que adivinarlo.");
		
		System.out.println("Introduzca el número que usted crea: ");
		int numeroIntroducido = teclado.nextInt();
		
			for(int i = 0; i<5; i++){
				System.out.println("Incorrecto, introduzca otro número: ");
				numeroIntroducido = teclado.nextInt();
				
					if (numeroIntroducido == numeroSecreto){
					acertado = true;
					System.out.println("¡Correcto, ha acertado el número que estaba pensando!");
					}else{
					oportunidades--;

					if (oportunidades == 0){
						System.out.println("Ha agotado todas las oportunidades.");
						}
					}
				}
			}
		}

	



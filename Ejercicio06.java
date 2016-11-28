import java.util.Scanner;

//Escribe un programa que piense un n�mero al azar entre 0 y 100. 
//El usuario debe adivinarlo y tiene para ello 5 oportunidades. 
//Despu�s de cada intento fallido, el programa dir� cu�ntas oportunidades quedan 
//y si el n�mero introducido es menor o mayor que el n�mero secreto.

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int oportunidades = 5;
		boolean acertado = true;
		int numeroSecreto = (int)(Math.random()*100 + 0);
		
		System.out.println("El programa pensar� un numero entre 0 y 100.");
		System.out.println("Usted tendr� que adivinarlo.");
		
		System.out.println("Introduzca el n�mero que usted crea: ");
		int numeroIntroducido = teclado.nextInt();
		
			for(int i = 0; i<5; i++){
				System.out.println("Incorrecto, introduzca otro n�mero: ");
				numeroIntroducido = teclado.nextInt();
				
					if (numeroIntroducido == numeroSecreto){
					acertado = true;
					System.out.println("�Correcto, ha acertado el n�mero que estaba pensando!");
					}else{
					oportunidades--;

					if (oportunidades == 0){
						System.out.println("Ha agotado todas las oportunidades.");
						}
					}
				}
			}
		}

	



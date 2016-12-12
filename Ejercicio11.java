import java.util.Scanner;

//Escribe un programa que muestre 20 notas generadas al azar. 
//Las notas deben aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente.
//Al final aparecerá el número de suspensos, el número de suficientes, el número de bienes,etc.

public class Ejercicio11 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	//Declarar variables
	String notas = ""; 
	int r=0;
	int suspensos = 0;
  int suficientes = 0;
  int bienes = 0;
  int notables = 0;
  int sobresalientes = 0;
	
	for(int i = 0; i <= 20; i++){ //bucle para sacar 20 notas
	 r = (int)(Math.random()*6); //notas aleatorias (Siempre dentro del bucle)

		switch(r){
		case 1:
			System.out.println("suspenso");
			break;
		case 2:
			System.out.println("suficiente");
			break;
		case 3:
			System.out.println("bien");
			break;
		case 4:
			System.out.println("notable");
			break;
		case 5:
			System.out.println("sobresaliente");
			break;
			default:
			}
	}
		//recogida de notas:
		
		System.out.println("\nNº de suspensos: " + suspensos);
    System.out.println("Nº de suficientes: " + suficientes);
    System.out.println("Nº de bienes: " + bienes);
    System.out.println("Nº de notables: " + notables);
    System.out.println("Nº de sobresalientes: " + sobresalientes);
		
	}
}

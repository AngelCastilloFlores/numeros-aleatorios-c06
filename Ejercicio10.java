import java.util.Scanner;

//Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
//El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *,-,=,.,|,@.
//Las líneas deben tener una longitud aleatoriae ntre 1 y 40 caracteres.

public class Ejercicio10 {

	public static void main(String[] args) {
		
		String relleno = "";
		int longitud;
		int r;
		
		for(int i=0; i<10; i++){
			
			longitud = (int)(Math.random()*40+1);
			r = (int)(Math.random()*6);
			
			switch (r){
			case 1:
				System.out.println("*");
				break;
			case 2:
				System.out.println("-");
				break;
			case 3:
				System.out.println("=");
				break;
			case 4:
				System.out.println(".");
				break;
			case 5:
				System.out.println("|");
				break;
			case 6:
				System.out.println("@");
				break;
				default:
			}
			
			for(int j=0; j<=longitud;j++){
				System.out.print(relleno);
			}
			System.out.println();

		}
		
		
	}

}

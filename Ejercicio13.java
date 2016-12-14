import java.util.Scanner;

//Escribe un programa que simule la tirada de dos dados.
//El programa deberá continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
//dados tengan el mismo valor.

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int tirada1;
		int tirada2;
		
		do {
      tirada1 = (int)(Math.random() * 6) + 1;
      tirada2 = (int)(Math.random() * 6) + 1;
      System.out.println(tirada1 + " " + tirada2);
    } while (tirada1 != tirada2);
		

	}

}

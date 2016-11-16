import java.util.Scanner;

//generar números entre 1 y 10
public class numAleatorios03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i<=10; i++){
			System.out.println(Math.random()* 10 +1 + " ");
		}
		
		System.out.println();

	}

}

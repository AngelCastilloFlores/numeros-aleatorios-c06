import java.util.Scanner;

//generar valores aleatorios entre 0 y 10 (incluyendo el 0 y sin llegar a 10)


public class numAleatorios02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i<10; i++){
			System.out.println(Math.random()* 10 +"");
		}

	}

}

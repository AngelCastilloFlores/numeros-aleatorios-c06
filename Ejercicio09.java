//Realiza un programa que vaya generando n�meros aleatorios pares entre 0 y 100 
//y que no termine de generar n�meros hasta que no saque el 24. 
//El programa deber� decir alfinal cu�ntos n�meros se han generado.

public class Ejercicio09 {

	public static void main(String[] args) {
		
		int n = 0;
		int cuentaNumeros = 0;
		
		while (n != 24) {
			n = (int)(Math.random()*51 )* 2;
			System.out.print(n + " ");
			cuentaNumeros++;
		}
		System.out.println("Se han generado " + cuentaNumeros + " n�meros.");
		
		


	}

}

//Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, 
//sota, caballo, rey y as.

public class Ejercicio03 {

	public static void main(String[] args) {
		System.out.println("Este programa muestra al azar el nombre de una carta: ");
		System.out.println("******************************************************");
		
		String palo = "";
		String carta = "";
		int numeroPalo = (int)(Math.random()*4 + 1);
		
		switch (numeroPalo){
		case 1:
			palo = "Sota";
			break;
		case 2:
			palo = "Caballo";
			break;
		case 3:
			palo = "Rey";
			break;
		case 4:
			palo = "As";
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

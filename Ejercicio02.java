/**
 * Realiza un programa que muestre al azar el nombre de una carta de la
baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
sería el 1). Para convertir un número en una cadena de caracteres podemos
usar String.valueOf(n).
* 
* @author Raul Martin
*/

public class Ejercicio02 {
	public static void main(String[] args) {
		
		int carta,palo;
		
		palo = ((int)(Math.random()*3));
		
		switch(palo) {
			
			case 0:
			System.out.println("Picas");
			break;
			case 1:
			System.out.println("Diamantes");
			break;
			case 2:
			System.out.println("Corazones");
			break;
			case 3:
			System.out.println("Treboles");
			break;
		}
		
		carta = ((int)((Math.random()*13) + 1));
		
		switch(carta) {
			case 1:
			System.out.println("A");
			break;
			case 11:
			System.out.println("J");
			break;
			case 12:
			System.out.println("Q");
			break;
			case 13:
			System.out.println("K");
			break;
			default:
			System.out.println(carta);
		}
	}
}
			

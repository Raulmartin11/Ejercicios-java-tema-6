/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
* 
* @author Raul Martin
*/

public class Ejercicio03 {
	public static void main(String[] args) {
		
				int carta,palo;
		
		palo = ((int)(Math.random()*4));
		
		switch(palo) {
			
			case 0:
			System.out.println("Espadas");
			break;
			case 1:
			System.out.println("Oros");
			break;
			case 2:
			System.out.println("Bastos");
			break;
			case 3:
			System.out.println("Copas");
			break;
		}
		
		carta = ((int)((Math.random()*10) + 1));
		
		switch(carta) {
			case 1:
			System.out.println("A");
			break;
			case 8:
			System.out.println("Sota");
			break;
			case 9:
			System.out.println("Caballo");
			break;
			case 10:
			System.out.println("Rey");
			break;
			default:
			System.out.println(carta);
		}
	}
}

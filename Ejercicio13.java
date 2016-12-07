/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.
* 
* @author Raul Martin 
*/

public class Ejercicio13 {
	public static void main(String[] args) {
		int dado1 = 0;
		int dado2 = 1;
		
			while( dado1 != dado2) {
				
				dado1 = ((int)(Math.random()*7)+1);
				System.out.print(dado1 +"  ");
				
				dado2 = ((int)(Math.random()*7)+1);
				System.out.println(dado2);
		}
	}
}

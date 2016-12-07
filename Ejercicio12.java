/**
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter.
* 
* @author Raul Martin
*/
public class Ejercicio12 {
	public static void main(String[] args) {
		int n = 1;
		
		String verde = "\033[32m"; 
		while( n > 0) {
			
			int matrix = ((int)(Math.random()*96)+ 32);
			
			System.out.print(verde + (char) matrix);
		}
	}
}

/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.
*
* @author Raul Martin
*/

public class Ejercicio05 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 50; i++) {
			
			System.out.print(" " + (int)((Math.random()*100)+ 100));
		}
	}
}

/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.
*
* @author Raul Martin
*/

public class Ejercicio05 {
	public static void main(String[] args) {
		int maximo = 0;
		int minimo = 200;
		int media = 0;
		int aux,aleatorio;
		for(int i = 0; i < 50; i++) {
			aleatorio = (int)((Math.random()*100)+ 100);
			System.out.print(" " + aleatorio);
			aux = aleatorio;
			if(aux > maximo) {
				maximo = aux;
			} else if(aux < minimo) {
				minimo = aux;
			}
			media += aleatorio;
		}
		System.out.print("\nEl maximo es "+ maximo +", el minimo es "+ minimo +" y la media es "+ media/50);
	}
}

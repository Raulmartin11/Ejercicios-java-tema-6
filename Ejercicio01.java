/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
* 
* @author Raul Martin
*/

public class Ejercicio01 {
	public static void main(String[] args) {
		int tirada;
		int n = 0;
		System.out.println("La tirada de los dados son");
		
		for(int i = 1; i <=3; i++) {
			tirada = (int)((Math.random()*6)+1);
			n += tirada;
			System.out.println(tirada);
		}
		System.out.print("La suma total es: " + n);
	}
}

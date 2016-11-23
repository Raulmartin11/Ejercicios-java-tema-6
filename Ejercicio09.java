/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24.
 * El programa deberá decir al final cuántos números se han generado.
 * 
 * @author Raul Martin
 */

public class Ejercicio09 {
	public static void main(String[] args) {
		
		boolean ElNumero = true;
		int numero;
		while(ElNumero) {
			numero = (int)(Math.random()*101);
			System.out.print(numero + " ");
			if(numero == 24) {
				ElNumero = false;
			}
		}
	}
}

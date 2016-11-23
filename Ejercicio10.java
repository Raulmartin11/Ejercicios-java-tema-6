/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria
 * entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 * aleatoria entre 1 y 40 caracteres.
 */
 public class Ejercicio10 {
	public static void main(String[] args) {
		//CAMBIALO QUE TE HAS CONFUNDIDO MACHOTE
		int matrix;
		System.out.println("resultados\n");
		for(int lns = 0; lns <40; lns++) {
			
			for(int columnas = 0; columnas < 40; columnas++) {
				
				matrix = (int)(Math.random()*6);
				if(matrix == 0) {
					System.out.print("* ");
				}
				if(matrix == 1) {
					System.out.print("- ");
				}
				if(matrix == 2) {
					System.out.print("= ");
				}
				if(matrix == 3) {
					System.out.print(". ");
				}
				if(matrix == 4) {
					System.out.print("| ");
				}
				if(matrix == 5) {
					System.out.print("@ ");
				}
			}
			System.out.println();
		}
	}
}

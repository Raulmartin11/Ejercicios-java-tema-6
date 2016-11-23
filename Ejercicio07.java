/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas).
 * 
 * @author Raul Martin
 */

public class Ejercicio07 {
	public static void main(String[] args) {
		
		int resultado;
		System.out.println("resultados\n");
		for(int partidos = 0; partidos <15; partidos++) {
			
			for(int columnas = 0; columnas < 3; columnas++) {
				
				if((partidos == 14) && (columnas == 0)) {
				System.out.println("Y el pleno al 15 es");
				columnas+= 2;
				}
				resultado = (int)(Math.random()*3);
				
				if(resultado == 0) {
					System.out.print("|1--|   ");
				}
				
				if(resultado == 1) {
					System.out.print("|-X-|   ");
				}
				
				if(resultado == 2) {
					System.out.print("|--2|   ");
				}
				
			}
			System.out.println();
		}
	}
}
			

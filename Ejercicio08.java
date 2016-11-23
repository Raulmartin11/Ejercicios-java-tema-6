/**
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
* 
* @author Raul Martin 
*/

public class Ejercicio08 {
	public static void main(String[] args) {
		
				int resultado;
		System.out.println("resultados\n");
		for(int partidos = 0; partidos <15; partidos++) {
			
			for(int columnas = 0; columnas < 3; columnas++) {
				
				if((partidos == 14) && (columnas == 0)) {
				System.out.println("Y el pleno al 15 es");
				columnas+= 2;
				}
				resultado = (int)(Math.random()*7);
				
				if(resultado <= 3) {
					System.out.print("|1--|   ");
				} else if(resultado <=5) {
					System.out.print("|-X-|   ");
				}
				
				if(resultado == 6) {
					System.out.print("|--2|   ");
				}
				
			}
			System.out.println();
		}
	}
}

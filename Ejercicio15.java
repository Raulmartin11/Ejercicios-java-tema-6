/**
 * Generador de melodias
 * 
 * @author Raul Martin
 */
 
 public class Ejercicio15 {
	 public static void main(String[] args) {
		 
		int duracion = ((int)(Math.random()*7)+1);
		int n, i = 0;
		int x = 4;
		String primtima = "";
		int nota;
		String melodia = "";
		for(i = 1; i <= duracion; i++) {
			System.out.print("| ");
			if(i == duracion) {
				x--;
			}
			
			for(int j = 1; j <= x; j++) {
				nota = ((int)(Math.random()*7)+1);
				
				
				
				switch(nota) {
					case 1:
						melodia = "Do";
						break;
					case 2:
						melodia = "Re";
						break;
					case 3:
						melodia = "Mi";
						break;
					case 4:
						melodia = "Fa";
						break;
					case 5:
						melodia = "Sol";
						break;
					case 6:
						melodia = "La";
						break;
					case 7:
						melodia = "Si";
						break;
				}
				if(i == 1 && j == 1) {
					primtima = melodia;
				}
				if(i == duracion){
				
				}
				System.out.print(melodia +" ");
			}
			if(i == duracion) {
				System.out.print(primtima);
			}
			
		}
		System.out.print("||");
	}
}

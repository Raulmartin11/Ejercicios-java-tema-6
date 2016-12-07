/**
 *
 * @author Raul Martin
 */
import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
		
		int ancho = 4;
		int alto = 4;;
		
		Scanner S = new Scanner(System.in);
		
		ancho =  S.nextInt();
		alto =  S.nextInt();
		
		
		if(ancho < 4) {
			ancho = 4;
		} 
		if (alto < 4) {
			alto = 4;
		}
		
		int anchoPez = (int)(Math.random()*(ancho -3)+1);
		int altoPez = (int)(Math.random()*(alto -3)+1);
		
		for(int i = 0; i < alto; i++) { //filas
			
			for(int j = 0; j < ancho; j++) { //columnas 
				
				if( i == 0 || i==(alto -1) || j == 0 || j ==(ancho -1)) {
					System.out.print("* ");
				} else if (i == altoPez && j == anchoPez){
					System.out.print("& ");
				} else {
					System.out.print("- ");
				}
				
			}
			System.out.println();
		}
	}
}

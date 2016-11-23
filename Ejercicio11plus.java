/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.
* @author Raul Martin
*/
public class Ejercicio11plus {
	public static void main(String[] args) {
		
		int suspenso = 0;
		int suficiente = 0;
		int bien = 0;
		int notable = 0;
		int sobresaliente = 0;
		int nota;
		for(int n = 1; n <=20; n++) {
			nota = ((int)(Math.random()*5));
			
			switch(nota) {
				case 0:
				System.out.println("Sobresaliente");
				sobresaliente++;
				break;
				case 1:
				System.out.println("Notable");
				notable++;
				break;
				case 2:
				System.out.println("Bien");
				bien++;
				break;
				case 3:
				System.out.println("Suficiente");
				suficiente++;
				break;
				case 4:
				System.out.println("Sustenso");
				suspenso++;
				break;
				
			}
		}
		System.out.println("Hay " + suspenso +" suspensos, "+ suficiente +" suficientes, "+ bien +" Bien, "+ notable +" notables y "+ sobresaliente +" sobresalientes");
	}
}

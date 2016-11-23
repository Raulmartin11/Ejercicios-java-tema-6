/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.
* @author Raul Martin
*/
public class Ejercicio11 {
	public static void main(String[] args) {
		
		int suspenso = 0;
		int suficiente = 0;
		int bien = 0;
		int notable = 0;
		int sobresaliente = 0;
		int nota;
		for(int n = 1; n <=20; n++) {
			nota = ((int)(Math.random()*11));
			
			if(nota < 5) {
				System.out.println("Suspenso");
				suspenso++;
			}
			if(nota == 5) {
				System.out.println("Suficiente");
				suficiente++;
			} else if(nota <= 6) {
				System.out.println("Bien");
				bien++;
			} else if(nota < 9) {
				System.out.println("Notable");
				notable++;
			} else if(nota <= 10) {
				System.out.println("Sobresaliente");
				sobresaliente++;
			}
		}
		System.out.println("Hay " + suspenso +" suspensos, "+ suficiente +" suficientes, "+ bien +" Bien, "+ notable +" notables y "+ sobresaliente +" sobresalientes");
	}
}

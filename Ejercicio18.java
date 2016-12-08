/**
 * Realiza un programa que genere de forma aleatoria una secuencia de tres colores aleatorios de tal forma que no se repita ninguno.
 * 
 * @author Raul Martin
 */

public class Ejercicio18 {
	public static void main(String[] args) {
		
		int color = 0;
		int color2 = 0;
		int color3 = 0;
		String pintura1 = "";
		String pintura2 = "";
		String pintura3 = "";
		boolean n = true;
		System.out.println("3 colores diferentes");
		for( n = true; n == true;) {
			
			color = (int)(Math.random()*6);
			color2 = (int)(Math.random()*6);
			color3 = (int)(Math.random()*6);
			
			
			if(color != color2 && color != color3 && color2 != color3) {
				
				switch(color) {
					case 0:
						pintura1 = "Verde";
					break;
					case 1:
						pintura1 = "Rojo";
					break;
					case 2:
						pintura1 = "Amarillo";
					break;
					case 3:
						pintura1 = "Violeta";
					break;
					case 4:
						pintura1 = "Naranja";
					break;
					case 5:
						pintura1 = "Azul";
					break;
				}
				switch(color2) {
					case 0:
						pintura2 = "Verde";
					break;
					case 1:
						pintura2 = "Rojo";
					break;
					case 2:
						pintura2 = "Amarillo";
					break;
					case 3:
						pintura2 = "Violeta";
					break;
					case 4:
						pintura2 = "Naranja";
					break;
					case 5:
						pintura2 = "Azul";
					break;
				}
				switch(color3) {
					case 0:
						pintura3 = "Verde";
					break;
					case 1:
						pintura3 = "Rojo";
					break;
					case 2:
						pintura3 = "Amarillo";
					break;
					case 3:
						pintura3 = "Violeta";
					break;
					case 4:
						pintura3 = "Naranja";
					break;
					case 5:
						pintura3 = "Azul";
					break;
				}
				System.out.println(pintura1 + " " + pintura2 + " " + pintura3);
				n = false;
			}
			
		}
	}
}

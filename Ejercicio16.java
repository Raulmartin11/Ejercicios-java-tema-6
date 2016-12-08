/**
 * Realiza un simulador de máquina tragaperras simplificada
 * 
 * @author Raul Martin
 */

import java.util.Scanner;
public class Ejercicio16 {
	public static void main(String[] args) {
		
		int moneda = 1;
		int rueda1 = 0;
		int rueda2 = 0;
		int rueda3 = 0;
		String muestra1 = "";
		String muestra2 = "";
		String muestra3 = "";
		
		Scanner S = new Scanner(System.in);
		
		for(moneda = 1; moneda > 0; moneda --) {
			System.out.println("Introduce un numero positivo para jugar o uno negativo para terminar");
			int jugar = S.nextInt();
			if(jugar <= -1){
				System.out.println("tienes "+ (moneda + 1) +" moneda/s");
				moneda = 0;
			} else {
				rueda1 = (int)(Math.random()*5);
				rueda2 = (int)(Math.random()*5);
				rueda3 = (int)(Math.random()*5);
				
				switch(rueda1) {
					case 0:
					muestra1 = "😈";
					break;
					case 1:
					muestra1 = "😇";
					break;
					case 2:
					muestra1 = "😨";
					break;
					case 3:
					muestra1 = "🐵";
					break;
					case 4:
					muestra1 = "😎";
					break;
				}
				switch(rueda2) {
					case 0:
					muestra2 = "😈";
					break;
					case 1:
					muestra2 = "😇";
					break;
					case 2:
					muestra2 = "😨";
					break;
					case 3:
					muestra2 = "🐵";
					break;
					case 4:
					muestra2 = "😎";
					break;
				}
				switch(rueda3) {
					case 0:
					muestra3 = "😈";
					break;
					case 1:
					muestra3 = "😇";
					break;
					case 2:
					muestra3 = "😨";
					break;
					case 3:
					muestra3 = "🐵";
					break;
					case 4:
					muestra3 = "😎";
					break;
				}
				System.out.println("|"+ muestra1 +" |"+ muestra2 +" |"+ muestra3 +" |");
				if(rueda1 == rueda2 && rueda1 == rueda3) {
					System.out.println("Felicidades has ganado 10 monedas");
					moneda =+10; 
				} else if(rueda1 == rueda2 || rueda1 == rueda3 || rueda2 == rueda3) {
					System.out.println("Has recuperado su moneda");
					moneda ++;
				} else {
					System.out.println("Lo siento,ha perdido");
				}
			}
			
		}
		System.out.println("Hasta la proxima");
	}
}

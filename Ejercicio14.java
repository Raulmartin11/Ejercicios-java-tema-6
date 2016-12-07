/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
El programa intentará adivinar el número que estás pensando - un número
entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
programa debe preguntar si el número que estás pensando es mayor o menor
que el que te acaba de decir.
* 
* @author Raul Martin
*/
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		
		int NumeroAleatorio = 0;
		int i,numeroIntroducido;
		int NumeroMenor = 0;
		int NumeroMayor = 101;
		int auxmenor = 0;
		int auxmayor = 101;
		boolean nAleatorio = false;
		String pista;
		Scanner S = new Scanner(System.in);
		NumeroAleatorio = (int)(Math.random()*101);
		
		
		for(i = 5; i > 0; i--) {
			if(nAleatorio == false) {
				
				System.out.println(NumeroAleatorio);
				
				System.out.print("¿El numero es corecto(si o no)?  ");
				pista = System.console().readLine().toUpperCase();
				
				if(pista.equals("SI")) {
					nAleatorio = true;
				} else if(i != 1) {
					System.out.print("¿El numero es mayor o menor?  ");
					pista = System.console().readLine().toUpperCase();
					if(pista.equals("MAYOR")){
						NumeroMenor = NumeroAleatorio + 1;
						
					} else if(pista.equals("MENOR")){
						
						NumeroMayor = NumeroAleatorio - 1;
						
					}
					
				}
				
				NumeroAleatorio = ((int)(Math.random()*(NumeroMayor - NumeroMenor))+ NumeroMenor);
			}
			
		}
		if(nAleatorio) {
			System.out.println("Soy una maquina jajaja");
		} else {
			System.out.println("Soy una deshonra");
		}
	}
}

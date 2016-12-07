/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
ducido es menor o mayor que el número secreto.
* 
* @author Raul Martin
*/
import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		
		int NumeroAleatorio,i,numeroIntroducido;
		boolean nAleatorio = false;
		
		Scanner S = new Scanner(System.in);
		NumeroAleatorio = (int)(Math.random()*100);
		
		
		
		
		for(i = 5; i >= 0; i--) {
			if(nAleatorio == false) {
				
				System.out.print("Adivina el numero ");
				numeroIntroducido = S.nextInt();
				if(NumeroAleatorio == numeroIntroducido) {
					nAleatorio = true;
				}
				if((NumeroAleatorio < numeroIntroducido)) {
					System.out.println("El numero es menor");
					System.out.println("\nTe quedan: "+ i +" intentos");
				} else if(NumeroAleatorio > numeroIntroducido) {
					System.out.println("El numero es mayor");
					System.out.println("\nTe quedan: "+ i +" intentos");
				}
			}
		}
		if(nAleatorio) {
			System.out.println("Bien hecho!!!");
		} else {
			System.out.println("Eres la deshonra de tu familia");
		}
	}
}

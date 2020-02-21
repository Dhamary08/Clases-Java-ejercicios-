/**
 * 1.	Realice un algoritmo para obtener la suma de 15 cantidades 
 * mediante la utilización de un ciclo “Mientras”
 */
package Guia_Estructutras_Repetitivas_04;

import java.util.Scanner;

public class Ejercicio_1_while_mientras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numero, opcion, suma;

		opcion = 0;
		suma = 0;

		while (opcion < 15) {
			opcion++;
			System.out.printf("Ingrese numero %s: ", opcion);
			numero = sc.nextInt();
			suma = suma + numero;
		}
		System.out.printf("\n**********************");
		System.out.printf("\nSuma Total es= %s", suma);
	}

}

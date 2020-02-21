/**
 * Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
 * Obtén la suma de todos ellos y la media.
 */

package Ejercicios_clases;

import java.util.Scanner;

public class Arrays_suma_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int cont, num, suma;
		int numeros[];

		cont = 0;
		num = 0;
		suma = 0;

		numeros = new int[100];

		for (int i = 0; i < 100; i++) {
			num = num + 1;
			suma = suma + num;
			numeros[i] = num;

		}

		for (int i = 0; i < 100; i++) {
			cont++;
			if (cont > 5) {
				System.out.println("");
				cont = 0;
			}
			System.out.print(" " + numeros[i]);
		}
		System.out.printf("\nmedia es: %s", (suma / 100));
	}

}

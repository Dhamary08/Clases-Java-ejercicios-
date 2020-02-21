/**
 * Llenar un arreglo de tamaño 20 con números aleatorios en el mismo rango usando 
 * Math.random, luego mostrar el mayor número de todos.
 */
package Ejercicios_clases;

import java.util.Scanner;

public class Arrays_Math_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int cont, NumeroMayor;
		int matriz[];

		matriz = new int[20];
		cont = 0;

		for (int i = 0; i < 20; i++) {
			matriz[i] = (int) (Math.random() * 100 - 1);
		}

		for (int i = 0; i < 20; i++) {
			cont++;
			if (cont > 5) {
				System.out.println(" ");
				cont = 1;
			}
			System.out.print(" " + matriz[i]);
		}
		
		// Numero mayor muestra

		NumeroMayor = matriz[0];

		for (int j = 0; j < 20; j++) {
			if (NumeroMayor < matriz[j]) {
				NumeroMayor = matriz[j];
			}
		}
		System.out.printf("\nNumero Mayor es: %s", NumeroMayor);
	}
}

/**
 * Crear una arreglo de 4×4 con los números del 1 al 9. 
 * Mostrar por pantalla, tal como aparece en la matriz.
 */
package Ejercicio_Clases;

import java.util.Scanner;

public class array_4x4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// definicion de variable
		int Matriz[][];

		// definicion de dimension
		Matriz = new int[4][4];

		// Rellenar aleatorio%
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				Matriz[i][j] = (int) (Math.random() * 9 + 1);
			}
		}

//	for (int i = 0; i < 4; i++) {
//		for (int j = 0; j < 4; j++) {
//			System.out.printf("%d ",Matriz[i][j]);
//		}
//		System.out.printf("\n");
//		
//	}	

		// Para evitar el for arriba.......

		imprimirArreglo(Matriz);

	}

	public static void imprimirArreglo(int[][] arreglo) {
		System.out.println("Imprimiendo arreglo: \n");
		for (int fila = 0; fila < arreglo.length; fila++) {
			// itera a través de las columnas de la fila actual
			for (int columna = 0; columna < arreglo[fila].length; columna++)
				System.out.printf("%d  ", arreglo[fila][columna]);
			System.out.println();
		}

	}

}

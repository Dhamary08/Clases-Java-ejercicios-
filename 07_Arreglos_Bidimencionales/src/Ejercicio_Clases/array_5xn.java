/*
 * Crear una matriz de 5 filas y n columnas (se pide al usuario). 
 * Rellenarlo con números aleatorios entre 0 y 10
 */

package Ejercicio_Clases;

import java.util.Scanner;

public class array_5xn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Definicion de variables
		int matriz[][];
		int n, numero; // columnas

		
		System.out.printf("Cantidad de columnas a ingresar: ");
		n = sc.nextInt();

		// Deficion de dimension
		matriz = new int[5][n];

		
		boolean opc = false;

		// inicio para ingresar datos
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < n; j++) {
				do {
					System.out.printf("Ingrese numero entre 0 a 10 posicion (%s , %s): ",(i+1),(j+1));
					numero = sc.nextInt();

					if ((numero >= 0) && (numero <= 10)) {
						matriz[i][j] = numero;
						opc = true;
					} else if (numero > 10) {
						System.out.printf("Numero mal ingresado\n");
						opc = false;
					}
				} while (opc = false);

			}

		}
		imprimirArreglo(matriz);
	}
	public static void imprimirArreglo(int[][] arreglo)
	{
		System.out.println("Imprimiendo arreglo: \n");
		for (int fila = 0; fila < arreglo.length; fila++)
		{
		// itera a través de las columnas de la fila actual
		for (int columna = 0; columna < arreglo[fila].length; columna++)
			System.out.printf("%d  ", arreglo[fila][columna]);	
			System.out.println();
		}
	}

}

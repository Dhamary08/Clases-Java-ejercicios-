/**
 * Indica si dos arrays creados, son o no iguales. 
 * Consideración está es una propiedad de los arrays.
 */

package Ejercicios_clases;
import java.util.Scanner;
public class Arrays_Comparacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Definicion de variables
		int comparacion[];

		// Declaración de Dimension
		comparacion = new int[2];

		for (int i = 0; i < 2; i++) {
			System.out.printf("Ingrese %s caracter a comparar: ", (i + 1));
			comparacion[i] = sc.nextInt();
		}

		if (comparacion[0] == comparacion[1]) {
			System.out.printf("Son Iguales");
		} else {
			System.out.printf("Son Diferentes");
		}

	}

}

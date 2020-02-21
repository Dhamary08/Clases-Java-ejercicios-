/**
 * 6.	Genere un algoritmo para determinar  e imprimir los números 
 * pares que se encuentran entre 0 y 200. Realice el pseudocódigo, 
 * utilizando el ciclo más apropiado.
 */

package Guia_Estructutras_Repetitivas_04;

import java.util.Scanner;

public class Ejercicio_6_For_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num, x;

		num = 0;
		x = 0;

		System.out.printf("Numeros pares de 0 a 200\n\n");
		for (int i = 0; i < 200; i++) {

			num = num + 1;

			if (num % 2 == 0) {
				x = x + 1;
				System.out.print(num + "  ");
				if (x > 5) {
					System.out.println("");
					x = 0;
				}
			}

		}

	}

}

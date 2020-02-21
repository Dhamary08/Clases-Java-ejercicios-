/**
 * 2.	Se requiere un algoritmo para obtener la suma de doce 
 * cantidades ingresadas mediante la utilización de un ciclo Desde
 */

package Guia_Estructutras_Repetitivas_04;

import java.util.Scanner;

public class Ejercicio_2_CicloDesde_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numero, suma;

		suma = 0;

		for (int i = 0; i < 12; i++) {
			System.out.printf("Ingresar número %s: ", (i + 1));
			numero = sc.nextInt();
			suma = suma + numero;
		}
		System.out.printf("\nSuma total: %s", suma);
	}

}

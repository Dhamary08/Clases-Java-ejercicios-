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

		String numero;
		int opcion, suma;

		opcion = 0;
		suma = 0;

		while (opcion < 3) {
			
			System.out.printf("Ingrese %s° numero: ", (opcion+1));
			numero = sc.next();

			if (esNumero(numero) == true) {
				int num = Integer.parseInt(numero);
				opcion++;
				suma = suma + num;
			}else {
				System.out.printf("%s, \"No es un número válido\"",numero);
				System.out.printf("\nIngrese un número válido\n");
			}
		}
		System.out.printf("\n**********************");
		System.out.printf("\nSuma Total es= %s", suma);

	}

	/*
	 * VERIFICA NUMERO
	 */
	public static boolean esNumero(String retiro) {
		try {
			Integer.parseInt(retiro);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}

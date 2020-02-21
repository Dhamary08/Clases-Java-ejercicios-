/**
 *  Realice un programa el cual: Sortea un número entre 0 y 99 y pide al usuario repetidamente
 *  Que adivine el número. Cada vez que se equivoca, le indica si el número es 
 *  mayor o menor. Cuando acierta, le indica cuantos intentos fallidos realizó.
 */
package Ejercicios_clases;

import java.util.Scanner;

public class Arrays_Sorteo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numero, opcion, NumeroAdivinar, errores;

		opcion = 1;
		errores = 0;
		numero = (int) (Math.random() * 5 - 0);

		do {
			opcion++;
			errores++;
			System.out.printf("Ingrese el numero a adivinar: ");
			NumeroAdivinar = sc.nextInt();
			if (NumeroAdivinar == numero) {
				System.out.printf("***Bien, has acertado***");
				System.out.printf("\n    El numero es %s", numero);
				opcion = 0;
			} else if (NumeroAdivinar > numero) {
				System.out.printf("El numero menor\n");
			} else if (NumeroAdivinar < numero) {
				System.out.printf("El numero es mayor\n");
			}
		} while (opcion > 1);

		System.out.printf("\n***Fueron %s itentos***", (errores));
	}

}

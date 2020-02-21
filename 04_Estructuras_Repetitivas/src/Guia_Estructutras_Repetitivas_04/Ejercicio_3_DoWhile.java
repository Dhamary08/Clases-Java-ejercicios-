/**
 * 3.	Defina el correspondiente algoritmo para obtener 
 * la edad promedio de un grupo de N participantes del  
 * Bootcamp Talento digital. Realice el correspondiente algoritmo, 
 * utilizando los tres tipos de estructuras de ciclo
 */

package Guia_Estructutras_Repetitivas_04;

import java.util.Scanner;

public class Ejercicio_3_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int cont, cantidad, edad, suma;

		System.out.printf("Ingrese la cantidad de estudiantes: ");
		cantidad = sc.nextInt();

		cont = 0;
		suma = 0;

		do {
			cont++;
			System.out.printf("Ingrese la edad del estudiante %s: ", (cont));
			edad = sc.nextInt();
			suma = suma + edad;

		} while (cont < cantidad);

		System.out.printf("\nEl promedio de edad es: %s", (suma / cantidad));
	}

}

/**
 * 4.	Estructure un algoritmo para obtener la estatura promedio de un grupo de atletas, 
 * cuyo número de miembros se desconoce, el ciclo debe efectuarse siempre y 
 * cuando se tenga una estatura registrada. Realice su estructura algorítmica utilizando el ciclo apropiado
 */

package Guia_Estructutras_Repetitivas_04;

import java.util.Scanner;

public class Ejercicio_4_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int atleta, estatura, suma;

		atleta = 0;
		estatura = 0;
		suma = 0;

		do {
			atleta = atleta + 1;
			System.out.printf("Ingrese estatura cm: (Recuerde ingrese 0 para salir)");
			estatura = sc.nextInt();
			suma = suma + estatura;

		} while (estatura > 0);

		System.out.printf("\n El promedio del grupo es: %s", (suma / atleta));
	}

}

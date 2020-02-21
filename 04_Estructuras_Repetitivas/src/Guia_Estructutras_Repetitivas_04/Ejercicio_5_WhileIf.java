/**
 * 5.	Se solicita un algoritmo para determinar, de N cantidades, 
 * cuántas son menores o iguales a cero y cuántas mayores a cero.
 */


package Guia_Estructutras_Repetitivas_04;
import java.util.Scanner;
public class Ejercicio_5_WhileIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Double cant, num, acumNeg, acumPos;

		int x;

		System.out.printf("Ingrese la cantidad de datos a comparar: ");
		cant = sc.nextDouble();

		x = 0;
		acumNeg = 0.0;
		acumPos = 0.0;

		while (x < cant) {
			x = x + 1;
			System.out.printf("Ingrese numero: ");
			num = sc.nextDouble();
			if (num < 0) {
				acumNeg = acumNeg + 1;
			} else if (num >= 0) {
				acumPos = acumPos + 1;
			}
		}

		System.out.printf("\n Cantidad de numeros mayores son: %s", acumPos);
		System.out.printf("\n Cantidad de numeros menores son: %s", acumNeg);

	}

}

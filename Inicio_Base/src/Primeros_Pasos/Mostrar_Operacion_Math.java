/**
 * Realice un programa en el cual se Declaren dos variables num�ricas (con el valor que desees), 
 * Finalmente muestra por consola la suma, 
 * resta, multiplicaci�n, divisi�n y m�dulo (resto de la divisi�n).
 */

package Primeros_Pasos;
import java.util.Scanner;
public class Mostrar_Operacion_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.printf("Ingrese numero 1: ");
		numero1=sc.nextInt();
		System.out.printf("Ingrese numero 2: ");
		numero2=sc.nextInt();
		
		System.out.printf("\nSuma es: %s ",(numero1+numero2));
		System.out.printf("\nResta es: %s", (numero1-numero2));
		System.out.printf("\nMultiplicacion: %s", (numero1*numero2));
		System.out.printf("\nDivision es: %s", (numero1/numero2));
	}

}

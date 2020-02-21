/**
 * Realice un programa que pida el ingreso de un número entero y 
 * muestre un mensaje diciendo si el número es mayor o menor que 40.
 */

package Ejercicio_Practicos;
import java.util.Scanner;
public class IF_Mayor_Menor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int numero; //numero quese ingresa para comparar
		
		System.out.printf("Ingrese número: ");
		numero=sc.nextInt();
		
		if(numero>40) {
			System.out.printf("Su número es mayor a 40");
		}else if(numero==40){
			System.out.printf("Su número es 40");
		}else if(numero<40) {
			System.out.printf("Su número es menor a 40");
		}
	}

}

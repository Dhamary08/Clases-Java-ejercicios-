/**
 * Pedir dos números y decir si son iguales o no.
 */


package Ejercicio_Practicos;
import java.util.Scanner;
public class IF_igualdad_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num2, num1;
		
		System.out.printf("Ingresar 1° número: ");
		num1=sc.nextInt();
		System.out.printf("Ingresar 2° número: ");
		num2=sc.nextInt();
		
		System.out.printf("--------------\n");
		if(num1==num2) {
			System.out.printf("número %s es igual a %s", num1, num2);
		}else if(num1!=num2) {
			System.out.printf("número %s es diferente a %s", num1, num2);
		}
	}

}

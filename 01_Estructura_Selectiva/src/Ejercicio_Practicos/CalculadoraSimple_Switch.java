/**
 * Hacer una calculadora sencilla, que va funcionar de la siguiente manera, 
 * el usuario va ingresar 4 valores por teclado, el programa le pedirá que 
 * operación desea realizar y finalmente le mostrará el resultado. 
 * Utilizando sentencia switch.
 */

package Ejercicio_Practicos;
import java.util.Scanner;
public class CalculadoraSimple_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, num4, opcion;
		int suma, resta, multi, divi;
		
		//numero ingresa el usuario
		System.out.printf("Ingrese numero 1: ");
		num1=sc.nextInt();
		System.out.printf("Ingrese numero 2: ");
		num2=sc.nextInt();
		System.out.printf("Ingrese numero 3: ");
		num3=sc.nextInt();
		System.out.printf("Ingrese numero 4: ");
		num4=sc.nextInt();
		
		
		System.out.println("Ingrese opcion 1: Suma, 2: Resta, 3: Multiplicación, 4: División");
		opcion=sc.nextInt();
		
		switch (opcion) {
		case 1:
			suma = num1+num2+num3+num4;
			System.out.printf("suma es: %s",suma);
			break;
		case 2:
			resta = num1-num2-num3-num4;
			System.out.printf("resta es: %s", resta);
			break;
		case 3:
			multi = num1*num2*num3*num4;
			System.out.printf("Multiplicación: %s",multi);
			break;
		case 4:
			divi = num1/num2/num3/num4;
			System.out.printf("División: %s", divi);
			break;
		default:
			System.out.printf("Recuerde solo hay 4 opciones");
			break;
		}
		
	}

}

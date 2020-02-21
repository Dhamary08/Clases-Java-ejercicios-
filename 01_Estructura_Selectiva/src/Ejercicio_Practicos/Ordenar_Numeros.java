/**
 * 4.Pedir tres números y mostrarlos ordenados de mayor a menor.
 */

package Ejercicio_Practicos;
import java.util.Scanner;
public class Ordenar_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.printf("Ingresa 1° numero: ");
		num1=sc.nextInt();
		System.out.printf("Ingresa 2° numero: ");
		num2=sc.nextInt();
		System.out.printf("Ingresa 3° numero: ");
		num3=sc.nextInt();
		
		System.out.printf("----El Orden es----\n");
		if ((num1>=num2)&&(num2>=num3)) {
			System.out.printf("%s - %s - %s", num1, num2, num3);
		}else if((num1>=num3)&&(num3>=num2)){
			System.out.printf("%s - %s - %s", num1, num3, num2);
		}else if((num2>=num3)&&(num3>=num1)) {
			System.out.printf("%s - %s - %s", num2, num3, num1);
		}else if((num2>=num1)&&(num1>=num3)) {
			System.out.printf("%s - %s - %s", num2, num1, num3);
		}else if((num3>=num2)&&(num2>=num1)) {
			System.out.printf("%s - %s - %s", num3, num2, num1);
		}else if((num3>=num1)&&(num1>=num2)) {
			System.out.printf("%s - %s - %s", num3, num1, num2);
		}
	}

}

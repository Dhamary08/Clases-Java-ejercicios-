/**
 * Realice un Programa que ingresando su nombre lo salude.
 */

package Primeros_Pasos;
import java.util.Scanner;
public class Saludo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String Nombre, Apellido;
	
		System.out.print("Ingrese su Nombre: ");
		Nombre=sc.nextLine();
		System.out.printf("Ingrese Apellido: ");
		Apellido=sc.nextLine();
		System.out.println("----- Buenos dias, "+ Nombre+" "+Apellido+" -----");
		
	}

}

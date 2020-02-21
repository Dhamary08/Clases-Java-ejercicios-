/**
 * Realice Un Programa que pida nombre, edad,
 * número de teléfono y  Correo e imprimir
 * los datos finalmente por pantalla
 */

package Primeros_Pasos;
import java.util.Scanner;
public class Ingreso_Datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String Nombre, Apellido, Correo;
		int Edad, Telefono;
		
		//Ingreso de datos
		
		System.out.printf("Ingrese su Nombre: ");
		Nombre = sc.nextLine();
		System.out.printf("Ingrese su Apellido: ");
		Apellido = sc.nextLine();
		System.out.printf("Ingrese su correo: ");
		Correo= sc.nextLine();
		System.out.printf("Ingrese su Edad: ");
		Edad= sc.nextInt();
		System.out.printf("Ingrese su Numero Telefonico: ");
		Telefono=sc.nextInt();
		
		//mostrar datos
		
		System.out.printf("Bienvenido: ");
		System.out.printf("%s %s de %s años, con correo %s y telefono %s", Nombre, Apellido, Edad, Correo, Telefono);
		
		
		

	}

}

/**
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
 * Suponiendo todos los meses de 30 días. 
 */
package Ejercicio_Practicos;
import java.util.Scanner;
public class Verificar_Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int dia, mes, years;
		int Correcto, Incorrecto; //contadores
		
		
		System.out.printf("Ingrese numero del Dia: ");
		dia=sc.nextInt();
		System.out.printf("Ingrese numero del Mes: ");
		mes=sc.nextInt();
		System.out.printf("Ingrese año: ");
		years=sc.nextInt();
		
		//contadores
		Correcto=0;
		Incorrecto=0;
		
		if((dia<=30)&&(mes<=12)&&(years>1500)) {
			System.out.printf("Fecha bien ingresada => (%s - %s - %s)", dia, mes, years);
		}else if((dia>30)&&(mes>12)&&(years>4000)) {
			System.out.printf("Fecha mal ingresada");
		}
	}

}

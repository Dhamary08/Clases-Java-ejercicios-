
/**
 * Pedir una nota de 1 a 7 y mostrarla de la forma: Insuficiente, Suficiente, Bien
 */

package Ejercicio_Practicos;
import java.util.Scanner;
public class Calificacion_Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double nota;
		
		System.out.printf("Ingrese su nota:");
		nota=sc.nextDouble();
		
		if(nota>7.0) {
			System.out.printf("Su nota fue mal ingresada recuerde que es de 1 a 7");
		}else if((nota<=7.0)&&(nota>=6.0)) {
			System.out.printf("Bien");
		}else if ((nota<6.0)&&(nota>=4.0)) {
			System.out.printf("Suficiente");
		}else if((nota<4.0)&&(nota>1.0)) {
			System.out.printf("Insuficiente");
		}
	}

}

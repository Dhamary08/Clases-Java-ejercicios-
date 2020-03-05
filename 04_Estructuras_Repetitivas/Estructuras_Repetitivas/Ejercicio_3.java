package Estructuras_Repetitivas;
import java.util.Scanner;
public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//Realice un programa que permita ingresar N cantidad de numeros
		//e indique cuantos son >= a 1000
		
		int dato, total, cont, menor;
		
		cont=0;
		menor=0;
		
		System.out.printf(" Ingrese cantidad de numeros a ingresar: ");
		total=sc.nextInt();
		
		for (int i = 0; i < total; i++) {
			System.out.printf(" Ingrese numero %s: ", (i+1));
			dato=sc.nextInt();
			if(dato>=1000) {
				cont=cont+1;
			} /*
				 * else { menor=menor+1; }
				 */
		}
		System.out.printf(" Total de mayores son: %s ",cont);
		
		
	}

}

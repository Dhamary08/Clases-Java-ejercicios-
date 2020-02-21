/**
 * En una competencia de atletismo se desea implementar un control para almacenar el 
 * tiempo de cada corredor y además  determinar  por los datos obtenidos en los  tiempos  
 * de  los corredores   cual   es   el   ganador.   Se   debe especificar cuantos atletas van a participar.
 */

package Ejercicios_clases;

import java.util.Scanner;

public class Arrays_Corredores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int cant;
		Double tiempo[];
		String nombre[];

		System.out.printf("ingrese cantidad de participantes: ");
		cant = sc.nextInt();

		tiempo = new Double[cant];
		nombre = new String[cant];

		/*
		 * Ingreso de nombres
		 */
		for (int i = 0; i < cant; i++) {
			System.out.printf("Ingrese nombre del participante %s: ", (i + 1));
			nombre[i] = sc.next();
		}
		/*
		 * Ingreso de tiempos
		 */
		for (int i = 0; i < cant; i++) {
			System.out.printf("ingrese tiempo de %s: ", nombre[i]);
			tiempo[i] = sc.nextDouble();
		}

		/*
		 * muestra participantes y tiempos
		 */
		for (int i = 0; i < cant; i++) {
			System.out.printf("participante %s, con tiempo %s \n", nombre[i], tiempo[i]);
		}

		
		/*
		 * el tiempo maximo
		 */

		Double Ganador = tiempo[0];

		for (int i = 0; i < cant; i++) {
			if (Ganador < tiempo[i]) {
				Ganador = tiempo[i];
			}
		}

		System.out.printf("\n***tiempo ganador es %s***\n", Ganador);

		//para mostrar los nombres
		int j=0;
	
		for (int i = 0; i < cant; i++) {
			if(tiempo[i]==Ganador) {
				System.out.println(nombre[i]);
			}else{
				j++;
			}
		}
		System.out.print(j);
		
	}

}

/**
 * Realice un programa que Pedirá números al usuario y cuando el usuario ingrese
 * un -1 se terminará el programa. Al terminar, mostrará lo siguiente: 
 * – mayor numero introducido 
 * – menor numero introducido 
 * – suma de todos los numeros 
 * – suma de los numeros positivos 
 * – suma de los numeros negativos 
 * – media de la  suma (la primera que pido) 
 * El número -1 no contara como número.
 */

package Ejercicio_Clases;

import java.util.Scanner;

public class Programa_Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double numPost, numNeg, contCero, num, suma, mayor, menor, media;
		double sumPost, sumNeg;
		double numMayor, numMenor;
		double matriz[];
		int cont;
		
		// inicio de contadores
		sumPost = 0;
		sumNeg = 0;
		matriz = new double[10000];
		cont = 0;
		suma = 0.0;
		numPost = 0.0;
		numNeg = 0.0;
		contCero = 0.0;

		// para terminar el programa cuando agrege -1
		boolean opc = false;

		do {
			System.out.printf("Ingrese numeros: ");
			num = sc.nextDouble();

			if (num != -1.0) {
				
				matriz[cont] = num;
				cont++;
				suma = suma + num; // suma
				if (num > 0.0) { // suma positivos
					sumPost = sumPost + num;
					numPost++;
				} else if (num < 0.0) { // suma negativos
					num = num * (-1);
					numNeg++;
					sumNeg = sumNeg + num;
				} else if (num == 0.0) {// cuenta los ceros
					contCero = contCero + 1;
				}
			} else if (num == -1.0) { // solo si el numero es -1 termina el sistema
				opc = true;
			}
		} while (opc == false);

		//MAYOR
		
		
		numMayor=matriz[0];
		for (int i = 0; i < cont; i++) {
			if(numMayor<matriz[i]) {
				numMayor=matriz[i];
			}
		}
		
		//MENOR

		numMenor=matriz[0];
		for (int i = 0; i < cont; i++) {
			if(numMenor>matriz[i]) {
				numMenor=matriz[i];
			}
		}
		System.out.printf("\n************************\n");
		//matriz muestra
		for (int i = 0; i < cont; i++) {
			System.out.print("  "+matriz[i]);
		}
		
		System.out.printf("\n************************\n");
		System.out.printf("\n Cantidad de números: %s", cont);
		System.out.printf("\n El numero mayor es: %s", numMayor);
		System.out.printf("\n El numero menor es: %s", numMenor);
		System.out.printf("\n suma de todos los numero es: %s", (sumPost-sumNeg));
		System.out.printf("\n suma de los numeros positivos es: %s", sumPost);
		System.out.printf("\n suma de los numeros negativos es: -%s", sumNeg);
		System.out.printf("\n promedio de todos los números son: %s", ((sumPost-sumNeg)/cont));


	}

}

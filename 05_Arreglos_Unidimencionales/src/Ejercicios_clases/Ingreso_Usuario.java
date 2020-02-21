/**
 * 1.  Ejercicios Prácticos grupales1.En un arreglo, mostrar los datos de un usuario 
 * ( nombre, edad y sexo), no necesariamente se deben ingresar desde teclado.
 */

//campos de clase

package Ejercicios_clases;
import java.util.Scanner;
public class Ingreso_Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		//definicion de variables
		int cant,i; //acumulador el i puede estar definido dentro del for
		String nom, ed, sex;
		
		// definicion de dimension
		String nombre[];
		int edad[];
		String sexo[];
		
		System.out.printf("Ingrese cantidad de personas: ");
		cant=sc.nextInt();
		//se agrega despues para el codigo
		nombre=new String[cant];
		edad=new int[cant];
		sexo=new String[cant];

/*
 * Inicio de programa para guardar los nombres, edad y sexo en arreglo unidimensional
 * recordar que nextLine.... en la variable String no se agrega solo "NEXT"
 */
		
		for ( i = 0; i < cant; i++) {
			
			System.out.printf("Ingrese nombre %s: ", (i+1));
			nombre[i]=sc.next(); ///OJO PIOJO el nextLine no va porque lo reconoce como LINEA
			System.out.printf("Ingrese edad %s:  ",(i+1));
			edad[i]=sc.nextInt();
			System.out.printf("Ingrese sexo %s:  ",(i+1));
			sexo[i]=sc.next();
		}
		
/*
 * Inicio de metodo para mostrar en pantalla los nombres.
 */
		System.out.printf("\n Nombre    Edad    Sexo");
		for (i=0; i<cant; i++) {
			System.out.printf("\n %s     %s     %s",nombre[i],edad[i],sexo[i]);
		}//cierre for para mosstrar pantalla
		
	}//cierre de metodo
}// cierre de clase y del ejemplo guia 4


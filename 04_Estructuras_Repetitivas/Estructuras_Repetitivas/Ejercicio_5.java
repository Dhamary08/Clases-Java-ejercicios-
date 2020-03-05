package Estructuras_Repetitivas;
import java.util.Scanner;
public class Ejercicio_5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Desarrollar un programa que solicite la carga de 10 numeros e imprima la suma de los ultimos 5 valores ingresado

		Scanner sc=new Scanner(System.in);
		int numero, suma, x;
		
		x=0;
		suma=0;
		
		while(x<10) {
			x=x+1;
			System.out.printf("Ingrese numero %s: ",x);
			numero=sc.nextInt();
					if(x>5) {
						suma=suma+numero;
					}
		}
		System.out.printf("\n La suma de los ultimos 5 numeros es: %s",suma);

	}

}

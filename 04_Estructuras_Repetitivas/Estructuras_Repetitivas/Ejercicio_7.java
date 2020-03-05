package Estructuras_Repetitivas;
import java.util.Scanner;
public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		
		//Se realiza la carga de 10 valores enteros por teclado. se desea conocer
		//a) cant de valores + y - ingresado
		//b) la cantidad de multiplos de 15
		//c) el valor acumulado de los valores ingresados
		
		int x, valor, acumNeg, acumPos, acumResto, acumPar;
		double multiplo, resto, par, restoPar;
		
		x=0;
		acumNeg=0;
		acumPos=0; //se considera el cero como valor positivo
		acumResto=0;
		acumPar=0;
		
		
		do {
			x=x+1;
			System.out.printf("Ingrese %s numero: ",x);
			valor=sc.nextInt();
			//evalua si el numero es positivo o negativo
				if(valor<0){
					acumNeg=acumNeg+1;
				}else if(valor>=0){
					acumPos=acumPos+1;
				}
			//evalua si es multiplo de 15
				multiplo=valor;
				resto= multiplo%15;
				if(resto==0) {
					acumResto=acumResto+1;
				}
			//evalua los valor acumulados pares
				par=valor;
				restoPar= par%2;
				if(restoPar==0) {
					acumPar=acumPar+1;
				}
		}while (x<10);
		
		System.out.printf("\n La cantidad de positivos son: %s", acumPos);
		System.out.printf("\n La cantidad de negativos son: %s", acumNeg);	
		System.out.printf("\n La cantidad de multiplos de 15 son: %s", acumResto);
		System.out.printf("\n La cantidad de par son: %s", acumPar);	

	}

}

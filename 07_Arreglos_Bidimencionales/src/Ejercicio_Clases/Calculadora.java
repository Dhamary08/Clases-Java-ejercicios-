package Ejercicio_Clases;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		double num1, num2, operacion;
		int opc;

		
		System.out.printf("Ingrese numero 1: ");
		num1=sc.nextDouble();
		System.out.printf("Ingrese numero 2: ");
		num2=sc.nextDouble();
		
		System.out.printf("\nMenú\n1:Suma\n2:Resta\n3:División\n4:Multiplicación\n0:Salir\n");
		do {
			System.out.printf("\nIngrese opcion: ");
			opc=sc.nextInt();
		
				switch (opc) {
				case 1:
					operacion=num1+num2;
					System.out.printf("Suma: %s", operacion);
					break;
				case 2:
					operacion=num1-num2;
					System.out.printf("Resta: %s", operacion);
					break;
				case 3:
					operacion=num1/num2;
					System.out.printf("División: %s", operacion);
					break;
				case 4:
					operacion=num1*num2;
					System.out.printf("Multiplicación: %s", operacion);
					break;
				default:
					System.out.printf("Ingrese opcion válida\n");
					break;
				}
			
		}while (opc>0);
	
	}

}



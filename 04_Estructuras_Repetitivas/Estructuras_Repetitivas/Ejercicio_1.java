package Estructuras_Repetitivas;
import java.util.Scanner;
public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		double num, suma;
		suma=0;
		
		for (int i =1; i < 11; i++) {
			System.out.printf("Ingrese valor %s: ",i);
			num= sc.nextDouble();
			suma=suma+num;
		}
		System.out.printf("\n El promedio es: %s",(suma/10));
	}
}

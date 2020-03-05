package Estructuras_Repetitivas;
import java.util.Scanner;
public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		//Desarrollar un programa que muestre la tabla de multiplicar numero 5
		
		
		int n,tabla;
		
		n=0;
		
		
		for (int i=1;i<=10;i++) {
			
			n=n+1;
			tabla= n*5;
			System.out.printf("\n 5 x %s : %s", n, tabla);
			
		}
		
	}

}

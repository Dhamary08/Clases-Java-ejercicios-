package Estructuras_Repetitivas;
import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		double nota;
		int aprob,reprob,MalIngreso;
		
		aprob=0;
		reprob=0;
		MalIngreso=0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Ingrese nota %s: ",i);
			nota=sc.nextDouble();
			if (nota>=4 && nota<=7) {
				aprob=aprob+1;
			}else if (nota<4 && nota>=1) {
			reprob=reprob+1;
			}else{
				MalIngreso=MalIngreso+1;
			}
		}
		System.out.printf("\n Aprobados Total: %s",aprob);
		System.out.printf("\n Reprobado Total: %s",reprob);
		System.out.printf("\n MalIngreso Total: %s",MalIngreso);
	}
}

package Estructuras_Repetitivas;
import java.util.Scanner;
public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Se cuenta con la siguiente inf... las edades de 10 estudiantes de turno de dia
		// de 7 de turno tarde y de 5 de noche...las edades de cada estudiante debe ingresarse
		//por teclado..a)  obtener el prom...edades por cada turno
	
		Scanner sc=new Scanner(System.in);
		int edad;
		double suma1, suma2, suma3, prom1, prom2, prom3;
		
		suma1=0;
		suma2=0;
		suma3=0;
		
		System.out.printf("Ingreso de edades del turno de Manhana \n");
		for(int i=0;i<10;i++) {
			System.out.printf("Ingrese edad de alumno %s: ",(i+1));
			edad=sc.nextInt();
			suma1=suma1+edad;
		}
		
		System.out.printf("Ingreso de edades del turno de Tarde \n");
		for(int i=0;i<7;i++) {
			System.out.printf("Ingrese edad de alumno %s: ",(i+1));
			edad=sc.nextInt();
			suma2=suma2+edad;
		}
	
		System.out.printf("Ingreso de edades del turno de Noche \n");
		for(int i=0;i<5;i++) {
			System.out.printf("Ingrese edad de alumno %s: ",(i+1));
			edad=sc.nextInt();
			suma3=suma3+edad;
		}
		prom1=(suma1/10);
		prom2=(suma2/7);
		prom3=(suma3/5);
		
		System.out.printf("\n Promedio de edad Manhana: %s", prom1);
		System.out.printf("\n Promedio de edad Tarde: %s",prom2);
		System.out.printf("\n Promedio de edad Noche: %s",prom3);
		
		if ((prom1>prom2 && prom1>prom3)||(prom1>=prom2 && prom1>prom3)||(prom1>prom2 && prom1>=prom3)){
			System.out.printf("\n Promedio Manhana es mayor, promedio %s:",prom1);
		}else if ((prom2>prom1 && prom2>prom3)||(prom2>=prom1 && prom2>prom3)||(prom2>prom1 && prom2>=prom3)) {
			System.out.printf("\n Promedio Tarde es mayor, promedio %s: ", prom2);
		}else if((prom3>prom1 && prom3>prom1)||(prom3>=prom1 && prom3>prom1)||(prom3>prom1 && prom3>=prom1)) {
			System.out.printf("\n Promedio Noche es mayor, promedio %s:", prom3);
		}else if (prom1==prom2 && prom2==prom3) {
			System.out.printf("\n El promedio es el mismo para los tres turnos");
		}
		
	}

}

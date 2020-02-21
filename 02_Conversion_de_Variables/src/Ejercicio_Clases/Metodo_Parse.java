package Ejercicio_Clases;
import java.util.Scanner;
public class Metodo_Parse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//de String a Int
		String cadena="123";		
		int entero = Integer.parseInt(cadena);
		System.out.println("Número que era String a entero: " + entero);
		
		//de String a Double
		String numero="12.34";
		double decimal=Double.parseDouble(numero);
		System.out.println("Número que era String a decimal: " + decimal);
		
		//de String a Float
		String num="1.234";
		Float flotante=Float.parseFloat(num);
		System.out.println("Número que era String a flotante: " + flotante);

	}

}

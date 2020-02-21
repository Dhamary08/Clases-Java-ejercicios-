package Ejercicio_Clase;
import java.util.Scanner;
public class Propiedades_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		String palabra= "Talentos Digitales";
		
		//Contar String
		System.out.printf("Tamaño total del String: %s", palabra.length());
		
		//Busca el caracter dentro del String posicion.
		System.out.printf("\nPocision del 7mo caracter: %s", palabra.charAt(6));
		
		//Palabra con inicio desde un caracter
		System.out.printf("\nPalabra desde el tercer caracter: %s", palabra.substring(2));
		
		//Palabra cortada
		System.out.printf("\nCortando palabra: %s", palabra.substring(2, 5));
		
		//String concadenado junta varias palabra
		String palabra1="Talentos";
		String palabra2="Digitales";
		System.out.printf("\nString Concadenado: %s", palabra1.concat(palabra2));
		
		//numero de la primera aparicion de un carcater
		System.out.printf("\nIndice de la primera aparición de la a: %s", palabra.indexOf("a"));
		
		//lo mismo del anterios pero deciso de donde inicia
		System.out.printf("\nIndice de la letra a de comenzando desde la primera a: %s", palabra.indexOf("a",2));
		
		//Compara igualdad de caracter
		String original="Talento";
		String palabra4="Talento";
		String palabra5="talento";
		String palabra6="Talento";
		System.out.printf("\nComparando igualdad de %s con %s es : %s", original, palabra4, original.equals(palabra4));
		System.out.printf("\nComparando igualdad de %s con %s es : %s", original, palabra5, original.equals(palabra5));
		System.out.printf("\nComparando igualdad de %s con %s es : %s", original, palabra6, original.equals(palabra6));
		
		System.out.printf("\n*********************************************************");
		//compara el sentido del String
		System.out.printf("\nComparando 2 igualdad de %s con %s es : %s", original, palabra4, original.equalsIgnoreCase(palabra4));
		System.out.printf("\nComparando 2 igualdad de %s con %s es : %s", original, palabra5, original.equalsIgnoreCase(palabra5));
		System.out.printf("\nComparando 2 igualdad de %s con %s es : %s", original, palabra6, original.equalsIgnoreCase(palabra6));
		
		//Cambiando todas a minusculas
		System.out.printf("\nCambiando a minusculas: %s", palabra.toLowerCase());
		
		//Cambiando a mayusculas
		System.out.printf("\nCambiando a mayusculas: %s", palabra.toUpperCase());
		
		System.out.printf("\nString original: %s", palabra);
		
		//Reemplazo de caracter
		System.out.printf("\nReemplaza da g a y: %s", palabra.replace("g", "j"));
	}

}

package Ejercicio_Math;
import static java.lang.Math.*;
public class BaseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer num1,num2,suma;
		num1=1;
		num2=9;
		
		/*
		 * Metodo que suma
		 */
		suma=Math.addExact(num1,num2);
		System.out.printf("La suma de dos numeros es %s\n",suma);
		
		/*
		 * Método ceil devuelve un entero de un double y la parte decimal la entrega como 0
		 */
		
		System.out.printf("\nel número 25.78 es --> %s", Math.ceil(25.78));
		System.out.printf("\nel número 25.3 es --> %s", Math.ceil(25.3));
		System.out.printf("\nel número 2.9 es --> %s", Math.ceil(2.9));
		System.out.printf("\nel número -1.29 es --> %s", Math.ceil(-1.29));
		System.out.printf("\nel número -1.885 es --> %s", Math.ceil(-1.885));
		
		/*
		 * Método que redondea
		 */
		System.out.printf("\n\nMetodo Redondeo");
		System.out.printf("\nel número 33.2 es --> %s", Math.round(33.2));
		System.out.printf("\nel número 24.5 es --> %s", Math.round(24.5));
		System.out.printf("\nel número 42.4 es --> %s", Math.round(42.4));
		System.out.printf("\nel número 59.9996 es --> %s", Math.round(59.9996));

		/*
		 * Metodo Random random()*final+inicio
		 */
		System.out.printf("\n\nNumero al azar");
		System.out.printf("\nNúmero al azar es: %s",Math.random()*25+1);
		
		
		/*
		 *  Metodo Random random()*final+inicio ENTERO
		 */
		System.out.printf("\n\nNúmero al azar pero entero");
		int resultado = (int)(Math.random()*25+1);
		System.out.printf("\nNúmero Entero al azar %s", resultado);
		
		
		/*
		 * hypot sqrt(x2+y2) devuelve el valor del metodo
		 */
		
		System.out.printf("\n\nMétodo Raiz cuadrada");
		double num3=25;
		double num4=44;
		double resultado1= Math.hypot(num3, num4);
		System.out.printf("\nEl resultado de la raiz cuadrada de 2 numero es: %s", resultado1);
		
		
		/*
		 * Logaritmo natural
		 */
		
		System.out.printf("\n\nMétodo Logaritmo natural");
		double num5=5;
		double resultado2=Math.log(num5);
		System.out.printf("\nEl resultado del log natutal %s es: %s", Math.round(num5),resultado2);
		
		/*
		 * Devuelve el numero mayor
		 */
		
		System.out.printf("\n\nEl número mayor");
		int num6=8;
		int num7=5;
		int resultado3= Math.max(num6, num7);
		System.out.printf("\nEL numero mayore entre (%s, %s): %s", num6,num7,resultado3);
		
		/*
		 * Devuelve el numero menor
		 */
		
		System.out.printf("\n\nEl número menor");
		int num8=8;
		int num9=5;
		int resultado4= Math.min(num8, num9);
		System.out.printf("\nEL numero mayore entre (%s, %s): %s", num8,num9,resultado4);
		
		/*
		 * Potencia
		 */
		
		System.out.printf("\n\nPotencia");
		System.out.printf("\nElevar 5 a la potencia 2 es: %s", Math.round(Math.pow(5, 2)));
		
		/*
		 * Raiz
		 */
		
		System.out.printf("\n\nRaiz");
		System.out.printf("\nLa Raiz cuadrada de 81 es: %s", Math.sqrt(81));
		
		
		/*
		 * resta
		 */
		
		System.out.printf("\n\nResta dos numeros");
		int num10=97;
		int num11=23;
		int resultado5= Math.subtractExact(num10, num11);
		System.out.printf("\nEL numero mayore entre (%s, %s): %s", num10,num11,resultado5);
		
		
	}

}

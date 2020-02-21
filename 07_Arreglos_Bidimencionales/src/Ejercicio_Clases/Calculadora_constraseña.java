/**
 * Mejore su el programa de calculadora, debe validar datos numéricos , 
 * manejo de errores, además de  un debe tener un Usuario y password, 
 * el cual luego de errar 3 veces, cerrara nuestro programa. 
 * Nuestro programa no se debe cerrar,hasta que el usuario desee salir.
 * Debe existir la opción de seguir realizando otras operaciones hasta 
 * que el usuario desee salir.
 */
package Ejercicio_Clases;

import java.util.Scanner;

public class Calculadora_constraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double num1, num2, operacion;
		String userMaster, user, key, keyMaster;
		int opc, calculadora;

		boolean salir = false;

		// Usuario y Contraseña
		userMaster = "cal";
		keyMaster = "1234";
		int error = 0;

		do {
			System.out.printf("1: ingresar \n2: terminar \nQue desea hacer= ");
			opc = sc.nextInt();
			/*
			 * Para terminar el da calculadora.
			 */
			if (opc == 2) {
				break;
			}

			/*
			 * Continua pidiendo usuarios
			 */
			System.out.printf("ingrese usuario: ");
			user = sc.next();
			System.out.printf("Ingrese Clave: ");
			key = sc.next();

			if (user.equals(userMaster) && key.equals(keyMaster)) { // contraseña y usuario son válidos igualdad de
																	// string
				salir = false; // TERMINA EL CICLO

				/*
				 * CALCULADORA INICO
				 */

				// Pedir numeros y cambiar a int
				System.out.printf("\ningrese numero 1: ");
				num1 = sc.nextInt();
				System.out.printf("Ingrese numero 2: ");
				num2 = sc.nextInt();

				// Menu stwich calculadora
				System.out.printf("\n   Menu");
				System.out.printf("\n 0: Salir de la Calculadora");
				System.out.printf("\n 1: Suma");
				System.out.printf("\n 2: Resta");
				System.out.printf("\n 3: Multiplicacion");
				System.out.printf("\n 4: Division\n");

				do {
					System.out.printf("\nIngrese opcion: ");
					calculadora = sc.nextInt();

					switch (calculadora) {
					case 1:
						operacion = num1 + num2;
						System.out.printf("\nSuma: %s\n", operacion);
						break;
					case 2:
						operacion = num1 - num2;
						System.out.printf("\nResta: %s\n", operacion);
						break;
					case 3:
						operacion = num1 * num2;
						System.out.printf("\nMultiplicación: %s\n", operacion);
						break;
					case 4:
						operacion = num1 / num2;
						System.out.printf("\nDivision: %s\n", operacion);
						break;
					default:
						System.out.printf("\nIngrese opcion válida");
						break;
					}
				} while (calculadora > 0);

			} else {
				System.out.printf("\n\"usuario o contraseña son incorrectos\"\n");
				error++;
				System.out.printf("\"Recuerde le quedan %s intentos\"\n", (3 - error));
				salir = false;
				System.out.printf("         error n°: %s\n\n", error);
			}

			if (error == 3) {
				System.out.printf("               \"FIN\"");
				break;
			}

		} while (salir == false);

	}

}

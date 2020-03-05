package Paises;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Secundario oMundo = new Secundario();
		
		
		boolean salir = true;
		
		
		do {
			System.out.printf("    Menú de Paises y Ciudades");
			System.out.printf("\nOpción 1: Ingresar ");
			System.out.printf("\nOpción 2: Tamaño ");
			System.out.printf("\nOpción 3: Ver ");
			System.out.printf("\nOpción 4: Buscar");
			System.out.printf("\nOpción 5: Modificar ");
			System.out.printf("\nOpción 6: Eliminar ");
			System.out.printf("\nOpcion 0: Salir");
			System.out.printf("\nIngrese Opción: ");
			String opc = sc.nextLine();

			switch (opc) {
			case "0":
				System.out.printf("\n\n***************************  Gracias  ***************************");
				System.out.printf("\n****************************  Adios  *****************************");
				salir = false;
				break;

			case "1":
				
				oMundo.ingresarDatos();
				
				
				System.out.printf("\n************************************");
				System.out.printf("\nPresione enter para continuar ");
				System.out.printf("\n\n");

				break;
			case "2":
				System.out.printf("\n\n\n\n");
				oMundo.tamañoArrays();
				System.out.printf("\n\n\n\n");
				
				System.out.printf("\nPresione enter para continuar ");
				System.out.printf("\n\n");
				break;

			case "3":
				System.out.printf("\n\n\n\n");
				oMundo.verDatos();
				System.out.printf("\n\n\n\n");
				
				System.out.printf("\nPresione enter para continuar ");
				System.out.printf("\n\n");
				break;
				
			case "4":
				
				System.out.printf("\n\n\n\n");
				oMundo.buscarDatos();
				System.out.printf("\n\n\n\n");
				
				System.out.printf("\nPresione enter para continuar ");
				System.out.printf("\n\n");
				
				break;
				
			case"5":
				System.out.printf("\n");
				oMundo.modificarDatos();
				System.out.printf("\n\n");
				break;
			case "6":
				System.out.printf("\n\n\n\n");
				oMundo.eliminarDatos();
				System.out.printf("\n\n\n\n");
			default:
				System.out.printf("\n\n\n************************************\n");
				System.out.printf("\n\n\"Opción ingresada no es válida\"\n");
				System.out.printf("\n\n************************************\n");

				System.out.printf("\nPresione enter para continuar ");
				break;
			}

		} while (salir);

	}

}

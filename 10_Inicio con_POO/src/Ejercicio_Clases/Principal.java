package Ejercicio_Clases;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.printf("       Menú      ");

		boolean salir = true;
		String siguiente;

		do {
			System.out.printf("\nOpción 1: Datos de Persona -- Método To String");
			System.out.printf("\nOpción 2: Ver Datos de Productos -- Método Get");
			System.out.printf("\nOpción 3: Ver datos de Libreria -- Método Getter & Setter");
			System.out.printf("\nOpcion 0: Salir");
			System.out.printf("\nIngrese Opción: ");
			String opc = sc.nextLine();

			switch (opc) {
			case "0":
				System.out.printf("\n\n***************************  Gracias  ***************************");
				System.out.printf("\n****************************  Adios  *****************************");
				salir = false;
				break;

			case "1": // Datos de personas
				System.out.printf("\n\n\n************************************");
				Persona oPersona0 = new Persona("Camino", "Esperanza", "Fin", "12.122.236-4");
				Persona oPersona1 = new Persona("Hola", "Chao", "Dia", "13.324.544-5");
				System.out.printf("\n %s", oPersona0.toString());
				System.out.printf("\n %s", oPersona1.toString());
				System.out.printf("\n************************************");
				System.out.printf("\nPresione enter para continuar");
				siguiente = sc.nextLine();

				break;

			case "2":// Alamacen
				System.out.printf("\n\n\n************************************");
				Almacen oProducto0 = new Almacen("Arroz", 755, 33442112);
				Almacen oProducto1 = new Almacen("Pan", 899, 255342666);
				System.out.printf("\n Registro de producto: %s, $ %s pesos, cod.: %s", oProducto0.getsNombre(),
						oProducto0.getiPrecio(), oProducto0.getiCodigo());
				System.out.printf("\n Registro de producto: %s, $ %s pesos, cod.: %s", oProducto1.getsNombre(),
						oProducto1.getiPrecio(), oProducto1.getiCodigo());
				System.out.printf("\n************************************");
				System.out.printf("\nPresione enter para continuar");
				siguiente = sc.nextLine();
				break;
			
			case "3": // Libreria

				Libro Texto1 = new Libro("Principito", "Le Petit Prince", 3, 2);
				Libro Texto2 = new Libro("Cien anhos de Soledad", "Gabriel García Márquez", 12, 5);
				System.out.printf("\n\n\n************************************");
				System.out.printf("\nLibros 1: %s y Autor %s\n", Texto1.getsTitulo(), Texto1.getsAutor());
				System.out.printf("Cant de Libros Total: %s \nTotal de Libros prestados: %s\n",
						Texto1.getiNumEjemplares(), Texto1.getiNumPrestamo());
				System.out.printf("Libros 2: %s y Autor %s\n", Texto2.getsTitulo(), Texto2.getsAutor());
				System.out.printf("Cant de Libros Total: %s \nTotal de Libros prestados: %s\n",
						Texto2.getiNumEjemplares(), Texto2.getiNumPrestamo());

				System.out.println("\n---Cambio metodo SET Libro 2----\n");
				Texto1.setsAutor("Antoine de Saint-Exupéry");
				Texto1.setiNumEjemplares(15);
				System.out.printf("Libros 2: %s y Autor %s\n", Texto1.getsTitulo(), Texto1.getsAutor());
				System.out.printf("Cant de Libros Total: %s \nTotal de Libros prestados: %s\n",
						Texto1.getiNumEjemplares(), Texto1.getiNumPrestamo());

				System.out.printf("\n************************************");
				System.out.printf("\nPresione enter para continuar");
				siguiente = sc.nextLine();
				break;
			
			case"4": //Empresa
				System.out.printf("\n\n\n************************************");
				Empresa Trabajador1 = new Empresa("Jose", "Peres", 45);
				System.out.printf("\n Trabajador 1: %s  %s \n", Trabajador1.getNombre(), Trabajador1.getApellido());
				Trabajador1.VerSueldo();
				Empresa Trabajador2 = new Empresa("Luisa", "Mesa", 24);
				System.out.printf("\n Trabajador 2: %s  %s \n", Trabajador2.getNombre(), Trabajador2.getApellido());
				Trabajador2.VerSueldo();
				
				System.out.printf("\n************************************");
				System.out.printf("\nPresione enter para continuar");
				siguiente = sc.nextLine();
				break;

			default:
				System.out.printf("\n\n\n************************************\n");
				System.out.printf("\n\n\"Opción ingresada no es válida\"\n");
				System.out.printf("\n\n************************************\n");
			
				System.out.printf("\nPresione enter para continuar");
				siguiente = sc.nextLine();
				break;
			}
		} while (salir);

	}

}

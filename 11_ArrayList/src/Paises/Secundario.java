package Paises;

import java.util.ArrayList;
import java.util.Scanner;

public class Secundario {

	Scanner sc = new Scanner(System.in);

	// DECLARACION de variables

	public String sPais;
	public String sCapital;

	ArrayList<Secundario> arrMundo = new ArrayList<Secundario>();

	// Contructur Vacio
	public Secundario() {
		super();
	}

	// Contructor con parametros
	public Secundario(String sPais, String sCapital) {

		this.sPais = sPais;
		this.sCapital = sCapital;
	}

	// GETTERS and SETTERS
	public String getsPais() {
		return sPais;
	}

	public void setsPais(String sPais) {
		this.sPais = sPais;
	}

	public String getsCapital() {
		return sCapital;
	}

	public void setsCapital(String sCapital) {
		this.sCapital = sCapital;
	}

	/*
	 * Ingresar un dato solicitado y guardarlo en el array
	 */
	public void ingresarDatos() {

		System.out.printf("Ingrese Pais: ");
		sPais = sc.nextLine();
		System.out.printf("Ingrese la \"Capital\" de %s: ", sPais);
		sCapital = sc.nextLine();
		Secundario ingreso = new Secundario(sPais, sCapital);
		arrMundo.add(1, ingreso);
	}

	/*
	 * Ver Tamaño del array
	 */
	public void tamañoArrays() {
		System.out.printf("El tamaño total del arreglo es: %s \n", arrMundo.size());
	}

	/*
	 * Ver Datos del arraylist
	 */
	public void verDatos() {

		for (int i = 0; i < arrMundo.size(); i++) {
			System.out.printf("\n%s: %s --- %s", i, arrMundo.get(i).getsPais(), arrMundo.get(i).getsCapital());
		}

	}
	/*
	 * Buscar un dato arroga una pocsion
	 */
	
	public void buscarDatos() {
		
		System.out.printf("\nIngrese Pais o Ciudad a buscar: ");
		String Search=sc.nextLine();
		int pos=arrMundo.indexOf(Search);
		if(pos!=-1) {
			System.out.printf("Se ha encontrado en la posicion: %s",pos);
		}else {
			System.out.printf("el %s no se ha encontrado", Search);
		}
	}
	
	
	
	/*
	 * Método Verificador
	 */

	public boolean Verificador(String retiro) {
		try {
			Integer.parseInt(retiro);
			return true;
		} catch (Exception e) {
			System.out.println("No es un número válido");
			System.out.printf("Ingrese solo valores numericos");
			return false;
		}
	}

	/*
	 * Modificar datos de un arraylist
	 */

	boolean salir = true;

	public void modificarDatos() {

		do {

			System.out.printf("Ingrese la opcion a modificar cambiar: ");
			String pocision = sc.next();

			boolean examinar = this.Verificador(pocision);
			if (examinar) {
				int y = Integer.parseInt(pocision);
				System.out.printf("Pais a reemplazar: ");
				String sPaisReemplazo = sc.next();
				System.out.printf("Ciudad del %s: ", sPaisReemplazo);
				String sCiudadReemplazo = sc.next();
				Secundario Reemplazo = new Secundario(sPaisReemplazo, sCiudadReemplazo);
				arrMundo.set(y, Reemplazo);
				salir = false;
			} else {
				salir = true;
			}

		} while (salir);

	}

	/*
	 * eliminar datos de un arraylist
	 */
	public void eliminarDatos() {
		do {
			
		} while (salir);

	}

}

package Ejercicio_Clases;

import java.util.Scanner;

public class Persona {

	Scanner sc = new Scanner(System.in);

	String Nombre, Apellido, Domicilio, Rut;

	// contructor vacio
	public Persona() {
		super();
	}

	// Contructor con parametros
	public Persona(String nombre, String apellido, String domicilio, String rut) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Domicilio = domicilio;
		Rut = rut;
	}

	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Domicilio=" + Domicilio + ", Rut=" + Rut
				+ "]";
	}

}

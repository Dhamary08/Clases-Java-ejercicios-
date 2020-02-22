/*
 * Se desea guardar los datos de trabajadores de una empresa los 
 * cuales son Nombre, apellido, edad , sueldo . Si el trabajador 
 * tiene mas de 40 años recibirá un bono extra a su sueldo.Realice 
 * la correspondiente clase, finalmente imprima los datos de trabajadores. 
 * Con su correspondiente bono, si corresponde al caso.
 */
package Ejercicio_Clases;

public class Empresa {

	private String Nombre, Apellido;
	private int edad, sueldo, bono, sueldoFinal;
	
	//constructor por defecto
	public Empresa() {
		
	}

	//contructor parametro
	public Empresa(String nombre, String apellido, int edad) {
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.edad = edad;
		this.sueldo = sueldo;
		this.bono = bono;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void VerSueldo() {
		bono=40000;
		sueldo=200000;
		if(edad>=40){
			sueldoFinal=sueldo+bono;
		}else if (edad<40) {
			sueldoFinal=sueldo;
		}
		System.out.printf("Sueldo Total es: $ %s", sueldoFinal);
	}	
	
	
	
}
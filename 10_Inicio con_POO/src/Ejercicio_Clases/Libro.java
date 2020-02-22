/*
 * Crea una clase llamada Libro que guarde la información de cada uno de los 
 * libros de una biblioteca. La clase debe guardar el título del libro, autor, 
 * número de ejemplares del libro y número de ejemplares prestados. 
 * La clase contendrá los siguientes métodos:
 * 
 * 1) Constructor por defecto.
 * 2) Constructor con parámetros.
 * 3) Métodos Setters/getters 
 * imprima algún libro luego de hacer el correspondiente set a sus datos.
 */
package Ejercicio_Clases;

public class Libro {

	String sTitulo, sAutor;
	Integer iNumEjemplares, iNumPrestamo;

	// Constructor por Defecto
	public Libro() {
		super();
	}

	// Constructor con parámetro
	public Libro(String sTitulo, String sAutor, Integer iNumEjemplares, Integer iNumPrestamo) {
		super();
		this.sTitulo = sTitulo;
		this.sAutor = sAutor;
		this.iNumEjemplares = iNumEjemplares;
		this.iNumPrestamo = iNumPrestamo;
	}

	// GETTERS
	public String getsTitulo() {
		return sTitulo;
	}

	public String getsAutor() {
		return sAutor;
	}

	public Integer getiNumEjemplares() {
		return iNumEjemplares;
	}

	public Integer getiNumPrestamo() {
		return iNumPrestamo;
	}

	// SETTERS
	public void setsTitulo(String sTitulo) {
		this.sTitulo = sTitulo;
	}

	public void setsAutor(String sAutor) {
		this.sAutor = sAutor;
	}

	public void setiNumEjemplares(Integer iNumEjemplares) {
		this.iNumEjemplares = iNumEjemplares;

	}
	public void setiNumPrestamo(Integer iNumPrestamo) {
		this.iNumPrestamo = iNumPrestamo;

	}
}

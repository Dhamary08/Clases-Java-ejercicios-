/*
 * Crea una clase llamada Libro�que guarde la informaci�n de cada uno de los 
 * libros de una biblioteca. La clase debe guardar el t�tulo del libro, autor, 
 * n�mero de ejemplares del libro y n�mero de ejemplares prestados. 
 * La clase contendr� los siguientes m�todos:
 * 
 * 1) Constructor por defecto.
 * 2) Constructor con par�metros.
 * 3) M�todos Setters/getters 
 * imprima alg�n libro luego de hacer el correspondiente set a sus datos.
 */
package Ejercicio_Clases;

public class Libro {

	String sTitulo, sAutor;
	Integer iNumEjemplares, iNumPrestamo;

	// Constructor por Defecto
	public Libro() {
		super();
	}

	// Constructor con par�metro
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

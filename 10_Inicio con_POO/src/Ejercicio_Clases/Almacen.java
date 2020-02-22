/*
 *2.- Una almacén necesita tener registro de sus productos, para ellos se nos 
 *pide realizar un programa que guarde código, Nombre y precio. 
 *Mostrar los datos ingresado con un método get.
 */
/*
 * Get = obtener
 */
package Ejercicio_Clases;
import java.util.Scanner;
public class Almacen {

	Scanner sc = new Scanner(System.in);
	
	String sNombre;
	Integer iPrecio, iCodigo;
	
	//Contructor Vacio
	public Almacen() {
		super();
	}

	//Parametros
	public Almacen(String sNombre, Integer iPrecio, Integer iCodigo) {
		super();
		this.sNombre = sNombre;
		this.iPrecio = iPrecio;
		this.iCodigo = iCodigo;
	}

	public String getsNombre() {
		return sNombre;
	}

	public Integer getiPrecio() {
		return iPrecio;
	}

	public Integer getiCodigo() {
		return iCodigo;
	}
	
	
	
	
}

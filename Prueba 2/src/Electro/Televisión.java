/**
 * @author Valeria Manriquez
 */
package Electro;

public class Televisi�n extends Electrodom�stico {

	/*
	 * Sus atributos son resoluci�n (en pulgadas) y sintonizador TDT (booleano),
	 * adem�s de los atributos heredados.
	 */

	// Variable
	private Double dResolucion;
	private Boolean bSintonizador;

	// Constante
	private final static double RESOLUCION_DEFECTO = 20;

	/*
	 * GETTER
	 */

	public double getdResolucion() {
		return dResolucion;
	}

	public boolean isbSintonizador() {
		return bSintonizador;
	}

	public static double getResolucionDefecto() {
		return RESOLUCION_DEFECTO;
	}

	/*
	 * Constructores
	 */
	public Televisi�n() {
		this(COLOR_DEFEFECTO, CONS_ENER_DEFECTO, PRECIO_DEFECTO, PRECIO_DEFECTO, RESOLUCION_DEFECTO, false);
	}

	public Televisi�n(double dPrecioBase, double dPeso) {
		super(dPrecioBase, dPeso);
		// TODO Auto-generated constructor stub
	}

	public Televisi�n(String sColor, char sConsumoEnergetico, double dPrecioBase, double dPeso, double dResolucio,
			boolean bSintonizador) {
		super(sColor, sConsumoEnergetico, dPrecioBase, dPeso);
		this.dResolucion = dResolucion;
		this.bSintonizador=bSintonizador;
	}

}

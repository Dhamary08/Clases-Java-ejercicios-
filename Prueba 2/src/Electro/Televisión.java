package Electro;

public class Televisi�n extends Electrodom�stico {

	/*
	 * Sus atributos son resoluci�n (en pulgadas) y sintonizador TDT (booleano),
	 * adem�s de los atributos heredados.
	 */

	protected Double dResolucion;
	protected Boolean bSintonizador;

	/*
	 * Por defecto, la resoluci�n ser� de 20 pulgadas y el sintonizador ser� false
	 */

	protected final static double RESOLUCION_DEFECTO = 20;
	protected final static boolean SINTONIZADOR_DEFECTO = false;

	/*
	 * Un constructor vacio.
	 */
	public Televisi�n(double dResolucion, boolean bSintonizador) {
		super();
		this.dResolucion = dResolucion;
		this.bSintonizador = bSintonizador;
	}

	// Un constructor con el precio y peso. El resto por defecto.

	public Televisi�n(double dPrecioBase, double dPeso, Double dResolucion, Boolean bSintonizador) {
		super(dPrecioBase, dPeso);
		this.dResolucion = RESOLUCION_DEFECTO;
		this.bSintonizador = SINTONIZADOR_DEFECTO;
	}

	// herencia +++++ agregados
	public Televisi�n(String sColor, char sConsumoEnergetico, double dPrecioBase, double dPeso, Double dResolucion,
			Boolean bSintonizador) {
		super(sColor, sConsumoEnergetico, dPrecioBase, dPeso);
		this.dResolucion = dResolucion;
		this.bSintonizador = bSintonizador;
	}

	/*
	 * Getter
	 */

	public Double getdResolucion() {
		return dResolucion;
	}

	public Boolean getbSintonizador() {
		return bSintonizador;
	}

	public static double getResolucionDefecto() {
		return RESOLUCION_DEFECTO;
	}

	public static boolean isSintonizadorDefecto() {
		return SINTONIZADOR_DEFECTO;
	}

	/*
	 * precioFinal(): si tiene una resoluci�n mayor de 40 pulgadas, se incrementara
	 * el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 �.
	 * Recuerda que las condiciones que hemos visto en la clase Electrodom�stico
	 * tambi�n deben afectar al precio.
	 */

	public double precioFinal() {

		double dValorFinal = super.precioFinal();

		if (dResolucion > 40) {
			dValorFinal+= dPrecioBase*0.3;
		}
		if (bSintonizador) {
			dValorFinal+=50;
		}

		return dValorFinal;
	}

}

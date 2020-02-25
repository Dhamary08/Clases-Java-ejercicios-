package Electro;

public class Televisión extends Electrodoméstico {

	/*
	 * Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano),
	 * además de los atributos heredados.
	 */

	protected Double dResolucion;
	protected Boolean bSintonizador;

	/*
	 * Por defecto, la resolución será de 20 pulgadas y el sintonizador será false
	 */

	protected final static double RESOLUCION_DEFECTO = 20;
	protected final static boolean SINTONIZADOR_DEFECTO = false;

	/*
	 * Un constructor vacio.
	 */
	public Televisión(double dResolucion, boolean bSintonizador) {
		super();
		this.dResolucion = dResolucion;
		this.bSintonizador = bSintonizador;
	}

	// Un constructor con el precio y peso. El resto por defecto.

	public Televisión(double dPrecioBase, double dPeso, Double dResolucion, Boolean bSintonizador) {
		super(dPrecioBase, dPeso);
		this.dResolucion = RESOLUCION_DEFECTO;
		this.bSintonizador = SINTONIZADOR_DEFECTO;
	}

	// herencia +++++ agregados
	public Televisión(String sColor, char sConsumoEnergetico, double dPrecioBase, double dPeso, Double dResolucion,
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
	 * precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara
	 * el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €.
	 * Recuerda que las condiciones que hemos visto en la clase Electrodoméstico
	 * también deben afectar al precio.
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

package Electro;

public class Lavadora extends Electrodoméstico {

	/*
	 * Su atributo es carga, además de los atributos heredados
	 */
	protected Double dCarga;

	/*
	 * Por defecto, la carga es de 5 kg. Usa una constante para ello.
	 */
	protected final static double CARGA_DEFECTO = 5;

	/*
	 * Un constructor de carga.
	 */
	public Lavadora(Double dCarga) {
		super();
		this.dCarga = dCarga;
	}

	/*
	 * Constructor por defecto.
	 */
	public Lavadora() {
		super();
		this.dCarga = CARGA_DEFECTO;
	}

	// Constructor de precio y peso heredados
	public Lavadora(double dPrecioBase, double dPeso) {
		super(dPrecioBase, dPeso);
		
	}

	// herencia completa del padre (electrodomestico)
	public Lavadora(String sColor, char sConsumoEnergetico, double dPrecioBase, double dPeso) {
		super(sColor, sConsumoEnergetico, dPrecioBase, dPeso);
		
	}

	// herencia ++++ valor agregado
	public Lavadora(String sColor, char sConsumoEnergetico, double dPrecioBase, double dPeso, double dCarga) {
		super(sColor, sConsumoEnergetico, dPrecioBase, dPeso);
		this.dCarga = dCarga;
	
	}

	/*
	 * Getter
	 */

	public Double getdCarga() {
		return dCarga;
	}

	public static double getCargaDefecto() {
		return CARGA_DEFECTO;
	}

	/*
	 * precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €,
	 * sino es así no se incrementara el precio. Llama al método padre y añade el
	 * código necesario. Recuerda que las condiciones que hemos visto en la clase
	 * Electrodoméstico también deben afectar al precio.
	 */
	
	public double precioFinal() {
		
		double dValorFinal = super.precioFinal();
		
		if(dCarga>30.0) {
			dValorFinal+=50.0;
		}
		
		return dValorFinal;

	}

}

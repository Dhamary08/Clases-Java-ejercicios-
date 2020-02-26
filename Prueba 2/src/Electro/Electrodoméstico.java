/**
 * @author Valeria Manriquez
 */
package Electro;

public class Electrodoméstico {

	/*
	 * Definición de variables
	 */
	protected String sColor;
	protected char cConsumoEnergetico; // de la A a la F
	protected double dPrecioBase, dPeso;

	/*
	 * constante por defecto
	 */

	protected final static String COLOR_DEFEFECTO = "Blanco";
	protected final static char CONS_ENER_DEFECTO = 'F';
	protected final static double PRECIO_DEFECTO = 100.000;
	protected final static double PESO_DEFECTO = 5;

	/*
	 * Getter
	 */

	public String getsColor() {
		return sColor;
	}

	public char getcConsumoEnergetico() {
		return cConsumoEnergetico;
	}

	public double getPrecioBase() {
		return dPrecioBase;
	}

	public double getPeso() {
		return dPeso;
	}

	public static String getColorDefefecto() {
		return COLOR_DEFEFECTO;
	}

	public static char getConsEnerDefecto() {
		return CONS_ENER_DEFECTO;
	}

	public static double getPrecioDefecto() {
		return PRECIO_DEFECTO;
	}

	public static double getPesoDefecto() {
		return PESO_DEFECTO;
	}

	/*
	 * METODOS
	 */

	/*
	 * comprobarColor(String sColor):Los sColores disponibles son blanco, negro,
	 * rojo, azul y gris. No importa si el nombre está en mayúsculas o en
	 * minúsculas. Comprueba que el sColor es correcto, sino lo es usa el sColor por
	 * defecto. Se invocará al crear el objeto y no será visible.
	 */

	public void comprobarColor(String sColor) {
		String sColorDisponibles[] = { "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" };
		boolean salir = false;
		// busca los parametro
		for (int i = 0; i < sColorDisponibles.length && !salir; i++) {
			if (sColorDisponibles[i].equals(sColor)) {
				salir = true;
			}
		}
		// genera caracter del sColor
		if (salir) {
			this.sColor = sColor;
		} else {
			this.sColor = COLOR_DEFEFECTO;
		}
	}

	/*
	 * comprobarConsumoEnergetico(char letra):comprueba que la letra es correcta,
	 * sino es correcta usara la letra por defecto. Se invocará al crear el objeto y
	 * no sera visible.
	 */

	public void comprobarConsumoEnergetico(char consumoEnergetico) {

		if (cConsumoEnergetico >= 65 && cConsumoEnergetico <= 70) {
			this.cConsumoEnergetico = cConsumoEnergetico;
		} else {
			this.cConsumoEnergetico = CONS_ENER_DEFECTO;
		}

	}

	/*
	 * precioFinal():según el consumo energético, aumentara su precio, y según su
	 * tamaño también.
	 */

	public double precioFinal() {
		double dValorFinal = 0;
		/*
		 * Valor del consumo Energetico
		 */
		if (cConsumoEnergetico == 'A') {
			dValorFinal += 100.0;
		} else if (cConsumoEnergetico == 'B') {
			dValorFinal = dValorFinal + 80.0;
		} else if (cConsumoEnergetico == 'C') {
			dValorFinal = dValorFinal + 60.0;
		} else if (cConsumoEnergetico == 'D') {
			dValorFinal = dValorFinal + 50.0;
		} else if (cConsumoEnergetico == 'E') {
			dValorFinal = dValorFinal + 30.0;
		} else if (cConsumoEnergetico == 'F') {
			dValorFinal = dValorFinal + 10.0;
		}

		/*
		 * Agrega el peso
		 */
		if (dPeso > 0 && dPeso <= 19) {
			dValorFinal = dValorFinal + 10.0;
		} else if (dPeso > 19 && dPeso <= 49) {
			dValorFinal = dValorFinal + 50.0;
		} else if (dPeso > 49 && dPeso <= 79) {
			dValorFinal = dValorFinal + 80.0;
		} else if (dPeso > 79) {
			dValorFinal = dValorFinal + 100.0;
		}

		return dValorFinal + dPrecioBase;
	}

	public Electrodoméstico() {
		this(COLOR_DEFEFECTO, CONS_ENER_DEFECTO, PRECIO_DEFECTO, PESO_DEFECTO);
	}

	/*
	 * Un constructor con el precio y dPeso. El resto por defecto
	 */
	public Electrodoméstico(double dPrecioBase, double dPeso) {
		this(COLOR_DEFEFECTO, CONS_ENER_DEFECTO, dPrecioBase, dPeso);
	}

	/*
	 * Un constructor con todos los atributos.
	 */

	public Electrodoméstico(String sColor, char sConsumoEnergetico, double dPrecioBase, double dPeso) {
		comprobarColor(sColor);
		comprobarConsumoEnergetico(sConsumoEnergetico);
		this.dPrecioBase = dPrecioBase;
		this.dPeso = dPeso;
	}
}

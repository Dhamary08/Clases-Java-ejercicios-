
/**
 * package Electro;
 * @author Valeria Manriquez
 *
 */
package Electro;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Declaracion de variables
		 */

		double sSumaElectrodomestico = 0;
		double sSumaLavadora = 0;
		double sSumaTelevision = 0;

		/*
		 * Crea un array de Electrodomésticos de 10 posiciones. Asigna a cada posición
		 * un objeto de las clases anteriores con los valores que desees.
		 */

		Electrodoméstico arrListElect[] = new Electrodoméstico[10];

		// Asignamos cada una de las posiciones como queramos

		arrListElect[0] = new Electrodoméstico("VERDE", 'A', 654, 30);
		arrListElect[1] = new Lavadora("BLANCO", 'B', 800, 30, 12);
		arrListElect[2] = new Televisión();
		arrListElect[3] = new Electrodoméstico();
		arrListElect[4] = new Electrodoméstico(300, 45);
		arrListElect[5] = new Lavadora("AZUL", 'C', 598, 15, 44);
		arrListElect[6] = new Televisión("ROJO", 'F', 635, 890, 54, false);
		arrListElect[7] = new Lavadora("BLANCO", 'E', 435, 75, 31);
		arrListElect[8] = new Televisión("NEGRO", 'D', 453, 55, 33, false);
		arrListElect[9] = new Electrodoméstico("AMARILLO", 'D', 432, 38);

		/*
		 * ▪ Deberás mostrar el precio de cada clase, es decir, el precio de todas las
		 * televisiones, por un lado, el de las lavadoras por otro y la suma de los
		 * Electrodomésticos (puedes crear objetos Electrodoméstico, pero recuerda que
		 * Televisión y Lavadora también son electrodomésticos). Recuerda el uso
		 * operador instanceof.
		 */

		for (int i = 0; i < 3; i++) {
			if (arrListElect[i] instanceof Electrodoméstico) {
				sSumaElectrodomestico = sSumaElectrodomestico + arrListElect[i].precioFinal();
			}
			if (arrListElect[i] instanceof Lavadora) {
				sSumaLavadora = sSumaLavadora + arrListElect[i].precioFinal();
			}
			if (arrListElect[i] instanceof Televisión) {
				sSumaTelevision = sSumaTelevision + arrListElect[i].precioFinal();
			}
		}

		/*
		 * Resultados
		 */

		sSumaElectrodomestico = Math.round(sSumaElectrodomestico);
		sSumaLavadora = Math.round(sSumaLavadora);
		sSumaTelevision = Math.round(sSumaTelevision);

		System.out.printf("\nLa suma del precio de los Electrodomésticos: $ %s pesos",
				(Math.round(sSumaElectrodomestico)));
		System.out.printf("\nLa suma del precio de los Lavadora: $ %s pesos", sSumaLavadora);
		System.out.printf("\nLa suma del precio de los Televisión: $ %s pesos", sSumaTelevision);
	}

}

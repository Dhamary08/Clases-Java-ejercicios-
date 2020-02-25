package Electro;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Declaracion de variables
		 */
		
		double sSumaElectrodomestico=0;
		double sSumaLavadora=0;
		double sSumaTelevision=0;
		
		/*
		 * Crea un array de Electrodomésticos de 10 posiciones. Asigna a cada posición
		 * un objeto de las clases anteriores con los valores que desees.
		 */

		Electrodoméstico arrListElect[] = new Electrodoméstico[10];

		// Asignamos cada una de las posiciones como queramos
		
		arrListElect[0] = new Electrodoméstico(500, 300);
		arrListElect[1] = new Lavadora(500, 889);
		arrListElect[2] = new Televisión("AZUL", 'C', 500.0, 870.0, 90.0, false);
		arrListElect[3] = new Electrodoméstico("MORADO", 'F', 600, 900);
		arrListElect[4] = new Lavadora("CAFE", 'A', 580, 600, 908);
		arrListElect[5] = new Televisión("NEGRO", 'E', 500.0, 987.0, 500.0, false);
		arrListElect[6] = new Electrodoméstico();
		arrListElect[7] = new Lavadora(200, 300);
		arrListElect[8] = new Televisión("ROSADO", 'D', 500.0, 400.0, 870.0, true);
		arrListElect[9] = new Electrodoméstico(530, 800);


		
		/*
		 * ▪ Deberás mostrar el precio de cada clase, es decir, el precio de todas las
		 * televisiones, por un lado, el de las lavadoras por otro y la suma de los
		 * Electrodomésticos (puedes crear objetos Electrodoméstico, pero recuerda que
		 * Televisión y Lavadora también son electrodomésticos). Recuerda el uso
		 * operador instanceof.
		 */
		
		for (int i = 0; i < arrListElect.length; i++) {
			if (arrListElect[i] instanceof Electrodoméstico) {
				sSumaElectrodomestico+=arrListElect[i].precioFinal();
			}
			if (arrListElect[i] instanceof Lavadora) {
				sSumaElectrodomestico+=arrListElect[i].precioFinal();
			}
			if (arrListElect[i] instanceof Televisión) {
				sSumaElectrodomestico+=arrListElect[i].precioFinal();
			}
		}
		
		/*
		 * Resultados
		 */
		
		System.out.printf("La suma del precio de los Electrodomésticos: $ %s pesos",sSumaElectrodomestico );
		System.out.printf("La suma del precio de los Lavadora: $ %s pesos",sSumaLavadora );
		System.out.printf("La suma del precio de los Televisión: $ %s pesos",sSumaTelevision );
	}

}

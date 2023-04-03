package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int descuento;// declaro variable que guardara valor de descuento a aplicar

		int unidadesVender;// declaro variable que guardara valor de unidades a vender

		int unidadesAlmacenar;// declaro variable que guardara valor de unidades a almacenar

		// creo nuevo objeto tipo Articulo y lo asigno a la variable art y lo inicializo con valores concretos
		Articulo art = new Articulo("Monitor", 100.50, 5);

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// llamo a funcion imprimir con objeto art
		art.imprimir();

		// imprimo por pantalla mensaje con valor devuelto por funcion getPVP al
		// llamarla con objeto art
		System.out.println("El PVP del articulo es: " + art.getPVP());

		// solicito al usuario un valor para descuento
		System.out.println("Introduzca descuento a aplicar: ");

		// recojo valor introducido por usuario con escaner y lo asigno a descuento
		descuento = dogma.nextInt();

		// imprimo por pantalla mensaje con valor devuelto por funcion getPVPDescuento
		// al llamarla con objeto art y dandole como parametro de entrada descuento
		System.out.println("El PVP del articulo con el descuento aplicado es: " + art.getPVPDescuento(descuento));

		// solicito al usuario un valor para unidadesVender
		System.out.println("Cuantas unidades quiere vender? ");

		// recojo valor introducido por usuario con escaner y lo asigno a unidadesVender
		unidadesVender = dogma.nextInt();

		// si valor devuelto por funcion vender llamada con objeto art y parametro de
		// entrada unidadesVender es igual a true
		if (art.vender(unidadesVender)) {
			// significa que la venta se ha podido llevar a cabo por lo que lo comunico al
			// usuario con mensaje por pantalla
			System.out.println(unidadesVender + " Unidades del articulo vendidas con exito.");

			// de lo contrario significa que la venta no se ha podido llevar a cabo por lo
			// que lo comunico al usuario con mensaje por pantalla
		} else {
			System.out.println("No se puede llevar a cabo la venta de esa cantidad de articulos.");
		}

		// solicito al usuario un valor para unidadesAlmacenar
		System.out.println("Cuantas unidades quiere almacenar? ");

		// recojo valor introducido por usuario con escaner y lo asigno a
		// unidadesAlmacenar
		unidadesAlmacenar = dogma.nextInt();

		// llamo a funcion almacenar con objeto art y parametro de entrada
		// unidadesAlmacenar
		art.almacenar(unidadesAlmacenar);

		// llamo a funcion imprimir con objeto art
		art.imprimir();

		// cierro escaner
		dogma.close();
	}

}

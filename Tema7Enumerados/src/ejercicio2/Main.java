package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcion = 0;// guardara la opcion seleccionada por el usuario

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		//  creo nuevo objeto tipo Libro y lo asigno a la variable libro  y lo inicializo con valores concretos
		Libro libro = new Libro("Los nacidos de la bruma", "Brandon sanderson", 10, 0);

		// hago lo mismo para objeto diferente (libro2) que contara con valores
		// diferentes para sus atributos al ser un objeto diferente
		Libro libro2 = new Libro("Elantris", "Brandon sanderson", 20, 2);

		// bucle que se ejecutara mientras opcion sea diferente a 3 comprobando
		// funcionamiento de clases con objeto libro
		while (opcion != 3) {

			// solicito seleccion de opcion a usuario
			System.out.println("Seleccione una opcion: \n1.Pedir prestado un libro. \n2.Devolver un libro.\n3.Salir.");
			// recojo valor introducido por usuario con escaner y lo asigno a opcion
			opcion = dogma.nextInt();
			// hago un switch que evalue a opcion
			switch (opcion) {

			// de tener opcion valor 1
			case 1 -> {
				// llamo al metodo prestamo con el objeto libro, si este me devuelve true
				if (libro.prestamo()) {
					// comunico al usuario que el prestamo de su libro se ha realizado con mensaje
					// por pantalla
					System.out.println("Su prestamo del libro " + libro.titulo + " ha sido procesado con exito.");

					// de lo contrario comunico al usuario que el prestamo de su libro no se ha
					// realizado con mensaje por pantalla
				} else {
					System.out.println(
							"Su prestamo no puede realizarse porque no hay ejemplares disponibles de " + libro.titulo);
				}
			}
			// de tener opcion valor 1
			case 2 -> {
				// llamo al metodo devolucion con el objeto libro, si este me devuelve true
				if (libro.devolucion()) {
					// comunico al usuario que la devolucion de su libro se ha realizado con mensaje
					// por pantalla
					System.out.println("Su devolucion del libro " + libro.titulo + " ha sido procesada con exito.");

					// de lo contrario comunico al usuario que la devolucion de su libro no se ha
					// realizado con mensaje por pantalla
				} else {
					System.out.println("Su devolucion no puede realizarse porque no se ha prestado un ejemplar de "
							+ libro.titulo + " previamente.");
				}
			}
			}
		}

		// si salgo del bucle anterior reinicio el valor de opcion a 0
		opcion = 0;

		// y entro en otro bucle para hacer lo mismo que en el anterior pero con el
		// objeto libro2
		while (opcion != 3) {

			System.out.println("Seleccione una opcion: \n1.Pedir prestado un libro. \n2.Devolver un libro.\n3.Salir.");
			opcion = dogma.nextInt();
			switch (opcion) {

			case 1 -> {
				if (libro2.prestamo()) {
					System.out.println("Su prestamo del libro " + libro2.titulo + " ha sido procesado con exito.");

				} else {
					System.out.println(
							"Su prestamo no puede realizarse porque no hay ejemplares disponibles de " + libro2.titulo);
				}
			}
			case 2 -> {
				if (libro2.devolucion()) {
					System.out.println("Su devolucion del libro " + libro2.titulo + " ha sido procesada con exito.");

				} else {
					System.out.println("Su devolucion no puede realizarse porque no se ha prestado un ejemplar de "
							+ libro2.titulo + " previamente.");
				}
			}
			}
		}
		// cierro escaner
		dogma.close();
	}

}

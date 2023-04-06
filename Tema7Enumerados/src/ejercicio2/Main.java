package ejercicio2;

import java.util.Scanner;

import ejercicio2.Libro.Genero;

public class Main {

	public static void main(String[] args) {

		String titulo = "";// guardara titulo para pasar como parametro de entrada al constructor
		String autor = "";// guardara autor para pasar como parametro de entrada al constructor
		int ejemplaresDisponibles;// guardara ejemplaresDisponibles para pasar como parametro de entrada al
									// constructor
		int ejemplaresPrestados;// guardara ejemplaresPrestados para pasar como parametro de entrada al
								// constructor
		String genero = "";// guardara genero para pasar como parametro de entrada al constructor
		boolean esta = false;// guardara true o false segun este el genero en la lista de enumerados o no,
								// inicializo a false porque compruebo si SI ESTA

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// solicito titulo al usuario
		System.out.println("Introduzca el titulo del libro:");
		// recojo valor de usuario con escaner y lo asigno a titulo
		titulo = dogma.nextLine();

		// solicito autor al usuario
		System.out.println("Introduzca el autor del libro:");
		// recojo valor de usuario con escaner y lo asigno a titulo
		autor = dogma.nextLine();

		// solicito ejemplaresDisponibles al usuario
		System.out.println("Introduzca numero de ejemplares Disponibles del libro:");
		// recojo valor de usuario con escaner y lo asigno a ejemplaresDisponibles
		ejemplaresDisponibles = dogma.nextInt();

		// solicito ejemplaresPrestados al usuario
		System.out.println("Introduzca numero de ejemplares Prestados del libro:");
		// recojo valor de usuario con escaner y lo asigno a ejemplaresPrestados
		ejemplaresPrestados = dogma.nextInt();
		// hago uso de escaner asi para evitar error al cambiar tipo de lectura
		// consumiendo la linea
		dogma.nextLine();

		// solicito genero al usuario
		System.out.println("Introduzca el genero del libro:");
		// recojo valor de usuario con escaner y lo asigno a genero
		genero = dogma.nextLine();

		// bucle for each que recorrera los valores de el enumerado Genero guardando
		// estos en g
		for (Genero g : Genero.values()) {
			// si g es igual a parametro de entrada genero (aplico a genero valueOf para
			// pasar su valor a tipo Genero)
			if (g.equals(Genero.valueOf(genero))) {
				// el genero especificado se encuentra en la lista de enumerados por lo que esta
				// pasa a ser true
				esta = true;
				break;
			}
		}
		// si esta tiene valor false // el genero especificado no se encuentra en la
		// lista de enumerados
		if (esta == false) {
			// lo comunico al usuario con mensaje de error
			System.out.println("El genero especificado no se encuentra en la lista de los permitidos. ");
		}
		// creo objeto tipo Libro y lo asigno a la variable libro y uso
		// constructor para darle valor a sus atributos con los argumentos recogidos del
		// usuario con anterioridad
		// (aplico a genero valueOf para pasar su valor a tipo Genero)
		Libro libro = new Libro(titulo, autor, ejemplaresDisponibles, ejemplaresPrestados, Genero.valueOf(genero));

		/////////////////////////////////////////////////////////////////////////////////////////////////

		// hago lo mismo para objeto 2 (libro2)
		System.out.println("Introduzca el titulo del libro:");
		titulo = dogma.nextLine();

		System.out.println("Introduzca el autor del libro:");
		autor = dogma.nextLine();

		System.out.println("Introduzca numero de ejemplares Disponibles del libro:");
		ejemplaresDisponibles = dogma.nextInt();

		System.out.println("Introduzca numero de ejemplares Prestados del libro:");
		ejemplaresPrestados = dogma.nextInt();
		dogma.nextLine();

		System.out.println("Introduzca el genero del libro:");
		genero = dogma.nextLine();

		for (Genero g : Genero.values()) {

			if (g.equals(Genero.valueOf(genero))) {
				esta = true;
				break;
			}
		}
		if (esta == false) {
			System.out.println("El genero especificado no se encuentra en la lista de los permitidos. ");
		}

		Libro libro2 = new Libro(titulo, autor, ejemplaresDisponibles, ejemplaresPrestados, Genero.valueOf(genero));

		// llamo a la funcion que muestra los valores de los atributos del objeto con el
		// que se la llama (libro)
		System.out.println(libro.toString());

		// llamo a la funcion que muestra los valores de los atributos del objeto con el
		// que se la llama (libro2)
		System.out.println(libro2.toString());

		/////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("Introduzca el nuevo genero del libro:");
		genero = dogma.nextLine();

		// bucle for each que recorrera los valores de el enumerado Genero guardando
		// estos en g
		for (Genero g : Genero.values()) {
			// si g es igual a parametro de entrada genero (aplico a genero valueOf para
			// pasar su valor a tipo Genero)
			if (g.equals(Genero.valueOf(genero))) {
				// el genero especificado se encuentra en la lista de enumerados por lo que esta
				// pasa a ser true
				esta = true;
				break;
			}
		}
		// si esta tiene valor false // el genero especificado no se encuentra en la
		// lista de enumerados
		if (esta == false) {
			// lo comunico al usuario con mensaje de error
			System.out.println("El genero especificado no se encuentra en la lista de los permitidos. ");
		}

		// llamo al setter de genero de objeto libro y le paso genero como argumento
		// (aplico a genero valueOf para pasar su valor a tipo Genero)
		libro.setGenero(Genero.valueOf(genero));

		/////////////////////////////////////////////////////////////////////////////////////////////////

		// solicito nuevo genero al usuario
		System.out.println("Introduzca el nuevo genero del libro:");
		// recojo valor de usuario con escaner y lo asigno a titulo
		genero = dogma.nextLine();

		// bucle for each que recorrera los valores de el enumerado Genero guardando
		// estos en g
		for (Genero g : Genero.values()) {
			// si g es igual a parametro de entrada genero (aplico a genero valueOf para
			// pasar su valor a tipo Genero)
			if (g.equals(Genero.valueOf(genero))) {
				// el genero especificado se encuentra en la lista de enumerados por lo que esta
				// pasa a ser true
				esta = true;
				break;
			}
		}
		// si esta tiene valor false el genero especificado no se encuentra en la
		// lista de enumerados
		if (esta == false) {
			// lo comunico al usuario con mensaje de error
			System.out.println("El genero especificado no se encuentra en la lista de los permitidos. ");
		}

		// llamo al setter de genero de objeto libro2 y le paso genero como argumento
		// (aplico a genero valueOf para pasar su valor a tipo Genero)
		libro2.setGenero(Genero.valueOf(genero));

		// llamo a la funcion que muestra los valores de los atributos del objeto con el
		// que se la llama (libro)
		System.out.println(libro.toString());

		// llamo a la funcion que muestra los valores de los atributos del objeto con el
		// que se la llama (libro2)
		System.out.println(libro2.toString());

		// cierro escaner
		dogma.close();
	}

}

package ejercicio4;

import java.util.Scanner;

import ejercicio4.Articulo.Departamento;

public class Main {

	public static void main(String[] args) {

		String nombre = "";// guardara nombre para pasar como parametro de entrada al constructor

		double precio;// guardara precio para pasar como parametro de entrada al constructor

		int cuantosQuedan;// guardara cuantosQuedan para pasar como parametro de entrada al constructor

		String departamento = "";// guardara departamento para pasar como parametro de entrada al constructor

		boolean esta = false;// guardara true o false segun este el departamento en la lista de enumerados o
								// no, inicializo a false porque compruebo si SI ESTA

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// solicito nombre al usuario
		System.out.println("Introduzca el nombre del articulo:");
		// recojo valor de usuario con escaner y lo asigno a nombre
		nombre = dogma.nextLine();
		// si la cadena esta vacia
		if (nombre.isEmpty()) {
			// lo comunico con mensaje de error
			System.out.println("Nombre introducido no valido.");
		}

		// solicito precio al usuario
		System.out.println("Introduzca el precio del articulo:");
		// recojo valor de usuario con escaner y lo asigno a precio
		precio = dogma.nextDouble();
		// si precio es menor a 0 no es un valor valido
		if (precio < 0) {
			// lo comunico con mensaje de error
			System.out.println("Precio introducido no valido.");
		}

		// solicito cuantosQuedan al usuario
		System.out.println("Introduzca numero de unidades que quedan del articulo:");
		// recojo valor de usuario con escaner y lo asigno a cuantosQuedan
		cuantosQuedan = dogma.nextInt();
		// si cuantos quedan es menor a 0 no es un valor valido
		if (cuantosQuedan < 0) {
			// lo comunico con mensaje de error
			System.out.println("Cantidad restante introducida no valida.");
		}
		// hago uso de escaner asi para evitar error al cambiar tipo de lectura
		// consumiendo la linea
		dogma.nextLine();

		// solicito departamento al usuario
		System.out.println("Introduzca departamento del articulo:");
		// recojo valor de usuario con escaner y lo asigno a departamento
		departamento = dogma.nextLine();
		// hago un for each que recorra los valores del enumerado Departamento guardando
		// el valor actual en d
		for (Departamento d : Departamento.values()) {
			// si d es igual a parametro de entrada departamento
			if (d.equals(Departamento.valueOf(departamento))) {
				// el departamento especificado se encuentra en la lista de enumerados por lo
				// que esta pasa a ser true
				esta = true;
				break;
			}
		}
		// si esta tiene valor false el departamento especificado no se encuentra en la
		// lista de enumerados
		if (esta == false) {
			// lo comunico al usuario con mensaje de error
			System.out.println("Valor para departamento no valido.");
		}

		// creo objeto tipo Articulo y lo asigno a la variable art y uso
		// constructor para darle valor a sus atributos con los argumentos recogidos del
		// usuario con anterioridad
		// (aplico a departamento valueOf para pasar su valor a tipo Departamento)
		Articulo art = new Articulo(nombre, precio, cuantosQuedan, Departamento.valueOf(departamento));

		/////////////////////////////////////////////////////////////////////////////////////////////////

		// solicito nombre al usuario
		System.out.println("Introduzca el nombre del articulo:");
		// recojo valor de usuario con escaner y lo asigno a nombre
		nombre = dogma.nextLine();
		// si la cadena esta vacia
		if (nombre.isEmpty()) {
			// lo comunico con mensaje de error
			System.out.println("Nombre introducido no valido.");
		}

		// solicito precio al usuario
		System.out.println("Introduzca el precio del articulo:");
		// recojo valor de usuario con escaner y lo asigno a precio
		precio = dogma.nextDouble();
		// si precio es menor a 0 no es un valor valido
		if (precio < 0) {
			// lo comunico con mensaje de error
			System.out.println("Precio introducido no valido.");
		}

		// solicito cuantosQuedan al usuario
		System.out.println("Introduzca numero de unidades que quedan del articulo:");
		// recojo valor de usuario con escaner y lo asigno a cuantosQuedan
		cuantosQuedan = dogma.nextInt();
		// si cuantos quedan es menor a 0 no es un valor valido
		if (cuantosQuedan < 0) {
			// lo comunico con mensaje de error
			System.out.println("Cantidad restante introducida no valida.");
		}
		// hago uso de escaner asi para evitar error al cambiar tipo de lectura
		// consumiendo la linea
		dogma.nextLine();

		// solicito departamento al usuario
		System.out.println("Introduzca departamento del articulo:");
		// recojo valor de usuario con escaner y lo asigno a departamento
		departamento = dogma.nextLine();
		// hago un for each que recorra los valores del enumerado Departamento guardando
		// el valor actual en d
		for (Departamento d : Departamento.values()) {
			// si d es igual a parametro de entrada departamento
			if (d.equals(Departamento.valueOf(departamento))) {
				// el departamento especificado se encuentra en la lista de enumerados por lo
				// que esta pasa a ser true
				esta = true;
				break;
			}
		}
		// si esta tiene valor false el departamento especificado no se encuentra en la
		// lista de enumerados
		if (esta == false) {
			// lo comunico al usuario con mensaje de error
			System.out.println("Valor para departamento no valido.");
		}

		// creo objeto tipo Articulo y lo asigno a la variable art y uso
		// constructor para darle valor a sus atributos con los argumentos recogidos del
		// usuario con anterioridad
		// (aplico a departamento valueOf para pasar su valor a tipo Departamento)
		Articulo art2 = new Articulo(nombre, precio, cuantosQuedan, Departamento.valueOf(departamento));

		// llamo a la funcion que muestra los valores de los atributos del objeto con el
		// que se la llama (art)
		art.imprimir();

		// llamo a la funcion que muestra los valores de los atributos del objeto con el
		// que se la llama (art2)
		art2.imprimir();

		/////////////////////////////////////////////////////////////////////////////////////////////////

		// solicito departamento al usuario
		System.out.println("Introduzca nuevo departamento del articulo:");
		// recojo valor de usuario con escaner y lo asigno a departamento
		departamento = dogma.nextLine();
		// hago un for each que recorra los valores del enumerado Departamento guardando
		// el valor actual en d
		for (Departamento d : Departamento.values()) {
			// si d es igual a parametro de entrada departamento
			if (d.equals(Departamento.valueOf(departamento))) {
				// el departamento especificado se encuentra en la lista de enumerados por lo
				// que esta pasa a ser true
				esta = true;
				break;
			}
		}
		// si esta tiene valor false el departamento especificado no se encuentra en la
		// lista de enumerados
		if (esta == false) {
			// lo comunico al usuario con mensaje de error
			System.out.println("Valor para departamento no valido.");
		}
		// llamo al setter de departamento de objeto art y le paso departamento como
		// argumento (aplico a departamento valueOf para pasar su valor a tipo
		// Departamento)
		art.setDepartamento(Departamento.valueOf(departamento));

		/////////////////////////////////////////////////////////////////////////////////////////////////

		// solicito departamento al usuario
		System.out.println("Introduzca nuevo departamento del articulo:");
		// recojo valor de usuario con escaner y lo asigno a departamento
		departamento = dogma.nextLine();
		// hago un for each que recorra los valores del enumerado Departamento guardando
		// el valor actual en d
		for (Departamento d : Departamento.values()) {
			// si d es igual a parametro de entrada departamento
			if (d.equals(Departamento.valueOf(departamento))) {
				// el departamento especificado se encuentra en la lista de enumerados por lo
				// que esta pasa a ser true
				esta = true;
				break;
			}
		}
		// si esta tiene valor false el departamento especificado no se encuentra en la
		// lista de enumerados
		if (esta == false) {
			// lo comunico al usuario con mensaje de error
			System.out.println("Valor para departamento no valido.");
		}
		// llamo al setter de departamento de objeto art2 y le paso departamento como
		// argumento (aplico a departamento valueOf para pasar su valor a tipo
		// Departamento)
		art2.setDepartamento(Departamento.valueOf(departamento));

		// llamo a la funcion que muestra los valores de los atributos del objeto con el
		// que se la llama (art)
		art.imprimir();

		// llamo a la funcion que muestra los valores de los atributos del objeto con el
		// que se la llama (art2)
		art2.imprimir();

		// cierro escaner
		dogma.close();
	}

}

package ejercicio1;

import java.util.Scanner;

import ejercicio1.CuentaCorriente.Sexo;

public class Main {

	public static void main(String[] args) {

		String dni = "";// guardara dni para pasar como parametro de entrada al constructor

		String nombre = "";// guardara nombre para pasar como parametro de entrada al constructor

		double saldo;// guardara saldo para pasar como parametro de entrada al constructor

		String sexo = "";// guardara sexo para pasar como parametro de entrada al constructor

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// solicito DNI al usuario
		System.out.println("Introduzca DNI del titular de la cuenta: ");
		// recojo valor de usuario con escaner y lo asigno a dni
		dni = dogma.nextLine();
		// si la longitud del DNI es diferente a 9 comunico error con mensaje por
		// pantalla
		if (dni.length() != 9) {
			System.out.println("DNI erroneo.");
		}
		// solicito nombre al usuario
		System.out.println("Introduzca nombre del titular de la cuenta: ");
		// recojo valor de usuario con escaner y lo asigno a nombre
		nombre = dogma.nextLine();

		// solicito saldo al usuario
		System.out.println("Introduzca saldo inicial de la cuenta: ");
		// recojo valor de usuario con escaner y lo asigno a saldo
		saldo = dogma.nextDouble();
		// hago uso de escaner asi para evitar error al cambiar tipo de lectura
		// consumiendo la linea
		dogma.nextLine();

		// solicito sexo al usuario
		System.out.println("Introduzca sexo del titular de la cuenta: ");
		// recojo valor de usuario con escaner y lo asigno a sexo
		sexo = dogma.nextLine();
		// si sexo no es ningunno de los 2 valores esperados
		if (!sexo.equals("FEMENINO") && !sexo.equals("MASCULINO")) {
			// comunico erro con mensaje por pantalla
			System.out.println("Introduzca un valor correcto para sexo. (MASCULINO, FEMENINO)");
		}

		// creo objeto tipo CuentaCorriente y lo asigno a la variable cuenta y uso
		// constructor para darle valor a sus atributos con los argumentos recogidos del
		// usuario con anterioridad
		CuentaCorriente cuenta = new CuentaCorriente(dni, nombre, saldo, sexo);

		// hago lo mismo para siguiente objeto (cuenta2)
		System.out.println("Introduzca DNI del titular de la cuenta: ");
		dni = dogma.nextLine();
		if (dni.length() != 9) {
			System.out.println("DNI erroneo.");
		}

		System.out.println("Introduzca nombre del titular de la cuenta: ");
		nombre = dogma.nextLine();

		System.out.println("Introduzca saldo inicial de la cuenta: ");
		saldo = dogma.nextDouble();
		dogma.nextLine();

		System.out.println("Introduzca sexo del titular de la cuenta: ");
		sexo = dogma.nextLine();
		if (!sexo.equals("FEMENINO") && !sexo.equals("MASCULINO")) {
			System.out.println("Introduzca un valor correcto para sexo. (MASCULINO, FEMENINO)");
		}

		// creo objeto tipo CuentaCorriente y lo asigno a la variable cuenta2 y uso
		// constructor para darle valor a sus atributos con los argumentos recogidos del
		// usuario con anterioridad
		CuentaCorriente cuenta2 = new CuentaCorriente(dni, nombre, saldo, sexo);

		// llamo a la funcion que muestra los valores de los atributos del objeto con el
		// que se la llama (cuenta)
		cuenta.mostrarInformacion();
		// llamo a la funcion que muestra los valores de los atributos del objeto con el
		// que se la llama (cuenta2)
		cuenta2.mostrarInformacion();

		// solicito nuevo valor para nombre a usuario
		System.out.println("Introduzca nuevo nombre del titular de la cuenta: ");
		// recojo valor con escaner y lo asigno a nombre
		nombre = dogma.nextLine();

		// llamo al setter de nombre de objeto cuenta y le paso nombre como argumento
		cuenta.setNombre(nombre);

		// solicito nuevo valor para sexo a usuario
		System.out.println("Introduzca nuevo sexo del titular de la cuenta: ");
		// recojo valor con escaner y lo asigno a sexo
		sexo = dogma.nextLine();
		// si sexo no es ningunno de los 2 valores esperados
		if (!sexo.equals("FEMENINO") && !sexo.equals("MASCULINO")) {
			// comunico erro con mensaje por pantalla
			System.out.println("Introduzca un valor correcto para sexo. (MASCULINO, FEMENINO)");
		}
		// uso objeto cuenta para llamar a su setter de sexo y le paso sexo como
		// argumento pasando su valor a tipo Sexo con valueOf
		cuenta.setSexo(Sexo.valueOf(sexo));

		// solicito nuevo valor para nombre a usuario
		System.out.println("Introduzca nuevo nombre del titular de la cuenta: ");
		// recojo valor con escaner y lo asigno a nombre
		nombre = dogma.nextLine();
		// llamo al setter de nombre de objeto cuenta2 y le paso nombre como argumento
		cuenta2.setNombre(nombre);

		// solicito nuevo valor para sexo a usuario
		System.out.println("Introduzca nuevo sexo del titular de la cuenta: ");
		// recojo valor con escaner y lo asigno a sexo
		sexo = dogma.nextLine();
		// si sexo no es ningunno de los 2 valores esperados
		if (!sexo.equals("FEMENINO") && !sexo.equals("MASCULINO")) {
			// comunico erro con mensaje por pantalla
			System.out.println("Introduzca un valor correcto para sexo. (MASCULINO, FEMENINO)");
		}
		// uso objeto cuenta2 para llamar a su setter de sexo y le paso sexo como
		// argumento pasando su valor a tipo Sexo con valueOf
		cuenta2.setSexo(Sexo.valueOf(sexo));

		// llamo a la funcion que muestra los valores de los atributos del objeto con el
		// que se la llama (cuenta)
		cuenta.mostrarInformacion();
		// llamo a la funcion que muestra los valores de los atributos del objeto con el
		// que se la llama (cuenta2)
		cuenta2.mostrarInformacion();

		// cierro escaner
		dogma.close();
	}

}

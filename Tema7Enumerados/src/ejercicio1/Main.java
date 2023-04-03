package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double extracto;// guardara cantidad a extraer

		double ingreso;// guardara cantidad a ingresar

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// creo nuevo objeto tipo CuentaCorriente y lo asigno a la variable cuenta y inicializo sus atributos con valores concretos
		CuentaCorriente cuenta = new CuentaCorriente("45454545m", 20.5);

		// solicito al usuario valor para extracto
		System.out.println("Introduzca cantidad a extraer de su cuenta: ");

		// doy a extracto valor con escaner
		extracto = dogma.nextDouble();

		// llamo a la funcion sacarDinero con el objeto cuenta y el parametro de entrada
		// extracto
		cuenta.sacarDinero(extracto);

		// solicito a usuario valor para ingreso
		System.out.println("Introduzca cantidad a ingresar en su cuenta: ");

		// doy a ingreso valor con escaner
		ingreso = dogma.nextDouble();

		// llamo a la funcion ingresarDinero con el objeto cuenta y el parametro de
		// entrada
		cuenta.ingresarDinero(ingreso);

		// llamo a la funcion mostrarInformacion con el objeto cuenta esto me devolvera
		// los valores de los atributos asociados al objeto especificado (cuenta)
		cuenta.mostrarInformacion();

		// hago lo mismo para objeto diferente (cuenta2) que contara con valores
		// diferentes para sus atributos, al ser un objeto diferente, ademas nombre se
		// especificara en lugar de dejarlo a valor por defecto
		CuentaCorriente cuenta2 = new CuentaCorriente("22454545m", "manolo", 20.5);

		System.out.println("Introduzca cantidad a extraer de su cuenta: ");

		extracto = dogma.nextDouble();

		cuenta2.sacarDinero(extracto);

		System.out.println("Introduzca cantidad a ingresar en su cuenta: ");

		ingreso = dogma.nextDouble();

		cuenta2.ingresarDinero(ingreso);

		cuenta2.mostrarInformacion();

		// cierro escaner
		dogma.close();
	}
}

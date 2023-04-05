package ejercicio1;

/**
 * Clase Cuenta corriente que contiene metodos para realizar transacciones y ver
 * los datos de cuentas bancarias
 * 
 * @author jperez
 *
 */
public class CuentaCorriente {

	private String dni;// atributo que guardara el dni

	private String nombre;// atributo que guardara el nombre

	private double saldo;// atributo que guardara el saldo

	/**
	 * enumerado que guardara constantes como posibles valores para variable tipo
	 * CuentaCorriente (cada variable seria un objeto)
	 */
	enum Sexo {
		FEMENINO, MASCULINO
	}

	private Sexo sexo; // atributo sexo de tipo Sexo guardara sexo del titular

	/**
	 * constructor con 3 parametros de entrada
	 * 
	 * @param dni   guardara valor a asignar a atributo dni
	 * @param saldo guardara valor a asignar a atributo saldo
	 * @param sexo  guardara valor a asignar a atributo saldo
	 */
	public CuentaCorriente(String dni, double saldo, String sexo) {
		// doy a atributo dni valor de parametro de entrada dni
		this.dni = dni;
		// doy a atributo saldo valor de parametro de entrada saldo
		this.saldo = saldo;
		// doy a sexo saldo valor de parametro de entrada sexo aplicando value of al
		// mismo para convertirlo a tipo Sexo (enumerado)
		this.sexo = Sexo.valueOf(sexo);
	}

	/**
	 * constructor con 4 datos de entrada
	 * 
	 * @param dni    guardara valor a asignar a atributo dni
	 * @param nombre guardara valor a asignar a atributo nombre
	 * @param saldo  guardara valor a asignar a atributo saldo
	 * @param sexo   guardara valor a asignar a atributo saldo
	 */
	public CuentaCorriente(String dni, String nombre, double saldo, String sexo) {
		// doy a atributo dni valor de parametro de entrada dni
		this.dni = dni;
		// doy a atributo nombre valor de parametro de entrada nombre
		this.nombre = nombre;
		// doy a atributo saldo valor de parametro de entrada saldo
		this.saldo = saldo;
		// doy a sexo saldo valor de parametro de entrada sexo aplicando value of al
		// mismo para convertirlo a tipo Sexo (enumerado)
		this.sexo = Sexo.valueOf(sexo);
	}

	/**
	 * getter de atributo sexo
	 * 
	 * @return sexo devolvera valor actual de atributo sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}

	/**
	 * setter de atributo sexo
	 * 
	 * @param sexo contendra valor a asignar a atributo sexo
	 */
	public void setSexo(Sexo sexo) {
		// si parametro sexo es igual a una de las 2 constantes dentro del enumerado
		if (sexo == Sexo.FEMENINO || sexo == Sexo.MASCULINO) {
			// doy a atributo sexo valor de argumento sexo
			this.sexo = sexo;
		}
	}

	/**
	 * getter de dni
	 * 
	 * @return dni devolvera valor actual de atributo dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * setter de dni
	 * 
	 * @param dni contendra valor asignable a atributo dni
	 */
	public void setDni(String dni) {
		// si parametro dni tiene una longitud igual a 9
		if (dni.length() == 9) {
			// doy a atributo dni valor de parametro dni
			this.dni = dni;
		}
	}

	/**
	 * getter de nombre
	 * 
	 * @return nombre devolvera valor actual de atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setter de nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * getter de saldo
	 * 
	 * @return saldo contendra valor actual de atributo saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * setter de saldo
	 * 
	 * @param saldo contendra valor asignable para atributo saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * metodo que sacara dinero si existe saldo suficiente para ello
	 * 
	 * @param dineroSolicitado guardara la cantidad de dinero a extraer
	 */
	public void sacarDinero(double dineroSolicitado) {
		// si el atributo saldo actual es mayor o igual que el dinero a extraer
		if (saldo >= dineroSolicitado) {
			// se llevara a cabo la extraccion restandole dineroSolicitado a atributo saldo
			saldo -= dineroSolicitado;
			// y se le comunicara al usuario mediante mensaje por pantalla
			System.out.println("Su transaccion es posible y se ha llevado a cabo. ");

			// de lo contrario no se llevara a cabo la operacion
			// y se le comunicara al usuario mediante mensaje por pantalla
		} else {
			System.out.println("Su transaccion no es posible, no tiene suficiente saldo. ");
		}
	}

	/**
	 * metodo que añadira el valor del dinero ingresado a saldo
	 * 
	 * @param dineroIngresar
	 */
	public void ingresarDinero(double dineroIngresar) {
		// añado el valor de dineroIngresar a atributo saldo
		saldo += dineroIngresar;
	}

	/**
	 * metodo que mostrara los datos de la cuenta especificada asociada con su
	 * propio objeto
	 */
	public void mostrarInformacion() {
		// print de pantalla de los atributos con los valores del objeto con el que se
		// usa el metodo
		System.out.println("La cuenta de: " + dni + " " + nombre + " " + sexo + " tiene " + saldo + " de saldo.");
	}

}

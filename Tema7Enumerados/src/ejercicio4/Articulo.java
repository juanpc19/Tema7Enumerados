package ejercicio4;

/**
 * clase Articulo que contiene metodos para modificar y mostrar precios y
 * cantidades de diferentes articulos
 * 
 * @author juanpesca19
 *
 */
public class Articulo {

	private String nombre;// atributo que contiene el nombre del articulo

	private double precio;// atributo que contiene el precio del articulo

	public static final int IVA = 21;// atributo que contiene el IVA

	private int cuantosQuedan;// atributo que contiene la cantidad restante del articulo

	/**
	 * constructor con 3 parametros de entrada
	 * 
	 * @param nombre        contendra valor que se asignara a atributo nombre
	 * @param precio        contendra valor que se asignara a atributo precio
	 * @param cuantosQuedan contendra valor que se asignara a atributo cuantosQuedan
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		super();
		// doy a atributo nombre valor de parametro de entrada nombre
		// si nombre no esta vacio y no es null
		if (!nombre.isEmpty() && nombre != null) {
			this.nombre = nombre;
		} else {
			System.out.println("Nombre introducido no valido.");
		}
		// doy a atributo precio valor de parametro de entrada precio
		// si precio mayor a 0
		if (precio > 0) {
			this.precio = precio;
		} else {
			System.out.println("Precio introducido no valido.");
		}
		// doy a atributo cuantosQuedan valor de parametro de entrada cuantosQuedan
		// si quedan 0 o mas
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			System.out.println("cantidad introducida no valido.");
		}
	}

	/**
	 * funcion que imprimira por pantalla los valores de los atributos del objeto
	 * con el que se llama a la funcion
	 */
	void imprimir() {
		System.out.println(nombre + " " + precio + " " + cuantosQuedan);
	}

	/**
	 * funcion que aplicara el IVA al precio del articulo
	 * 
	 * @return pvp devolvera el precio con el IVA ya aplicado
	 */
	double getPVP() {
		double pvp;// declaro variable que guardara valor de precio con IVA ya aplicado

		// aplico a pvp el IVA (pvp igual a precio dividido entre 100 multiplicado por
		// iva)
		pvp = precio + precio / 100 * IVA;

		return pvp;
	}

	/**
	 * funcion que aplicara un descuento al precio de un articulo
	 * 
	 * @param descuento guardara el valor del descuento a aplicar
	 * @return pvpDescuento devolvera el valor del precio del articulo con el
	 *         descuento ya aplicado
	 */
	double getPVPDescuento(int descuento) {
		double pvpDescuento;// declaro variable que guardara valor de precio con descuento ya aplicado

		double pvp = getPVP();// declaro variable que guardara valor de pvp y le doy valor devuelto por
								// funcion getPVP
		
		// aplico el descuento al pvp (que ya tiene el iva aplicado) 
		// y guardo el valor obtenido en pvpDescuento
		pvpDescuento = pvp - getPVP() / 100 * descuento;

		return pvpDescuento;
	}

	/**
	 * funcion que vendera una cantidad dada del articulo si es posible
	 * 
	 * @param cantidad guardara la cantidad de articulos a vender
	 * @return devolvera true o false segun sea posible vender la cantidad o no
	 */
	boolean vender(int cantidad) {
		boolean posible = false;// guardara true o false segun sea posible vender la cantidad o no

		// si quedan mas articulos que la cantidad que se quiere vender
		if (cuantosQuedan >= cantidad) {
			// se lleva a cabo la venta restando a cuantosQuedan la cantidad
			cuantosQuedan -= cantidad;
			// y cambio posible a valor true
			posible = true;
		}

		return posible;
	}

	/**
	 * funcion que almacenara una cantidad dada del articulo
	 * 
	 * @param cantidad contendra la cantidad a almacenar del articulo
	 */
	void almacenar(int cantidad) {
		// se lleva a cabo el almacenamiento sumando cantidad a cuantosQuedan
		cuantosQuedan += cantidad;
	}

}

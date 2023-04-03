package ejercicio2;

/**
 * Clase Libro que contiene metodos para prestar y devolver libros
 * 
 * @author jperez
 *
 */
public class Libro {

	String titulo;// atributo que guardara el titulo del libro

	String autor;// atributo que guardara el autor del libro

	final int ejemplaresDisponibles;// atributo que guardara cantidad de ejemplares disponibles

	int ejemplaresPrestados;// atributo que guardara cantidad de ejemplares prestados

	/**
	 * constructor por defecto en el que inicializo el valor del atributo
	 * ejemplaresDisponibles a 0 porque es final y necesito hacerlo para evitar
	 * error de compilacion, aunque cada objeto podra tener un valor de
	 * inicializacion diferente, pero una vez inicializado en objeto no podra
	 * modificarse
	 */
	public Libro() {
		super();
		this.ejemplaresDisponibles = 0;
	}

	/**
	 * constructor con 4 parametros de entrada
	 * 
	 * @param titulo                proovera valor para el titulo del libro
	 * @param autor                 proovera valor para guardar en autor del libro
	 * @param ejemplaresDisponibles proovera valor para guardar cantidad disponible
	 *                              de libro ejemplaresDisponibles
	 * @param ejemplaresPrestados   proovera valor para guardar cantidad prestada
	 *                              del libro ejemplaresPrestados
	 */
	public Libro(String titulo, String autor, int ejemplaresDisponibles, int ejemplaresPrestados) {

		this.titulo = titulo;
		this.autor = autor;
		this.ejemplaresDisponibles = ejemplaresDisponibles;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	/**
	 * metodo que prestara un libro de ser posible
	 * 
	 * @return disponible que sera true o false segun sea posible hacer el prestamo
	 *         o no
	 */
	boolean prestamo() {
		boolean disponible = false;// variable que guardara true o false segun sea posible hacer el prestamo o no

		// si hay mas ejemplares disponibles que ejemplaresPrestados
		if (ejemplaresPrestados < ejemplaresDisponibles) {
			// doy a disponible valor true
			disponible = true;
			// sumo 1 a ejemplaresPrestados
			ejemplaresPrestados++;
		}
		return disponible;
	}

	/**
	 * metodo que devolvera un libro de ser posible
	 * 
	 * @return devolver que sera true o false segun sea posible hacer el prestamo o
	 *         no
	 */
	boolean devolucion() {
		boolean devolver = false;// variable que guardara true o false segun sea posible hacer la devolucion o no

		// si hay 1 o mas ejemplares prestados
		if (ejemplaresPrestados > 0) {
			// doy a devolver valor true
			devolver = true;
			// resto 1 a ejemplaresDisponibles
			ejemplaresPrestados--;
		}
		return devolver;
	}

}

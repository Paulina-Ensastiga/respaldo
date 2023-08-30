package funciones;

public class metodos {

	/*1Métodos que no retornan nada (void).
	 * Realizan ciertas acciones o tareas, pero no devuelven un resultado utilizable
	 * posee un tipo "void"
	 */
	public static void imprimirAsteriscos() {
		System.out.println("************************");
	}

/*2. Métodos que returnan (return). Solicitan aegumentos y si devuelven algo.
 * Se definen con un tipo de dato en su declaración. Realizan una tarea o acción y 
 * devulven un resultado que puede ser utilizado en otras partes del programa. Para devolver el valor, se utiliza la palabra reservada "return"
 */
	public static int sumar (int num1, int num2) {
		int operacionSuma =num1 +num2;
		return operacionSuma;
		
		/*
		 * 3. Métodos combinados. Combinana parametros (String, int, double)
		 * Son del tipo return y reciben argumentos.
		 * 
		 */
	}
	public static Object informacionPersona (String nombre, String apellido, int edad) {
		return nombre + apellido +edad;
		
	}
	
	//Método de ingredientes para preparar alambre (pollo, pimiento, tocino, queso, piña??)
	public static String prepararAlambre(String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4, String ingrediente5) {
		return (ingrediente1 + ingrediente2 + ingrediente3 +ingrediente4 +ingrediente5);
	}
	
	//Métodos para calculadora que reciban dos argumentos double (sumar, restar, multiplicar, dividir)
	
	public static double plus(double numero1, double numero2) {
		return (numero1 +numero2);
	}
	
	public static double resta(double numero1, double numero2) {
		return (numero1 - numero2);
		
	}
	public static double dividir(double numero1, double numero2) {
		return (numero1 /numero2);
	}
	public static double multi(double numero1, double numero2) {
		return (numero1 * numero2);
		
	}

	
	
		public static void main(String[] args) {
		imprimirAsteriscos();
		System.out.println(sumar(45, 129));
		System.out.println(informacionPersona("Daniel", "Maldonado", 36));
		System.out.println("Hoy haremos alambre al estilo Pessy y Pau. Necesitamos:" + prepararAlambre("Pollo, ", "Pimiineto, ", "Tocino, ", "Queso, ", "Piña, "));
		//Invocando a nuestros métodos de calculadora
		System.out.println(plus(2.3, 3.1));
		System.out.println(resta(5.9, 0.5));
		System.out.println(dividir(87.2, 3));
		System.out.println(multi(100, 10));
		
		}
}

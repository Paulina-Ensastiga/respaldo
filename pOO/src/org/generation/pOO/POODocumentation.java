package org.generation.pOO;

public class POODocumentation {
	/*Elementos principales para trabajar POO.
	 * 1.Atributos
	 * 2. Método (s) constructor (es)
	 * 3. Métodos de instancia
	 * 4. Instancias
	 */
	
	/*1. ATRIBUTOS. Son porciones de infrormación que un objeto posee
	 * o conoce de sí mismo = variables con valores 
	 * 
	 * Se declaran estableciendo el modificador de acceso, el tipo de dato 
	 * y el nombre de la variable.
	 * Tenemos dos tipos: De instancia (atributo normal) y de clase (tipo static)
	 * 
	 */
	//Cuenta bancaria
	private double saldo; //Atributo de instancia
	private String cliente;
	private int transacciones;
	private  static int totalCuentas = 0; //Atributo de clase
	
	
	/*2. MÉTODOS CONSTRUCTORES
	 * Método especial qeu se usa para inicializar objetos.
	 * Cada vez que se crea un objetos, utilizamos el constructor new();
	 * 
	 * REGLAS PARA ESCRIBIR CONSTRUCTORES
	 * --Los constructores de una clase deben tener el mismo nombre de la clase en la que viven
	 * --Un constructor en Java no puede ser ni abstracto ni final, static, sincronizado.
	 * --Los modificadores  de acceso se pueden usar en la declaración del constructor para controlar su acceso.
	 * 
	 * 2.1 Constructores predeterminados. 
	 * 2.2 Constructores parametrizados.
	 * 		2.2.1 Sobrecarga de Constructor
	 * 2.3 Constructores
	 */
	
	/*3. CONSTRUCTORES DE COPIA 
	 * 
	 */
	
	
	/*Constructor predeterminado
	 POODocumentation(){
		 System.out.println("Constructores predeterminado");
	 }
	 public static void main (String []args) {
		 POODocumentation poo = new  POODocumentation ();
	 }
	*/
	 //Constructor parametrizado
	 POODocumentation  (double saldo, String cliente, int transacciones){
		 this.saldo = saldo;
		 this.cliente = cliente;
		 this.transacciones = transacciones;
	 }
	 
	 
	 //Sobrecarga de Constructor 
	 	POODocumentation (double saldo, int transacciones){
		 this.saldo = saldo;
		 this.transacciones = transacciones;
	 	}
	 	
	 	
	 	/*3. MÉTODOS JAVA
	 	 * Colección de declaraciones que realizan alguna tarea especifica y devuelven
	 	 * el resultado que llama.
	 	 *  Un método puede realizar alguna tarea especifica sin devolver nada.
	 	 * 
	 	 * Reutilización de código
	 	 * ---Estático (static)
	 	 * --Público (public)
	 	 * 
	 	 */
	 	
	 	//Método static
	 	static void metodoStatic1() {
	 		System.out.println("Hola soy un método estatico");
	 	}
	 	
	 	//Método público
	 	public void metodoPublico() {
	 		System.out.println("Hola soy un método público");
	 	}
	 	
	 	/*Sobrecarga de métodos. Caracteristica de una clase que le permite
	 	 * recibir métodos con el mismo nombre pero diferentes firmas*/
	 	
	 	public int suma (int num1, int num2) {
	 		return num1 + num2;
	 	}///Output int
	 	
	 	public double suma (double num1, double num2) {
	 		return num1 + num2;
	 	}
	 	
	 	//Método main para acceder a las clases públicas
	 	public static void main(String []args) {
	 		POODocumentation cliente1 = new POODocumentation (50, "Daniel", 2);
	 		System.out.println(cliente1);
			
		}
	 	
	 	/*
	 	//Invocando un método estático
	 	metodoStatic1();
		
	 	//Invocando un método público desde un objeto
	 	POODocumentation publico = new POODocumentation();	 	
	 	publico.metodoPublico();

	 */
	 	
	 /*
	  * GETTERS
	  * 
	  * Son métodos que nos permiten acceder a la información protegida 
	  * por modificadores de acceso y que de otra manera no podriamos acceder a ellos.
	  * Gracias a estos métodos sacamos una copia de ese dato protegido y lo podemos modificar.
	  * 
	  * --GETTERS(Método de obtención). 
	  * Proporcionan solo lectura de los campos privados 
	  * 
	  * --SETTER (Método de establecimiento).
	  * Se utilizan para modificar el valor de un campo en una clase
	  */
	 /*¿Qué pasaria si no escribo getters y setters en mi clase de Java?
	  * Los campos privados de una clase no serán accesibles desde otras clases.
	  */
	 	
	 	//Getter (sintaxis)
	 			/*public tipoDeDato getNombreDeVariable() {
	 				return nombreDeVariable
	 			}*/
	 	
	 	//Setter (sintaxis)
	 	/*	public void setNombreDeVariable(tipoDato nombreVariable) {
	 				this.nombreVariable = nombreVariable;
	 			}
	 */
	 
	// Ruta para crear getters y setter


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public int getTransacciones() {
		return transacciones;
	}


	public void setTransacciones(int transacciones) {
		this.transacciones = transacciones;
	}


	@Override
	public String toString() {
		return "POODocumentation [saldo=" + saldo + ", cliente=" + cliente + ", transacciones=" + transacciones + "]";
	}
	
	
	/* ====  @Override*/
	/*Proporciona implememntación de un método
	 * toString().
	 * Se utiliza para devolver una represntación de String de un objeto 
	 */
	/* Para generarlo se accede a las opciones de la java class con click derecho -> source -> Generate toString()*/



	
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

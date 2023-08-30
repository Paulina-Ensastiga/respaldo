package org.generation.variables;


public class DatosEstructurados {

	public static void main(String[] args) {
		/*Los datos estructurados alamcenan datos más complejos que los datos primitivos
		 * Se clasifican en dos:
		 * --String (cadenas de caracteres)Al declarar String Java lo toma como un objeto
		 * 
		 */
		
		String myString = "Soy un String";
		System.out.println(myString);
		
		/*Métodos de String
		 * String legth
		 */
		
		String texto = "QeErtY";
		System.out.println(texto.length()); //Output: 6
		
		//toUpperCase y toLowerCase
		
		System.out.println("Aplicando el método toUpeerCase: " + texto.toUpperCase());
		System.out.println();
		
		//indexOf() devuelve el índice de la primera aparición de un texto especifico en un String
		String parrafo = "Este es un párrafo llamado párrafo";
		System.out.println("Aplicando indexOf en la palabra párrafo" + parrafo.indexOf("parrafo"));
		
		//concat () Se utiliza para concatenar dos String
		
		String firstName = "Daniel ";
		String lastName = "Maldonado";
		System.out.println(firstName   + lastName);
		System.out.println(firstName.concat(lastName));
		
		
		//ParseInt() Se utiliza para convertir un String en entero (int)
		
		String presupuesto = "500000 ";
		System.out.println("El presupuesto es de " + presupuesto + "pesos, y es un dato de tipo " + presupuesto.getClass().getSimpleName());
		
		/*Variables
		 *  -Valor dinámico (variables)
		 *  -Valor constanate (constantes o varibales finales)
		 *  Valor literal.
		 */
		
		
		int edad = 15;
		System.out.println("La edad es " + edad);
		edad = 20;
		System.out.println("La edad es " + edad);
		
		/*Variables finales. La palabra reservada final nos permite declara constantes, lo que significa que su valor no se puede modificar y es de solo lectura
	*/
		 final int longitudAntena =8;
		System.out.println("La longitud de la antena es de" + longitudAntena + "metros");
		
		
		/*Variables segpun la posición en que se encuentra
		 * Variables locales: se declaran dentro de los metodos
		 * Variables de instancia: se declaran fuera del método
		 * Variables estáticas: Se pueden crear una sola copia de la variable estática, no puede ser local
		 */
		
		/*Relaciones
		= asignación
		+= asignación suma
		-= asignación resta
		*= asignación multiplicación
		/= asignación división
		== igual que
		!= distinto que
		< menor que
		> mayor que
		<= menor igual que
		>= mayor igual que
	*/
	System.out.println(num1 > num2); //Output: false
	     
}
}

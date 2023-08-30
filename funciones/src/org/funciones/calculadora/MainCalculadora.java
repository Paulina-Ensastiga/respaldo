package org.funciones.calculadora;

public class MainCalculadora {

	public static void main(String[] args) {
		/*
		 * LLamar métodos desde diferentes clases
		 * 1.Crear una ianstancia de esa clase.
		 * 2.Invocar el método
		 */
		
		//Crear la instancia mediante la sentencia new + nombre de la 
		//clase, seguido de ()
		
		Calculadora calculadora = new Calculadora();
		//Utilizamos la instancia (Calcualdora), se llaman los métodos con los argumentos
		double resultadoSuma = calculadora.plus(20, 5);
		System.out.println("El resultado de sumar 20 + 5 es " + resultadoSuma);
		double resultadorestar = calculadora.restar(30.2, 56.2);
		System.out.println("El resultado de restar 30.2 - 56.2 es " + resultadorestar);
		double resultadodivision = calculadora.dividir(9, 3);
		System.out.println("El resultado de dividir 9 / 3 es " + resultadodivision );
		double resultadomultiplicacion = calculadora.multiplicar(5, 3);
		System.out.println("El resultado de multiplicar 5 * 3 es " + resultadomultiplicacion);
	
	}

}

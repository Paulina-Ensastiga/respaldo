package org.generation.test_unit.test;

import org.generation.test_unit.calculadora.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculadora_test {
	//Dentro de la clase Test lo primero que haremos es instanciar
	//un objeto del tipo que quremos probar 
	
	Calculadora calculadoraTest = new Calculadora ();

	/*Crear los métodos de prueba (test unit) con la anotación @Test
	 * Podemos darle mayor contexto al método con la anotación @DisplayName ("")
	 * 
	 */
	
@Test
@DisplayName("Test para sumar dos numeros enteros")
	//Documentación del código de Test 
	public void sumarTest () {
		//Probar el método utilizando la API de JUnit con los métodos
		//Assertions: assertEquals ()
		//assertEquals(resultadoEsperado, método(parámetrosDeMétodos))
		assertEquals(8,calculadoraTest.sumarNumeros(5, 3));
	}
		
@Test
@DisplayName("Test para restar dos numeros enteros")
	public void restarTest () {
		assertEquals(-13,calculadoraTest.restarNumeros(5, 3));

	}
@Test
@DisplayName("Test para multiplicar dos numeros enteros")
	public void multiplicarTest () {
		assertEquals(36,calculadoraTest.multiplicarNumeros(5, 3));


}
@Test
@DisplayName("Test para dividir dos numeros enteros")
	public void dividirTest () {
		assertEquals(3,calculadoraTest.dividirNumeros(10, 3));
}
}

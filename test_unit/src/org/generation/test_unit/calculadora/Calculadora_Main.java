package org.generation.test_unit.calculadora;

public class Calculadora_Main {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora ();
		
		System.out.println(calculadora.sumarNumeros(5,  3));
		System.out.println(calculadora.restarNumeros(12, 25));
		System.out.println(calculadora.multiplicarNumeros(12, 3));
		System.out.println(calculadora.dividirNumeros(10, 3));
	}

}

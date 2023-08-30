package org.funciones.calculadora;

public class Calculadora {
	//Aqui se crean los métodos
	//Métodos para calculadora que reciban dos argumentos double (sumar, restar, multiplicar, dividir)
	
	public double plus(double numero1, double numero2) {
		double sumar = numero1 +numero2;
		return (sumar);
	}
	
	public double restar(double numero1, double numero2) {
		double resta  = numero1 - numero2;
		return (resta);
		
	}
	public double dividir(double numero1, double numero2) {
		double division = numero1 /numero2;
		return (division);
	}
	public double multiplicar(double numero1, double numero2) {
		double multiplicacion = numero1 * numero2;
		return (multiplicacion);
		
	}

}

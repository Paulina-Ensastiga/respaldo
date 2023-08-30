package org.generation.letras;

public class Letras_Main {

	public static void main(String[] args) {
		// Instanciar objetos (Lector y contadorCaracteres)
		
		Lector lector = new Lector();
		lector.muestraMensaje("Escribe un texto"); //mensaje de contexto
		lector.leerEntrada(); //Texto introducido por el usuario
		String palabra = lector.leerEntrada(); //Texto introducido por el usuario
		
		ContadorCaracteres contador = new ContadorCaracteres();
		int numeroVocales = contador.contarVocales(palabra);
		System.out.println("Hay " + numeroVocales + " vocales");
		
		contador.contarNumeros(palabra);
		int numeroNumeros = contador.contarNumeros(palabra);
		System.out.println("Hay " + numeroNumeros + " numeros");
		
		
		
		contador.contarConsonantes(palabra);
		int numeroConsonante = contador.contarConsonantes(palabra);
		System.out.println("Hay " + numeroConsonante + " consonantes");
		
		
		contador.contarSimbolos(palabra);
		int numeroSimbolo = contador.contarSimbolos(palabra);
		System.out.println("Hay " + numeroSimbolo + " simbolos");
		

	}

}

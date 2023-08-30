package org.repaso.repasos;

import java.util.Scanner;

public class BucleFor {
	public static void main (String []args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzac el primer numero");
		
		int primerNumero = sc.nextInt();
		System.out.println("Introduce otro número");
		int segundoNumero = sc.nextInt();
		
		
		int resultado = 0;
		
		for (int i = 0; i < segundoNumero; i++) {
			System.out.println("Iteración numero: " +i);
			resultado = resultado + primerNumero;
		}
		System.out.println("El reusltado es: " + resultado);
	}

}

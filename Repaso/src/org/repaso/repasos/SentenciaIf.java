package org.repaso.repasos;

import java.util.Scanner;

public class SentenciaIf {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		int numeroPensado = 5;
		
		System.out.println("Adivina le número que estoy pensando de 1 al 10");
		int numeroIntroducido =  sc.nextInt();
		
		if(numeroIntroducido == numeroPensado) {
			System.out.println("Enhorabuena");
		}else {
			System.out.println("Ese no era el número en que estaba pensando");
		}
		
	}
	
}

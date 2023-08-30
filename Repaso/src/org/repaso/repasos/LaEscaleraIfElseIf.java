package org.repaso.repasos;

import java.util.Scanner;

public class LaEscaleraIfElseIf {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe un número entero y te daré información");
		int numeroIntroducido = sc.nextInt();
		if(numeroIntroducido <3) {
			System.out.println("Número introducido es menor quwe 3");
		}else if (numeroIntroducido <5) {
			System.out.println("El número que has introducido esta entre 3 y 5");	
		}else if (numeroIntroducido <8) {
			System.out.println("El número introducido esta entre 5 y 8");
		}else {
			System.out.println("El número introducido es mayor o igual que 8");
		}
	}
}

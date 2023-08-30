package org.repaso.repasos;

import java.util.Scanner;

public class DoWhile {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		do {
			System.out.println("Introduce un numero y le mostraremos la raiz cudrada, para salir introduzaca 0");
			numero = sc.nextDouble();
			if(numero== 0) {
				System.out.println("Hasta la vista");	
		}else {
			System.out.println("La raíz cuadrada de " +  numero + "es " + Math.sqrt(numero));
		}
		
	}while(numero != 0);

}
}

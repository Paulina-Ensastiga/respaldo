package org.generation.loops;

import java.util.Random;
import java.util.Scanner;

public class Reto3 {

	public static void main(String[] args) {
		/*Crea un programa donde el usario deba adivinar un número
		 * 1. El programa debe declarar un número al azar del 1 al 10.
		 * 2. Mientras no se haya adivinado el número, el usuario pueda seguir ingresando números.
		 * 3. Avisar al ususario si el numero que ingreso es mayor o menor al declarado
		 * 4. El programa debe terminar cuando el usuario adivine.
		 * 
		 * 	Package java.util.random
		 */
		
		Scanner sc = new Scanner(System.in);
		Random rnm = new Random();
		
		int numeroAlAzar = rnm.nextInt(10);
		
		System.out.println("Holaa, mi nombre es Syso y estoy pensando en un número. Adivinarias cúal es?");
		
		int numeroUsuario;
		do {
			System.out.println("¿Qué numero cres que estoy pensando?");
			numeroUsuario = sc.nextInt();
			if (numeroAlAzar > numeroUsuario) {
				System.out.println("El número que he pensando es mayor que ese");
			}else if(numeroAlAzar < numeroUsuario) {
				System.out.println("El número que he pensado es menor que ese");
				}
			}while (numeroAlAzar != numeroUsuario);
				System.out.println("¡¡FELICIDADES!! Ese es el número");
				

	}
}

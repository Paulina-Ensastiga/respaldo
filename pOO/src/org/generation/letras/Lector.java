package org.generation.letras;

import java.util.Scanner;

public class Lector {
	Scanner scanner = new Scanner(System.in);
	
	/*Métodos para mostrar el mensaje solicitando al usuario con un parámetro
	/llamado mensaje
	 * 
	 */
	
	public void muestraMensaje (String mensaje) {
		System.out.println(mensaje);
	}
	
	
	//Método para leer la entrada del usuario, no recibe parámetros y retorna un String.
	 public String leerEntrada () {
		 return scanner.nextLine();
		 
	 }
	}



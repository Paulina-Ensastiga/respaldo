package org.generation.loops;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		/*
		 * La declaración While ejecuta continuamente un bloque de código mientras se cumpla una condición particular. Cuando no se cumple se termina el ciclo.
		 * while(expresion){
		 * 		(declaraciones)
		 * }
		 */

		int cuenta = 1;
		while(cuenta < 11) {
			System.out.println("La cuenta es: " + cuenta);
			cuenta++;
		}
		
		//Crear un programa que le solicite al usuario un número,
		/* elcual será tomado como el número final de una cuenta que
		 * que  inicia en 1. Debe sin consola la cuenat del 1 hasat el
		 * número que el usuario proporcionó.
		 * 
		 * 1.Importar un scanner
		 * 
		 */
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Escribe un número que servirá como valor final de una cuenta");
		int numeroFinal= scanner.nextInt();
		int contador= 1;
		
		while(contador <= numeroFinal) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("Aqui está tu cuenta");
		scanner.close();
	
		
//Crear un programa que solicite al usuario un número entre 0 y 999 y determine cuántos dígitos tiene. Si elige el 0 muestra cuántos dígitos tiene y finaliza el programa
        
        /*
         * 1. Importar el Scanner
         * 2. Interactuar con el usuario (contexto) y solicitar el número
         * 3. Guardar el número en una variable (int valor)
         * 4. Ejecutar el bucle. Si el número (valor <= 999 && >= 100): tiene 3 dígitos
         * 5. valor >= 10: El número tiene 2 dígitos
         * 6. valor no cumple con las opciones anteriores, tiene un dígito
         * 7. valor == 0, finalizamos
         */
        
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Escribe un número entre 0 y 999 para determinar cuántos dígitos tiene. Si elige 0, finaliza el programa");
        int valor;
        
        do {
            valor = scanner1.nextInt();
            if(valor <= 999 && valor >= 100) {
                System.out.println("El número tiene 3 dígitos");
            }else {
                if(valor >= 10) {
                    System.out.println("El número tiene 2 dígitos");
                }else {
                    System.out.println("El número tiene 1 dígito");
                }
            }
        }while(valor != 0);
        System.out.println("Listo, vuelva pronto");
		
	}

}

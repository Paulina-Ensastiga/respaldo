package org.ejercicio.vass;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioVass {
	
	/*
	 Realizar un programa que pida por consola una palabra cíclicamente.
	 Cuando el usuario haya insertado una palabra que ya insertó previamente, 
	 el programa mostrará el órden en que dicha palabra ya se había insertado anteriormente y terminará elprograma.

			Por ejemplo:
			Inserta una palabra: hola
			Inserta una palabra: mundo
			Inserta una palabra: mi
			Inserta una palabra: primer
			Inserta una palabra: programa
			Inserta una palabra: mundo
			Ya ha insertado dicha palabra en el orden 2.
			Termina programa

	 */
	
	
	public static void main (String []args) {
		//
		Scanner sc = new Scanner (System.in);
		ArrayList <String> Palabra = new ArrayList <>();
		
	
			
		        while (true) {
		            System.out.print("Inserta una palabra: ");
		            String palabra = sc.nextLine();
		            
		            if (palabra.contains(palabra)) {
		                int index = palabra.indexOf(palabra) + 1;
		                System.out.println("Ya ha insertado dicha palabra en el orden " + index + ".");
		                break;
		            }
		            
		           
		        }
		        
		        sc.close();
		    }
		
		
		
	}



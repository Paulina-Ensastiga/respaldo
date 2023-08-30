package org.generation.controlFlow;

import java.util.Scanner;

public class OperadorTernario {
	
	/* Operador ternario 
	 * Variable = (condición)? true : false; 
	 * 
	 * Determinar si los numeros ingresados por el ususario son pares
	 * 
	 * 
	 * */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Este programa determina el si tres números son pares");
		
		System.out.println("Ingresa el primer número");
		int num1 = scanner.nextInt();
		
		System.out.println("Ingresa el segundo número");
		int num2 = scanner.nextInt();
		
		System.out.println("Ingresa el tercer número");
		int num3 = scanner.nextInt();
		
		String msj1 = "Los tres numeros son pares" ;
		String msj2 = "No son pares";
		String pares = ((num1 % 2 == 0) && (num2 % 2 == 0) && (num3 % 2 == 0)) ? msj1 :msj2;
		System.out.println(pares);
		
		scanner.close();

		/*Switch*/
		System.out.println("Seleccione el número correpondiente al dia de la semana, donde 1 es Lunes y hasta 5 Viernes");
		 
		int diaSemana = scanner.nextInt();
		 
		 switch(diaSemana) {
		 case 1:
			 System.out.println("Lunes");
			 break;
		 case 2:
			 System.out.println("Martes");
			 break;
		 case 3:
			 System.out.println("Miercoles");
			 break;
		 case 4:
			 System.out.println("Jueves");
			 break;
		 case 5: 
			 System.out.println("Viernes");
			 defult:
			System.out.println("Numero Invalido");
		 }
		
		 scanner.close();
	}

}

package org.generation.loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Bienvenido a GenerationBank.");
	        System.out.println("Introduzca su número de cliente");
	        int numCliente = sc.nextInt();
	        System.out.println("Introduzca su contraseña");
	        String password = sc.nextLine();
	        
	        int opcionSeleccionada;
	        
	        do {
	        System.out.println("Elija una de las siguientes opciones y escriba número de la opción");
	        System.out.println("1. Consultar saldo");
	        System.out.println("2. Ingresar dinero");
	        System.out.println("3. Retirar dinero");
	        System.out.println("4. Consultar sus ultimos movimientos");
	        System.out.println("5. Convertir divisas");
	        System.out.println("0. Salir");
	        
	        opcionSeleccionada = sc.nextInt();
	        switch(opcionSeleccionada) {
	        case 1:
	            System.out.println("Su saldo es de $500");
	            break;
	        case 2:
	            System.out.println("Ingresando dinero");
	            break;
	        case 3:
	            System.out.println("Retirando dinero");
	            break;
	        case 4:
	            System.out.println("Aquí están sus últimos 5 movimientos");
	            break;
	        case 5:
	            System.out.println("Convirtiendo divisas");
	            break;
	        case 0:
	            System.out.println("Gracias por su visita");
	            break;
	            default:
	                System.out.println("Elija una opción correcta");
	                break;
	        }
	        }while(opcionSeleccionada != 0);
	}

}



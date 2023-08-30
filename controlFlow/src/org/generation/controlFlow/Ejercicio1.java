package org.generation.controlFlow;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String[] args){
		/*
		 * Calcular la prima de los trabajadores si los ingresos mensuales son superiores a 300 se aplica el 10%
		 * si son menores se aplica el 5%
		 */
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese su edad");
		
		int edad = scanner.nextInt();
		
		
		if (edad >= 70) {	
			int prima = 500;
			int aumento = 50 ;
			int resultado = prima+aumento;
			System.out.println("La prima mensual es de " +  resultado );
		}else if (edad >49 && edad<70) {
			int prima = 400;
			int aumento = 40 ;
			int resultado = prima+aumento;
			System.out.println("La prima mensual es de " +  resultado );
		}else if (edad >29 && edad<50) {
			int prima = 250;
			float aumento = 12.5f ;
			float resultado = prima+aumento;
			System.out.println("La prima mensual es de " +  resultado );
		}else if (edad <=29 && edad>=18 ) {
			int prima = 100;
			int aumento = 5 ;
			int resultado = prima+aumento;
			System.out.println("La prima mensual es de " +  resultado );
		}else{
			System.out.println("Es menor de edad, no puede trabajar, sigue estudiando :3");
	}
	
	////ejercicio 2 de aplicacion en equipo
				System.out.println("escribe tu nombre de usuario");
				String nombre=scanner.nextLine();
				System.out.println("escribe tu nombre de contraseña");
				String contraseña=scanner.nextLine();
				System.out.println("tu nombre es "+ nombre +"y tu contraseña fue: "+ contraseña + "bienvenido a tu systema");
				System.out.println("que quieres realizar 1.consultar saldo  2.- ingresar dinero 3.- retirar dinero 4.- consultar ultimos movimientos 5.- convertir divisas 0.- salir");
				int valorBanco= scanner.nextInt();
				
				switch(valorBanco) {
				case 1:
					System.out.println("tu saldo es de $0 ponte a jalar xD");
					break;
				case 2:
					System.out.println("¿cuanto dinero quieres ingresar?");
					break;
				case 3:
					System.out.println("¿Cuanto dinero quieres retirar?");
					break;
				case 4:
					System.out.println("¿Quieres ver tus ultimos movimientos del mes?");
					break;
				case 5:
					System.out.println("Bienvenido a convertir tus divisas cual es tu moneda actual: 1.- pesos; 2.-Dolares; 3.-Euros; ");
				int moneda=scanner.nextInt();
				switch(moneda) {
				case 0:
					System.out.println("gracias por visitarnos");
					break;
				case 1: 
					System.out.println("¿Cuanto quieres cambiar?");
					int cambio=scanner.nextInt();
						int dolar=18;
						int euro=19;
						int pesoDolar= cambio/dolar;
						int pesoEuro= cambio/euro;
						System.out.println("el monto a cambiar en dolares seria de: "+ pesoDolar);
						System.out.println("el monto a cambiar en Euros seria de: "+ pesoEuro);
						break;
				case 2:
					System.out.println("¿Cuanto quieres cambiar?");
					int Cambio=scanner.nextInt();
						int peso=18;
						float Euro=0.9f;
						int dolarPeso= Cambio*peso;
						float dolarEuro= Cambio/Euro;
						System.out.println("el monto a cambiar en pesos seria de: "+ dolarPeso);
						System.out.println("el monto a cambiar en Euros seria de: "+ dolarEuro);
						break;
						
				case 3:
					System.out.println("¿Cuanto quieres cambiar?");
					int cambiO=scanner.nextInt();
						int pesos=19;
						float Dolar=0.9f;
						int euroPeso= cambiO*pesos;
						float euroDolar= cambiO*Dolar;
						System.out.println("el monto a cambiar en pesos seria de: "+ euroPeso);
						System.out.println("el monto a cambiar en dolares seria de: "+ euroDolar);
						break;
						default:
							System.out.println("ingresa un valor adecuado");
				}
		default:
			System.out.println("Número inválido ingresa un valor valido");
	}
	}
	
	
	
	
}


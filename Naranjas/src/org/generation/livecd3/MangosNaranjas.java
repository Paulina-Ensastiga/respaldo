//Celia Paulina Ensastiga Pichardo Calificación:4 

package org.generation.livecd3;

import java.util.Scanner;

public class MangosNaranjas {
	


		int mangos;
		int naranjas;
		
		public MangosNaranjas(int mangos, int naranjas) {
			this.mangos = mangos;
			this.naranjas = naranjas;
		}
	  
		public void imprimir() {
			int numeroCajas = obtenerNumeroCajas();
			int mangosPorCaja = mangos / numeroCajas;
			int naranjasPorCaja = naranjas / numeroCajas;
			
			System.out.println("Numero de cajas: " + numeroCajas);
			System.out.println("Mangos por caja: " + mangosPorCaja);
			System.out.println("Naranjas por caja: " + naranjasPorCaja);	
			
		}
		int obtenerNumeroCajas() {
			int menorCantidad = Math.min(naranjas, mangos);
			
			for(int i = menorCantidad;i>=1;i--) {
				if(mangos % i == 0 && naranjas % i == 0) {
					return i;
				}
			}
			return 1;
		}
		public static void main(String[] args) {
			Scanner scanner =  new Scanner(System.in);
			
			System.out.println("Ingrese el numero de mangos: ");
			int mangos = scanner.nextInt();
			
			System.out.println("Ingrese el numero de naranjas: ");
			int naranjas = scanner.nextInt();
			
			MangosNaranjas mn = new MangosNaranjas(mangos,naranjas);
			mn.imprimir();
		}
		
	}


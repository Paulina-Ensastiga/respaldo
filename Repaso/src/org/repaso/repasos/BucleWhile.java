package org.repaso.repasos;

import java.util.Scanner;

public class BucleWhile {
	public static void main (String []args) {
		Scanner sc =  new Scanner (System.in);
		System.out.println("Ingresa un número");
		double numero = sc.nextInt();
		
		double  candidatoARaiz =0.0;
		
		while(candidatoARaiz * candidatoARaiz <= numero) {
			candidatoARaiz += 0.01;
			System.out.println("¿Sera el número " + candidatoARaiz + "?" + "Su cuadrado es " + candidatoARaiz);
	
		}
		candidatoARaiz -=0.01;
		System.out.println("La raiz cuadrad que hemos calculado es " + candidatoARaiz);
		System.out.println("La raiz cuadrada real es: " + Math.sqrt(numero));
	}

}

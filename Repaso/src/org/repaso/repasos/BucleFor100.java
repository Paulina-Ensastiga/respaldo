package org.repaso.repasos;

public class BucleFor100 {
	
	public static void main (String []args) {
		int suma =0;
		for (int i=1, j=100; i<j; i++, j--) { //tenemos dos variables 
			
			System.out.println("Iteración número " + i + " sumando " + i +" y " + j);
			suma = suma + i + j;
		}
		
		System.out.println("El resultado de sumar los número del 1 al 100 es " + suma);
	}
	

}

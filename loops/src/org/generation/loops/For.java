package org.generation.loops;

public class For {
	public static void main(String[] arg) {
	
/*
	
	int filas = 5;
	
	for (int i = 0; i< filas; i++)
		for(int j= 0; j<=i; j++) {
			System.out.println("*");
		} System.out.println();
		
		*/
		
} //Ejemplo con for para calcular potencias de Pi
	
	 int numPotencias = 5;
     System.out.println("El valor de PI es " + Math.PI);
     
     for(int i = 1; i < =numPotencias; i++) {
         double resultado = Math.pow(Math.PI, i);
         System.out.println("PI elevado a la " + i + ": " + resultado);
     }
}
}
}
package org.repaso.repasos;

import java.util.Scanner;

public class OperadorInterrogante {
	
	public static void main (String []args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduce un número entero");
	int dividendo = sc.nextInt();
	
	
	System.out.println("Intrtoduce otro número");
	int divisor = sc.nextInt();
	int resultado;
	/*
	if(divisor == 0) {
		resultado =0;
	} else {
		resultado =dividendo/ divisor;
	}
	*/
			//true           //false
	resultado = divisor==0 ? 0: dividendo/divisor;
	System.out.println(resultado);
	
	}

}

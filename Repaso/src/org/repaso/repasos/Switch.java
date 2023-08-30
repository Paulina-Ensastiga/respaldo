package org.repaso.repasos;

import java.util.Scanner;

public class Switch {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el dia de la semana que quiere una cita");
		String diaCita = sc.nextLine();
		
		switch(diaCita){
			case "lunes":
				System.out.println("El lunes esta disponible de 11:00 s 12:30");
				break;
			case "martes":
				System.out.println("El martes esta disponible de 9:30 s 10:30");
				break;
			default:
				System.out.println("NO ha introducido un día válido");
				
			
		
		
	}

}

}
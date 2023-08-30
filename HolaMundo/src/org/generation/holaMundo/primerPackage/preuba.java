package org.generation.holaMundo.primerPackage;


import java.util.Scanner;


/*Celia Paulina Ensastiga Pichardo*/
public class preuba {
	public static void main (String[] args){
	
	    Scanner s = new Scanner(System.in);
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String jugador1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);
	    String jugador2 = s.nextLine();
	    
	    if (jugador1.equals(jugador2)) {
	      System.out.println("Empate");
	    } else {
	      int ganador = 2;
	      switch(jugador1) {
	        case "piedra":
	          if (jugador2.equals( "tijeras")) {
	            ganador = 1;
	          }
	          break;
	        case "papel":
	          if (jugador2.equals("piedra")) {
	            ganador = 1;
	          }
	          break;
	        case "tijera":
	          if (jugador2.equals("papel")) {
	            ganador = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + ganador);
	    }
	  
	  
	    }
}
/*
 * 5 Pau inicia revisando el codigo para entenderlo y luego procede a corregir. Se traba un poco al no recordar una parte pero despues despues corrige el codigo
 *  adecuadamente y logra correrlo. Su logica es adecuada y logra que el codigo se entienda por los nombres de las variables
*/
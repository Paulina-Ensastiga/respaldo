package org.generation.controlFlow;
import java.util.Scanner;

public class controlFlow {
	
	public static void main(String [] args) {
		/*
		 * if (expresion_logica){
		    //ejecuta un bloque de código
		     }else if (expresion_logica){
		     //ejecuta este bloque de código
		     }else {
		     //ejecuta este bloque de código
		      }
		  */
		
		if(30 > 10) {
			System.out.println("30 es mayor que 18");
		}
		
		int time = 22;
		
		if(time >=6 && time <=12) {
			System.out.println("Es de mañana");
		} else if (time >= 13 && time <=18){
			System.out.println("Es de tarde");
		}else if (time >=19 && time <=23) {
			System.out.println("Es de noche");
		}else if (time >=0 && time <=5) {
			System.out.println("Es de madrugada");
		}else {
			System.out.println("Escirbe una hora válida");
		}

	//Ejemplo 2 Dias de la semana
		int day = 5;
		if(day == 1) {
			System.out.println("Lunes");
		}else if (day == 2){
			System.out.println("Martes");
		}else if (day == 3) {
			System.out.println("Miercoles");
		}else if (day == 4) {
			System.out.println("Jueves");
		}else if (day == 5) {
			System.out.println("Viernes");
		}else if (day == 6) {
			System.out.println("Sabado");
		}else if (day == 7) {
			System.out.println("Domingo");
		}else if (day >7) {
			System.out.println("Número de la semana invalido ");
		}
		
		/*Java User (Scanner)
		 * La clase Scanner se utiliza para obtener la entrada del usuario y se encuentra
		 * en el java.util.package
		 * 
		 *  import java.util.Scanner: De esat amanera importamos nuestra clase Sacnner
		 *  
		 */
		
		Scanner scanner = new Scanner(System.in); //Objeto Scanner creado
		System.out.println("Escribe tu nombre");
		
		String userName = scanner.nextLine();
		
		System.out.println("Escribe tu edad");
		
		int age = scanner.nextInt();
		
		System.out.println("Tu nombre de usuario es " + userName + "y tu edad es" + age);
	
		System.out.println("Selecione un dia correspondiente al dia de la semana");
		int dia = scanner.nextInt();
		if(dia == 1) {
			System.out.println("Lunes");
		}else if (dia == 2){
			System.out.println("Martes");
		}else if (dia == 3) {
			System.out.println("Miercoles");
		}else if (dia == 4) {
			System.out.println("Jueves");
		}else if (dia == 5) {
			System.out.println("Viernes");
		}else if (dia == 6) {
			System.out.println("Sabado");
		}else if (dia == 7) {
			System.out.println("Domingo");
		}else if (dia >7) {
			System.out.println("Número de la semana invalido ");
		}
		
		

		
		
	}

}

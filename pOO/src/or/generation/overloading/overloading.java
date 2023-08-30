package or.generation.overloading;

import java.math.BigDecimal;

public class overloading {
	public static int sumar (int num1, int num2) {
		return num1 + num2;
		
	}
	
	//Sobrecargando el método sumar dos double
	
	
	
	///Sobrecaragar el método, utilizando BigDecimal
	public static BigDecimal sumar (BigDecimal num1, BigDecimal num2) {
		return num1.add(num2);
	}
	public static void main (String[]args) {
		//Invocando métodos
		System.out.println(sumar(8.5));
		System.out.println(sumar(4.3, 6.26));
		
		
		//Invocando el método sumar de tipo BigDecimal
		BigDecimal num1 = new BigDecimal ("4.3");
		BigDecimal num2 = new BigDecimal ("6.26");
		
		System.out.println(sumar (num1, num2));
	}
	
}

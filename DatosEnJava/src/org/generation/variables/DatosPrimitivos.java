package org.generation.variables;

public class DatosPrimitivos {
	
	public static void main(String[] args) {
		/*
		 * Datos primitivos. Se consideran los datos 		 		*fundamentales y sirven para gestionar los tipos de 		información más básicos como números, letras, booleanos.
		 *Existen 8 tipos de datos primitivos: byte,short, int, 		long, float, double, boolean,char
		 */
		//byte (valor mínimo = 128, valor máximo =127)
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		System.out.println(maxByte);
		System.out.println(minByte);
		
		//Shorts (valor mínimo -32760 valor, máximo 32767)
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println(minShort);
		System.out.println(maxShort);
	
		//int
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		
		System.out.println(minInt);
		System.out.println(maxInt);
		
		//Long
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		
		System.out.println(maxLong);
		System.out.println(minLong);
		
		
		//Float
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		
		System.out.println(minFloat);
		System.out.println(maxFloat);
		
		
		float numFloat = 12.3F;
				
		
		//Double
		
		double maxDouble = Double.MAX_VALUE;
		double minDouble = Double.MIN_VALUE;
		System.out.println(maxDouble);
		System.out.println(minDouble);
		
		//Boolean
		
		//Char
		char valorChar ='3';
		
		//siempre que tengamos un char es necesario ponerlo entre comillas		
		
		/* Castingt
		*(Conversiónde tipos de datos en Java)
		*---Ampliación  (automatica), convetimos un tipo de dato más pequeño aun tipo de datos más grande
		* byte => short => char => int => float => double
		*
		*/
		int myInt = 125;
		double myDouble = myInt; //Automático
		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		
		/*--Estrechamiento (manual); convertimos un tipok de dato más grande en un tipo de más pequeño
		 * double => float => long => int => char => short => byte 
		 */ 
		 //Convertir myDouble (125.0) a un dato de tipo init (125)
		int nuevoInt = (int)myDouble;
		System.out.println("Este es un double" + myDouble);
		System.out.println("Esta es una conversión de estrechamiento: " + nuevoInt);
		
		
		//Conversión de floar a int
		float valorFloat =1.89f;
		int valorInt = (int)valorFloat;
		System.out.println("Conversión de float a int: " + valorInt);
		
		//Conversión de char a int
		
		char convertirChar = 'M';
		int conversionInt = convertirChar;
		System.out.println("Conversión de char a int: " + conversionInt);
		
		
		
		
		
		
		
	
	}
	
	


}

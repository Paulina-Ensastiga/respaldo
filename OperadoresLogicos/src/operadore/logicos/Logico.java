package operadore.logicos;

public class Logico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		// Operadores logicos
		
		/*
		 * Retornan unicamente 2 resultados
		 * 	true, false
		 * 
		 *  And, Or, Not
		 *  
		 *  
		 *  
		 *  And &&
		 * 
		 * El operador logico And && evalua 2 o mas elementos y
		 * si todos se cumplen o son true, devuelve true
		 * 
		 * 
		 * 
		 * Or ||
		 * 
		 * El operador logico Or || evalua 2 o mas elementos y si uno
		 * de ellos se cumple, el resultado es true
		 * 
		 * True false
		 * False true
		 * 
		 * 
		 * Not !
		 * 
		 * El operador logico Not ! niega el valor original de una sentencia
		 * booleana
		 * 
		 *
		 */
		
		int numeroUno = 5;
		int numeroDos = 7;
		
		//Declaración de una sentencia booleana
		
		boolean primerEjemplo = numeroUno == numeroDos;
		System.out.println(primerEjemplo);
		
		//Segunda declaración boolena (AND &&)
		boolean segundoEjemplo = (numeroUno < numeroDos) || (numeroDos > numeroUno);
		System.out.println("Res:" +segundoEjemplo);
		
		
		/*
		 * Tabla de Verdad AND
		 * 
		 * true && true = true
		 * true && falSe = false
		 * false && true = false
		 * false && false = false
		 */
		
		boolean verdad1 = true;
		boolean verdad2 = false;
		
		System.out.println( "True && True: " + (verdad1 && verdad1));
		System.out.println("True && False: " + (verdad1 && verdad2));
		System.out.println("False && True: " + (verdad2 && verdad1));
		System.out.println("False && False: " + (verdad2 && verdad2));
		
		
		/*
		 * Tabla de verdad OR ||
		 * 
		 * true || true = true
		 * true || false = true
		 * false || true = true
		 * false || false
		 */
		
		System.out.println( "True || True: " + (verdad1 && verdad1));
		System.out.println("True || False: " + (verdad1 && verdad2));
		System.out.println("False || True: " + (verdad2 && verdad1));
		System.out.println("False || False: " + (verdad2 && verdad2));
		
		
		//Not !
		
		System.out.println("Not : " + !(verdad2));

		
		/*
		 * Estudio de caso
		 * 
		 * Una institución educativa quiere agilizar su proceso de revisión
		 * para validar calificaiones probatorioa o reprobatorias
		 * 
		 * Calificación min aprobatoria 70
		 * Calificaión max 100
		 * 
		 */
		
		//Paso 1- Analizar el problema
		
		int calificacion = 65;
		boolean evaluador = calificacion >=70;
		boolean evaluadorMax = calificacion <=100; 
		System.out.println("La calificación es aprobatoria: " + evaluador);
		System.out.println("La calificacion es menor a 100: " + evaluadorMax);
	
		/*
		 * Actividad 1: Si X, Y y Z son variables de tipo boolean con valores X = true, Y = false, Z = true, determina el valor de las siguientes expresiones lógicas:

      		a) (X && Y) || (X && Z)                 b) (X || !Y)&& (!X || Z)

      		c) X || Y && Z                          d) !(X || Y) && Z 

      		e) X || Y || X && !Z && !Y              f) !X || !Y || Z && X && !Y
		 * 
		 */
		boolean X = true;
		boolean Y = false;
		boolean Z = true;
		
		
		System.out.println("El resultado del inciso a es " + ((X && Y) || (X && Z)));
		System.out.println("El resultado del inciso b es " + ( (X || !Y)&& (!X || Z)));
		System.out.println("El resultado del inciso c es " + (( X || Y && Z)));
		System.out.println("El resultado del inciso d es " + ( !(X || Y) && Z ));
		System.out.println ("El resultado del inciso f es " + (X || Y || X && !Z && !Y ));
		System.out.println("El resultado del inciso g es " + (!X || !Y || Z && X && !Y));
		
		/*
		 * Actividad 2: Si W, X, Y y Z son variables de tipo boolean con valores W = false, X = true, Y = true, Z = false, determina el valor de las siguientes expresiones lógicas:

      		a) W || Y && X && W || Z                b) X && !Y && !X || !W && Y

      		c) !(W || !Y) && X || Z                 d) X && Y && W || Z || X

      		e) Y || !(Y || Z && W)                  f) !X && Y && (!Z || !X)
      */
		
		boolean W = false;
		boolean X2 = true;
		boolean Y2 = true;
		boolean Z2 = false;
		
		System.out.println("El resultado del inciso a es " + (W || Y && X && W || Z   ));
}
}
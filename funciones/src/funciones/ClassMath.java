package funciones;

public class ClassMath {

	public static void main(String[] args) {
		metodos asteriscos = new metodos ();
		asteriscos.imprimirAsteriscos();
		
		/*
		 * Class Math de la Java API. Podemos acceder a operaciones
		 * matemáticas y constantes para utilizarla en nuestras clases
		 * 
		 * Accedemos mediantes la palabra reservada Math.
		 */
		
		//Calcular la altura de una torre que se encunetra a 100 metros de una persona, que observa
		//la punta de la torre con un angulo de la elevación de 30°

		double distancia =100;
		double anguloElevacion =30;
		
		double conversionAngulo = Math.toRadians(anguloElevacion);
		double altura = Math.cos(anguloElevacion) * distancia;
		System.out.println("La altura de la torre es de " + altura + " metros");
	}
	
		//El cubo de un número (n*n*n)
	
		double numero =25.6;
		double cubo = Math.pow(numero, 3);
		System.out.println("El cubo de " + numero + "es " + cubo);
	
	

}

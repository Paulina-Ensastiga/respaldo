package funciones;

public class Refactorización {

	/*Refactorizar. Es el proceso de modificar el código fuente de un programa para mejorar 
	 * su estructura interna y su diseño, todo sin cambiar su comportamiento.
	 * Refactorizar = Refactorizar 
	 * 
	 * OBJETIVO, mejorar la calidad del código sin introdudir errores
	 */
	
	//Método que reciben un argumento (int)  y que si es par o impar
	/*public static void  parImpar(int numero) {
		if(numero % 2 ==0 ) {
			System.out.println(numero + "es par");
		}else {
			System.out.println(numero + "es impar");
		}
	}
	
	public static void main (String[] args) {
		parImpar(55);
		*/
	
	//Método que reciba un argumento (int) y que determine si es par o impar
    /*public static void parImpar(int numero) {
        if(numero % 2 == 0) {
            System.out.println(numero + " es par");
        }else {
            System.out.println(numero + " es impar");
        }
    }*/
    //Refactorización de la sentencia if-else del método parImpar a un operador ternario 
    public static void parImpar(int numero) {
        String refactorizado = (numero % 2 == 0)? " es un número par" : " es un número impar";
        System.out.println(numero + refactorizado);
    }
    
    public static void main(String[] args) {
        parImpar(55);
    }
}

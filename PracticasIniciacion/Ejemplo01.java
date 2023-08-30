
public class Ejemplo01 {

	public static void main(String[] args) {
		
		int base = Integer.valueOf(args[0]);
		int altura = Integer.valueOf(args[1]); 
		
		int area = areaRectangulo(base, altura);
		
		System.out.println("El area es " + area);
	}
	private static int areaRectangulo (int base, int altura) {
		return base* altura;
		
	}
	
}

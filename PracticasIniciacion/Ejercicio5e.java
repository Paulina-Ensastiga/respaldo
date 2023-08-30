
public class Ejercicio5e {
	
	private static final int MAX_ARGS=4;

	public static void main(String[] args) {
		int numArgu = args.length;
		if (numArgu ==0) {
			System.err.println("No hay argumentos");
		}else if (numArgu <= MAX_ARGS) {
			System.out.println("Hay " + numArgu);
		}else{
			System.out.println("Se han recibido demasiados argumentos ");
		}
	}
}

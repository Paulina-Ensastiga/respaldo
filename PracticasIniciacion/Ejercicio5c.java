public class Ejercicio5c {

	public static void main(String[] args) {
		int numArgu = args.length;
		if (numArgu ==0) {
			System.err.println("No hay argumentos");
		}else if (numArgu <= 4) {
			System.out.println("Hay " + numArgu);
		}else{
			System.out.println("Se han recibido demasiados argumentos ");
		}
	}
}


public class Ejercicio5d {
	
	private static final int 
	TEMP_FRIO =15;
	
	public static void main(String[] args) {
		int temp = Integer.valueOf(args[0]);
		if (haceFrio (temp)) {
			ponerCalefaccion();
			abrigarse();
		}
	}
	private static boolean haceFrio(int temp){
		return temp <=TEMP_FRIO;
	}
	
	private static void ponerCalefaccion () {
		System.out.println("Calefacción a tope!");
	}
	private static void abrigarse() {
		System.out.println("Tapate");
	}
}

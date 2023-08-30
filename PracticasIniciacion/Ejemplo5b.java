
public class Ejemplo5b {

	public static void main(String[] args) {
		int numeArgs= args.length;
		
		if(numeArgs ==0) {
			System.err.println("No hay argumentos");
		}else {
			System.out.println("Se han recibido" + numeArgs + "argumentos");
			
		}
	}
}

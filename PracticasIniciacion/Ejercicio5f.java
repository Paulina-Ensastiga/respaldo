
public class Ejercicio5f {
	
	public static void main(String[] args) {
		if (args.length ==1) {
			int mes= Integer.valueOf(args[0]);
			if (mes < 1 || mes>12) {
				System.err.println(mes + " No es un mes valido");
			}else {
				int dias = calculaDias(mes);
				System.out.println("El mes " + mes + " tiene" + dias + " días." );
			}
		}
	
	}


	
	private static int calculaDias (int mes) {
		int dias;
		switch(mes) {
			case 2:
				System.out.println("Febrero");
				dias=28;
				break;
			case 4:
				System.out.println("Abril");
			case 6:
				System.out.println("Junio");
			case 9:
				System.out.println("Septiembre");
				dias=30;
				break;
			default:
				System.out.println("Mes de los largos");
				dias =31;
				break;
		}//switch
		return dias;

	}

}
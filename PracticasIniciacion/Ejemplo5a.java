
public class Ejemplo5a {

	public static void main(String[] args) {
		int temperatura = Integer.valueOf(args[0]);
		System.out.print("La temperatura es de ");
		if (temperatura > 0) {
			System.out.println(temperatura + "°C positivos ");
		}else {
			if (temperatura == 0) {
				System.out.println(temperatura + "mi frio ni calor");
		}else {
			System.out.println(temperatura + "°C bajo cero ");
		}
	}

	}
}

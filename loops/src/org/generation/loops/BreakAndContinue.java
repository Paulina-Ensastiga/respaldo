package org.generation.loops;

public class BreakAndContinue {

	public static void main(String[] args) {
		/*La sentecncia break se utiliza para salir de un bucle cuando
		 * de un bucle cuando se cumple una condición
		 * 
		 */
		
		for (int i =0; i<=10; i++) {
			if(i==0) {
				break;
			}
			System.out.println(i);
			
		}
		/*La sentencai continua interrumpe una iteración del bucle,si se
		 * prodece una condición especifica y continúa con la siguiente
		 *  iteración del bucle
		 */
		
			int j = 1;
			while(j < 11) {
				if(j==3) {
					
				}
				System.out.println("j vale" + j);
				j++;
			}
			


	}

}

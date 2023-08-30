package org.generation.pOO;

public class Main_Employee {

	public static void main(String[] args) {
		// Instanciando objeto
		Employee empleado1 = new Employee("Paulina ", "Ensastiga ", 6540 , (byte)36 , 1.50 , "CDMX ",
		"CEPAYH19463");
		
		Employee empleado2 = new Employee("Nancy", "Perez", 5895, (byte)24, 39000, "CDMX",
		"PERN99NFB");
		Employee empleado3 = new Employee("Isacc", "Campos", 3059, (byte)24, 9852, "CDMX",
		"CART19990222HFV");
		Employee empleado4 = new Employee("Maria", "Castro", 6205, (byte)27, 35229, "GUERRERO",
		"");
		
		
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);
		System.out.println(empleado4);

		//Invocando métodos 
		
		empleado1.calcualrSalario();
		empleado2.calcualrSalario();
		empleado3.calcualrSalario();
		empleado4.calcualrSalario();
		
		empleado4.trabajar();
	}

}

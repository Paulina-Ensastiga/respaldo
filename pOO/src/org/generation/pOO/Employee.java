package org.generation.pOO;

public class Employee {
	
	//1. Atributos o propiedades
	 String nombre;
	 String apellido;
	 int id;
	 byte edad;
	 double salario;
	 String direccion;
	 String rFC;
	
	 //2.Constructor
	 
	 
	public Employee(String nombre, String apellido, int id, byte edad, double salario, String direccion, String rFC) {
		//super(); No es necesarioa ya que no hereda de una super clase
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.edad = edad;
		this.salario = salario;
		this.direccion = direccion;
		this.rFC = rFC;
	}

	//3. Métodos de la clase
	
	public void trabajar() {
		System.out.println("El empleado " + this.nombre + " trabaja de lunes a viernes en la surcursal de " + this.direccion);
	}
	
	public void calcualrSalario () {
		System.out.println("El salario de " + this.nombre + " " + this.apellido + " es de " + this.salario + " pesos");
	}
	
	public void informarSat () {
		System.out.println( "El RFC de" + this.nombre + "" + this.apellido + "es de" + this.rFC + "quitale su 35% de ISPT" );
	}

	

	 //4. Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getrFC() {
		return rFC;
	}

	public void setrFC(String rFC) {
		this.rFC = rFC;
	}

	@Override
	public String toString() {
		return "Employee [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", edad=" + edad + ", salario="
				+ salario + ", direccion=" + direccion + ", rFC=" + rFC + "]";
	}
	



	
	
	 
	 
}

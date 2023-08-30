package com.gen.polymorphism;

public class Circle extends Shape {
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	//Notación @Override

	/*Permite sobreescribir el comportamiento de un método
	 * o de una clase según su contexto
	 */
	
	@Override
	public double calculateArea () {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	

}

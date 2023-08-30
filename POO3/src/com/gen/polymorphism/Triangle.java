package com.gen.polymorphism;

public class Triangle extends Shape {
	private double base;
	private double height;
	
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
		
		
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	
	

}

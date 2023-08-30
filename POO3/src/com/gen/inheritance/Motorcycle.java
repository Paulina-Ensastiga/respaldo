package com.gen.inheritance;

public class Motorcycle extends Vehicle {
	private boolean handlebar;

	public Motorcycle(boolean handlebar) {
		super(brand, model);
		this.handlebar = handlebar;
	}

	public boolean isHandlebar() {
		return handlebar;
	}

	public void setHandlebar(boolean handlebar) {
		this.handlebar = handlebar;
	}
	
	public void wheelie () {
		System.out.println("aaaaaa");
	}

	@Override
	public String toString() {
		return "Motorcycle [handlebar=" + handlebar + "]";
	}
	

}

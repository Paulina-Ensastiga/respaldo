package com.gen.inheritance;

public class Car extends Vehicle {
	private int doors;
	
	public Car(String brand, String model, int doors) {
		super(brand, model);
		this.doors = doors;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}
	public void openTrunk() {
		System.out.println("Abromos la cajuela con la merch");
	}

	@Override
	public String toString() {
		return "Car [doors=" + doors + "]";
	
	}

	
	

}

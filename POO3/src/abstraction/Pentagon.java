package abstraction;

import com.gen.polymorphism.Shape;

public class Pentagon extends Shape {

	public Pentagon(double base, double apothem) {
		super();
		this.base = base;
		this.apothem = apothem;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getApothem() {
		return apothem;
	}
	public void setApothem(double apothem) {
		this.apothem = apothem;
	}
	

}

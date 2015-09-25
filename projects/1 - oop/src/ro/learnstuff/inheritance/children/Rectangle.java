package ro.learnstuff.inheritance.children;

import ro.learnstuff.inheritance.parent.Shape;

public class Rectangle extends Shape {
	private double length = 0;
	private double height = 0;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calculatePerimeter() {
		System.out.println("Calculate rectangle perimeter!");
		return 2*this.length + 2*this.height;
	}

}

package ro.learnstuff.inheritance.parent;

public abstract class Shape {

	public static final double PI = 3.14;
	private String color = "Blue";

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double calculatePerimeter();

}

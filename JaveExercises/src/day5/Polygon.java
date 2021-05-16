package day5;

public class Polygon {

	// Attributes

	// To print the sides and color of rectangle
	private int sides;
	private String color;

	

	public Polygon(int sides, String color) {
	
		this.sides = sides;
		this.color = color;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void printSides() {	
		System.out.println(sides);

	}

	public void printColor() {
		System.out.println(color);

	}
	
	
}

package day5;

public class ThreeDimShape extends Polygon {

	int height;

	
	public ThreeDimShape(int sides, String color, int height) {
		super(sides, color);
		this.height = height;
	}


	public void displayHeight() {
		System.out.println("The height is: " + height);
	}

	public String toString() {
		return "ThreeDimShape [height=" + height + ", Color=" + ", sides=" + "]";
	}

}

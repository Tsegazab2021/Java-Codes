package day5;

public class Main {

	public static void main(String[] args) {

		Polygon rectangle = new Polygon(4, "Blue");
		rectangle.printSides();
		rectangle.printColor();

		Polygon triangle = new Polygon(3, "Black");
		triangle.printSides();
		triangle.printColor();

		Polygon polygon = new Polygon(5, "Yellow");
		polygon.printSides();
		polygon.printColor();
		
		ThreeDimShape rectanDim = new ThreeDimShape(2, "Green", 18);
		rectanDim.printSides();
		rectanDim.printColor();
		rectanDim.displayHeight();
		
	
	

}
}

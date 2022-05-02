package Assign06;

public class Triangle extends Shape {
	
	public Triangle() {
	}

	public Triangle(double length, double height) {
		super(length, height);
	}
	
	@Override
	public void CalculateArea() {
		double shape_length = super.get_length();
		double shape_height = super.get_height();
		System.out.format("Triangle area:%.1f\n", (shape_length * shape_height)/2);
	}
	
}

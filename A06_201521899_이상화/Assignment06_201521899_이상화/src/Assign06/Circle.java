package Assign06;

public class Circle extends Shape {

	private double radius;
	
	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void CalculateArea() {
		double area = radius*radius*Math.PI;
		System.out.println("Circle area:" + area + "\n");
	}
	
}

package Assign06;

public class Shape {
	protected double length;
	protected double height;
	
	public Shape() {
	}
	
	public Shape(double length, double height) {
		this.length = length;
		this.height = height;
	}
	
	public void set_lenght(double length) {
		this.length = length;
	}
	
	public double get_length() {
		return length;
	}
	
	public void set_height(double height) {
		this.height = height;
	}
	
	public double get_height() {
		return height;
	}
	
	public void CalculateArea() {
		System.out.println("잘못된 명령");
	}
}

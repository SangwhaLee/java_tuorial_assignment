package Assign06;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double length=0, height=0, radius=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a length:");
		length = sc.nextDouble();
		System.out.print("Enter a height:");
		height = sc.nextDouble();
		System.out.print("Enter a radius:");
		radius = sc.nextDouble();
		
		Shape triangle = new Triangle(length, height);
		Shape rectangle = new Rectangle(length, height);
		Shape circle = new Circle(radius);
		triangle.CalculateArea();
		rectangle.CalculateArea();
		circle.CalculateArea();
		
		sc.close();
		
	}

}

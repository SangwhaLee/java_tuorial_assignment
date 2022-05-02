package Assign04_1;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter a width");
		int width = s.nextInt();
		rec.width_get(width);
		System.out.println("Enter a height");
		int height = s.nextInt();
		rec.height_get(height);
		
		int area = rec.area(width, height);
		double diag = rec.diagnol(width, height);
		
		System.out.println("Rectangle's info");
		System.out.format("Width: %d\n", rec.width_set());
		System.out.format("Height: %d\n", rec.height_set());
		System.out.format("Area: %d\n", area);
		System.out.format("Diagonal: %.1f\n", diag);
	}

}

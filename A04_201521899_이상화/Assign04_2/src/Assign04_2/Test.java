package Assign04_2;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println("Enter the Car1's model");
		car1.model_get(s.next());
		System.out.println("Enter the Car1's year");
		car1.year_get(s.nextInt());
		System.out.println("Enter the Car1's price");
		car1.price_get(s.nextDouble());
		System.out.println("Enter the Car2's model");
		car2.model_get(s.next());
		System.out.println("Enter the Car2's year");
		car2.year_get(s.nextInt());
		System.out.println("Enter the Car2's price");
		car2.price_get(s.nextDouble());
		System.out.println("=======");
		System.out.println("Car1's info");
		System.out.format("Model:%s\n", car1.model_set());
		System.out.format("Year:%d\n", car1.year_set());
		System.out.format("Price:%.1f\n", car1.price_set());
		System.out.println("Car2's info");
		System.out.format("Model:%s\n", car2.model_set());
		System.out.format("Year:%d\n", car2.year_set());
		System.out.format("Price:%.1f\n", car2.price_set());
		System.out.println("=======");
		if(car1.what_cheap(car1.price_set(), car2.price_set())== car1.price_set())
			System.out.format("Cheaper Car:%s", car1.model_set());	
		else System.out.format("Cheaper Car:%s", car2.model_set());
	}

}

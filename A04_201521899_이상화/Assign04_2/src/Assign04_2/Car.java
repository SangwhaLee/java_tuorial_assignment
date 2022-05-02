package Assign04_2;

public class Car {
	private int year;
	private String model;
	private double price;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void year_get(int year) {
		this.year = year;
	}
	
	public int year_set() {
		return year;
	}
	
	public void model_get(String model) {
		this.model = model;
	}
	
	public String model_set() {
		return model;
	}
	
	public void price_get(double price) {
		this.price = price;
	}
	
	public double price_set(){
		return price;
	}
	
	public double what_cheap(double price1, double price2) {
		if(price1< price2) return price1;
		else  return price2;
	}

}

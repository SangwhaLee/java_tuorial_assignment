package Assign04_1;
import java.util.*;

public class Rectangle {
	private int width;
	private int height;
	public void main(String[] args) {
		
	}
	
	public void width_get(int width) {
		this.width = width;
	}
	
	public int width_set() {
		return width;
	}
	
	public void height_get(int height) {
		this.height = height;
	}
	
	public int height_set() {
		return height;
	}
	
	public int area(int width, int height) {
		return width*height;
	}
	
	public double diagnol(int width, int height) {
		double diag = Math.sqrt(width*width + height*height);
		return diag;
	}
}

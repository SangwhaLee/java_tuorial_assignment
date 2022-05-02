package Assign02_r1;

public class Stack {
	private static final int MAX=16;
	private static int top=0;
	private static int[] s = new int[MAX];
	public static int pop() {
		if(top==0) {
			System.out.println("Empty!");
			System.exit(-1);
		}
		return s[--top];
	}
	
	public static void push(int x) {
		if(top==MAX) {
			System.out.println("Full!");
			System.exit(-1);
		} 
		else {
			s[top++]=x;
			return;
		}
	}
	
	public static void arrprint(int x) {
		System.out.format("%2d", s[x]);
	}
}
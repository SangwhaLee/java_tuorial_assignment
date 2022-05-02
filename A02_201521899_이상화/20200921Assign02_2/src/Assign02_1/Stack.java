package Assign02_1;

public class Stack {
	private static final int MAX=20;
	private static int top=0;
	private static int[] s = new int[MAX];
	public static int pop() {
		if(top==0) {
			return -1;
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
	public static int top() {
		if(top==0) {
			return -1;
		}
		else {
			return s[top-1];
		}
	}
}

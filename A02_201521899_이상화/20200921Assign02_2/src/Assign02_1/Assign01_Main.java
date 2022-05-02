package Assign02_1;

import java.util.*;

public class Assign01_Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i;
		String order;
		int popn;
		int pushn;
		
		for(i=0;i<num;i++) {
			order = sc.next();
			if(order.equals("pop")) {
				popn = Stack.pop();
				System.out.println(popn);
			}
			else if(order.equals("push")) {
				pushn = sc.nextInt();
				Stack.push(pushn);
			}
			else {
				popn = Stack.top();
				System.out.println(popn);
			}
		}
	}
}

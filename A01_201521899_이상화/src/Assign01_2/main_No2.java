package Assign01_2;

import java.util.Scanner;

public class main_No2 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Pleae enter the number between 1 and 100.");
		int num = s.nextInt();
		String star = "*";
		int i,j;
		
		for(i=1;i<=num;i++) {
			for(j=0;j<i;j++) {
				System.out.print(star);
			}
			System.out.print("\n");
		}
		
		s.close();
		
	}
}

package Assign01;

import java.util.Scanner;

public class No1_main {
	public static int fibonacci(int n) {
		if(n ==0 || n==1)  return n;
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		int[] fiboarr = new int[100];
		double average =0;
		int num = 0;
		
		for(int i=0;i<=n;i++) {
			fiboarr[i] = fibonacci(i);
		}
		
		for(int element : fiboarr) {
			sum += element;
		}
		
		if(n==0) average=0;
		else if(n==1) average=1;
		else {
			average = sum/n;
		}
		
		String cond;
		cond = sc.next();
		int sum2=0;
		double average2=0;
		int cnt=0;
		
		switch(cond)
		{
		case "���":
			num = sc.nextInt();
			for(int i=1;i<=n;i++) {
				if(fiboarr[i]%num==0) {
					sum2 += fiboarr[i];
					cnt++;
				}
			}
			break;
			
		case "���":
			num = sc.nextInt();
			for(int i=1; i<=n;i++) {
				if(num%fiboarr[i]==0) {
					sum2 += fiboarr[i];
					cnt++;
				}
			}
			break;
			
		case "¦��":
			for(int i=1;i<=n;i++) {
				if(fiboarr[i] % 2 ==0) {
					sum2 += fiboarr[i];
					cnt++;
				}
			}
			break;
			
		case "Ȧ��":
			for(int i=1;i<=n;i++) {
				if(fiboarr[i]%2 !=0) {
					sum2 += fiboarr[i];
					cnt++;
				}
			}
			break;
			
		default:
			cnt=1;
			break;
		}
		
		average2 = sum2/cnt;
		
		if(sum>sum2) System.out.printf("1���� 2���� ���� �� �� ū ���� 1������ %d�̴�.\n", sum);
		else if(sum<sum2) System.out.printf("1���� 2���� ���� �� �� ū ���� 2������ %d�̴�.\n", sum2);
		else System.out.printf("1���� 2���� ������ %d���� ����.\n", sum);
		
		if(average>average2) System.out.printf("1���� 2���� ��հ� �� �� ū ���� 1������ %,2f�̴�.\n", average);
		else if(average<average2) System.out.printf("1���� 2���� ��հ� �� �� ū  ���� 2������ %.2f�̴�.\n", average2);
		else System.out.printf("1���� 2���� ��հ��� %.2f���� ����.\n", average);
		
		sc.close();
	}
}

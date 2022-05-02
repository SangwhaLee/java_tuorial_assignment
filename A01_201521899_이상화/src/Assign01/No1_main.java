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
		case "배수":
			num = sc.nextInt();
			for(int i=1;i<=n;i++) {
				if(fiboarr[i]%num==0) {
					sum2 += fiboarr[i];
					cnt++;
				}
			}
			break;
			
		case "약수":
			num = sc.nextInt();
			for(int i=1; i<=n;i++) {
				if(num%fiboarr[i]==0) {
					sum2 += fiboarr[i];
					cnt++;
				}
			}
			break;
			
		case "짝수":
			for(int i=1;i<=n;i++) {
				if(fiboarr[i] % 2 ==0) {
					sum2 += fiboarr[i];
					cnt++;
				}
			}
			break;
			
		case "홀수":
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
		
		if(sum>sum2) System.out.printf("1번과 2번의 총합 중 더 큰 것은 1번으로 %d이다.\n", sum);
		else if(sum<sum2) System.out.printf("1번과 2번의 총합 중 더 큰 것은 2번으로 %d이다.\n", sum2);
		else System.out.printf("1번과 2번의 총합은 %d으로 같다.\n", sum);
		
		if(average>average2) System.out.printf("1번과 2번의 평균값 중 더 큰 것은 1번으로 %,2f이다.\n", average);
		else if(average<average2) System.out.printf("1번과 2번의 평균값 중 더 큰  것은 2번으로 %.2f이다.\n", average2);
		else System.out.printf("1번과 2번의 평균값은 %.2f으로 같다.\n", average);
		
		sc.close();
	}
}

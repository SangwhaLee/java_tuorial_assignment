package Assign02_r1;

import java.util.*;

public class Assign02_r1_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=0,j=0;
		int pushn;
		int inum,jnum;
		int check2;
		int change;
		int[] temp = new int[16];
		
		
		System.out.println("행렬을 입력해 주십시오:");
		for(i=0;i<16;i++) {
			pushn = sc.nextInt();
			Stack.push(pushn);
		}
		
		System.out.println("아래는 당신이 입력한 행렬입니다");
		System.out.println("+--+--+--+--+");
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.print("|");
				Stack.arrprint(j+i*4);
				if(j==3) System.out.print("|\n");
			}
			System.out.print("+--+--+--+--+\n");
		}
		
		System.out.print("바꾸고 싶은 원소가 존재한다면 1 아니면  2를 입력 하십시오:");
		int check = sc.nextInt();
		while(check==1) {
			j=0;
			for(i=0;i<16;i++) temp[i]=0;
			System.out.println("행렬에서 바꾸고 싶은 원소의 행의 위치 i를 입력하세요:");
			inum = sc.nextInt();
			System.out.println("행렬에서 바꾸고 싶은 원소의 열의 위치 j를 입력하세요:");
			jnum = sc.nextInt();
			System.out.print("선택하신 원소:");
			Stack.arrprint((inum-1)*4+(jnum-1));
			System.out.print("\n");
			System.out.println("맞으면 1을 입력하고, 다시 입력하고 싶은면 2를 입력하세요:");
			check2 = sc.nextInt();
			if(check2==2) continue;
			System.out.print("바꾸고 싶은 원소를 입력하세요:");
			change = sc.nextInt();
			for(i=15;i>=(inum-1)*4+(jnum-1);i--) {
				temp[j]= Stack.pop();
				j++;
			}
			temp[j-1]= change;
			for(i=j-1;i>=0;i--) {
				Stack.push(temp[i]);
			}
			System.out.println("아래는 바뀐 행렬의 모습입니다.");
			System.out.println("+--+--+--+--+");
			for(i=0;i<4;i++) {
				for(j=0;j<4;j++) {
					System.out.print("|");
					Stack.arrprint(j+i*4);
					if(j==3) System.out.print("|\n");
				}
				System.out.print("+--+--+--+--+\n");
			}
			System.out.print("더 바꾸고 싶으시면 1을, 종료하고 싶으시면 2를 입력하세요:");
			check = sc.nextInt();
		}
		System.out.println("프로그램이 종료 되었습니다.");
		sc.close();
	}
}

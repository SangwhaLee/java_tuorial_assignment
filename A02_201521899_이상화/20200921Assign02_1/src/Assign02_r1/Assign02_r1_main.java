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
		
		
		System.out.println("����� �Է��� �ֽʽÿ�:");
		for(i=0;i<16;i++) {
			pushn = sc.nextInt();
			Stack.push(pushn);
		}
		
		System.out.println("�Ʒ��� ����� �Է��� ����Դϴ�");
		System.out.println("+--+--+--+--+");
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.print("|");
				Stack.arrprint(j+i*4);
				if(j==3) System.out.print("|\n");
			}
			System.out.print("+--+--+--+--+\n");
		}
		
		System.out.print("�ٲٰ� ���� ���Ұ� �����Ѵٸ� 1 �ƴϸ�  2�� �Է� �Ͻʽÿ�:");
		int check = sc.nextInt();
		while(check==1) {
			j=0;
			for(i=0;i<16;i++) temp[i]=0;
			System.out.println("��Ŀ��� �ٲٰ� ���� ������ ���� ��ġ i�� �Է��ϼ���:");
			inum = sc.nextInt();
			System.out.println("��Ŀ��� �ٲٰ� ���� ������ ���� ��ġ j�� �Է��ϼ���:");
			jnum = sc.nextInt();
			System.out.print("�����Ͻ� ����:");
			Stack.arrprint((inum-1)*4+(jnum-1));
			System.out.print("\n");
			System.out.println("������ 1�� �Է��ϰ�, �ٽ� �Է��ϰ� ������ 2�� �Է��ϼ���:");
			check2 = sc.nextInt();
			if(check2==2) continue;
			System.out.print("�ٲٰ� ���� ���Ҹ� �Է��ϼ���:");
			change = sc.nextInt();
			for(i=15;i>=(inum-1)*4+(jnum-1);i--) {
				temp[j]= Stack.pop();
				j++;
			}
			temp[j-1]= change;
			for(i=j-1;i>=0;i--) {
				Stack.push(temp[i]);
			}
			System.out.println("�Ʒ��� �ٲ� ����� ����Դϴ�.");
			System.out.println("+--+--+--+--+");
			for(i=0;i<4;i++) {
				for(j=0;j<4;j++) {
					System.out.print("|");
					Stack.arrprint(j+i*4);
					if(j==3) System.out.print("|\n");
				}
				System.out.print("+--+--+--+--+\n");
			}
			System.out.print("�� �ٲٰ� �����ø� 1��, �����ϰ� �����ø� 2�� �Է��ϼ���:");
			check = sc.nextInt();
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		sc.close();
	}
}

package Assign07;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select;
		String name;
		int time;
		Test test = new Test();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ִ�ð��� �Է����ּ���:");
		int maxtime = sc.nextInt();
		PointNum cnt = new Counter(maxtime);
		
		do {
			System.out.print("�������� �ش� �������� �����ð��� �Է����ּ���:");
			name = sc.next();
			time = sc.nextInt();
			cnt.register(name, time);
			System.out.print("�� �Է��Ͻðڽ��ϱ�? 1.Yes 2.No");
			select = sc.nextInt();
		}while(select != 2);
		
		((Counter) cnt).setName();
		cnt.PrintRoute();
		test.TestScore();
		sc.close();
	}

}

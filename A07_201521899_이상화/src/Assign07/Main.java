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
		
		System.out.print("최대시간을 입력해주세요:");
		int maxtime = sc.nextInt();
		PointNum cnt = new Counter(maxtime);
		
		do {
			System.out.print("여행지와 해당 여행지의 도착시간을 입력해주세요:");
			name = sc.next();
			time = sc.nextInt();
			cnt.register(name, time);
			System.out.print("더 입력하시겠습니까? 1.Yes 2.No");
			select = sc.nextInt();
		}while(select != 2);
		
		((Counter) cnt).setName();
		cnt.PrintRoute();
		test.TestScore();
		sc.close();
	}

}

package Assign06_2;
import java.util.*;

public class AlarmTestClass {

	public static void main(String[] args) {
		int select;
		Scanner sc = new Scanner(System.in);
		SensorSystem x = new SensorSystem();
		AlarmListner a = null;
		
		do {
			x.register(a);
			System.out.print("부저를 더 설치하시겠습니까?(1.yes, 2.no)");
			select = sc.nextInt();
		}while(select != 2);
		
		System.out.print("침입할 떄 경보수준은 몇인가요?:");
		int level = sc.nextInt();
		System.out.print("침입할 위치는 어딘가요?:");
		String place = sc.next();
		x.giveAlarm(level, place);
		

	}

}

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
			System.out.print("������ �� ��ġ�Ͻðڽ��ϱ�?(1.yes, 2.no)");
			select = sc.nextInt();
		}while(select != 2);
		
		System.out.print("ħ���� �� �溸������ ���ΰ���?:");
		int level = sc.nextInt();
		System.out.print("ħ���� ��ġ�� ��򰡿�?:");
		String place = sc.next();
		x.giveAlarm(level, place);
		

	}

}

package Assign06_2;

import java.util.*;

public class SensorSystem {
	private int level;
	private String place;
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<AlarmListner> list = new ArrayList<AlarmListner>();
	
	public void register(AlarmListner a) {
		System.out.print("��ġ�� ������ �溸 ������ �����ϼ���:");
		int r_level = sc.nextInt();
		System.out.print("���ο� ������ ��� ��ġ�մϱ�?:");
		String r_place = sc.next();
		for(AlarmListner i : list) {
			if(r_place.equals(i.get_place())) {
				System.out.println("�ش� ��ġ���� �̹� ������ ��ġ�Ǿ��ֽ��ϴ�.");
				return;
			}
		}
		a = new Buzzer(r_level, r_place);
		list.add(a);
	}
	
	public void notifyAllDevices() {
		for(AlarmListner i : list) {
			i.alarm(this);
		}
	}
	
	public void giveAlarm(int level, String place) {
		this.level = level;
		this.place = place;
		notifyAllDevices();
	}
	
	public int get_level() {
		return level;
	}
	
	public String get_place() {
		return place;
	}
}

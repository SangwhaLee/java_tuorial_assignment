package Assign06_2;

public class Buzzer implements AlarmListner {
	
	private int level;
	private String place;

	public Buzzer(int level, String place) {
		this.level = level;
		this.place = place;
	}
	
	@Override
	public void alarm(SensorSystem x) {
		int come_level = x.get_level();
		String come_place = x.get_place();
		if(level>= come_level) {
			System.out.println(level + "������ �溸�� "+ come_place + "���� �߻��Ͽ����ϴ�."+ place +" ������ �۵��մϴ�.");
		}
	}
	
	public String get_place() {
		return place;
	}

}

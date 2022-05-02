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
			System.out.println(level + "레벨의 경보가 "+ come_place + "에서 발생하였습니다."+ place +" 버저를 작동합니다.");
		}
	}
	
	public String get_place() {
		return place;
	}

}

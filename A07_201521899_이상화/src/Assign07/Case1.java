package Assign07;
/**
 * TestCase�� ������ �Է��ϱ� ���� ù��° Case
 * @author �̻�ȭ
 */

public class Case1 extends TestCase {
	private int maxtime=10;
	TravelPoint[] list = new TravelPoint[4];
	int Score=0;
	
	@Override
	public int Correct_answer() {
		// TODO Auto-generated method stub
		int i;
		String name;
		int time;
		this.register();
		Counter x = new Counter(maxtime);
		for(i=0;i<4;i++) {
			name = list[i].getName();
			time = list[i].getTime();
			x.register(name, time);
		}
		if(x.count()==2)
			Score += 20;
		return Score;
	}

	@Override
	void register() {
		// TODO Auto-generated method stub
		list[0] = new TravelPoint(0,"���ѹα�");
		list[1] = new TravelPoint(12,"�̱�");
		list[2]= new TravelPoint(3,"�Ϻ����ص�");
		list[3] = new TravelPoint(5,"����");
	}

}

package Assign07;
/**
 * TestCase�� ������ �Է��ϱ� ���� ����° Case
 * @author �̻�ȭ
 */

public class Case3 extends TestCase {
	private int maxtime=10;
	TravelPoint[] list = new TravelPoint[9];
	int Score=0;
	
	@Override
	public int Correct_answer() {
		// TODO Auto-generated method stub
		int i;
		String name;
		int time;
		this.register();
		Counter x = new Counter(maxtime);
		for(i=0;i<9;i++) {
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
		list[0]=new TravelPoint(0,"���ѹα�����");
		list[1] = new TravelPoint(12,"�̱��������ý���");
		list[2] = new TravelPoint(19,"�̱���Ʈ����Ʈ");
		list[3] = new TravelPoint(24,"�̱��÷θ���");
		list[4] = new TravelPoint(17,"ĳ����");
		list[5] = new TravelPoint(6,"����");
		list[6] = new TravelPoint(4,"�˺�����");
		list[7] = new TravelPoint(6,"���ѹα��λ�");
		list[8] = new TravelPoint(2,"���ѹα�����");
	}

}

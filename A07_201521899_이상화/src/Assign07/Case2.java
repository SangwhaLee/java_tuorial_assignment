package Assign07;
/**
 * TestCase를 문제를 입력하기 위한 두번째 Case
 * @author 이상화
 */

public class Case2 extends TestCase {
	private int maxtime=10;
	TravelPoint[] list = new TravelPoint[9];
	int Score=0;
	
	@Override
	public int Correct_answer() {
		/**
		 * @return 입력해놓은 배열을 Counter 객체를 통해 최대 경유지 개수를
		 * 구하고 난 뒤 그 개수가 미리 구해놓은 값과 동일할 경우 20점을 출력
		 */
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
		if(x.count()==3)
			Score += 20;
		return Score;
	}

	@Override
	void register() {
		/**
		 * Case에 맞는 경유지를 먼저 배열에 직접입력해 놓기 위한 메소드
		 */
		// TODO Auto-generated method stub
		list[0]=new TravelPoint(0,"대한민국수원");
		list[1] = new TravelPoint(12,"미국샌프란시스코");
		list[2] = new TravelPoint(19,"미국디트로이트");
		list[3] = new TravelPoint(24,"미국플로리다");
		list[4] = new TravelPoint(17,"캐나다");
		list[5] = new TravelPoint(6,"몽골");
		list[6] = new TravelPoint(4,"알본동경");
		list[7] = new TravelPoint(5,"대한민국부산");
		list[8] = new TravelPoint(1,"대한민국제주");
	}

}

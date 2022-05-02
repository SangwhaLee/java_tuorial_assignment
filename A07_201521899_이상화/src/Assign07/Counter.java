package Assign07;
import java.util.*;
/**
 * {@code Counter}는 interface인 PointNum을 상속받는다. 해당 클래스는
 * 여행의 각 경유지의 등록과 여행 경로와 시간내에 갈 수 있는 최대 경유지를 계산하기 위한
 * 객체이다. 클래스 필드로는 여행할 수 있는 최대시간과 출발지의 이름을 둔다. 생성자에는 매개변수로서
 * 최대시간을 입력받는다. 
 * @author 이상화
 *
 */

public class Counter implements PointNum {
	private int maxTime;
	private String startName;
	Scanner sc = new Scanner(System.in);
	ArrayList<TravelPoint> list = new ArrayList<TravelPoint>();
	public Counter(int maxTime) {
		this.maxTime = maxTime;
	}
	
	@Override
	public void register(String name, int time) {
		/**
		 * @param int, String 문자열로 이름과 정수인 시간을 입력받는다.입력받은 이름과 시간은 TravelPoint
		 * 의 생성자를 통해 새로운 객체를 생성하여 TravelPoint 배열에 추가한다.
		 */
		TravelPoint x = new TravelPoint(time, name);
		list.add(x);
	}

	@Override
	public int count() {
		/**
		 * 매우 큰 정수값을 기준으로 정해놓고 여행의 경유지를 저장한 배열에서 가장 작은값
		 * 부터 차례대로 확인한다. 만약 확인되는 값을 더했을때 최대시간보다 크지 않다면
		 * 값을 더하고 해당 객체의 경유유무를 TRUE로 바꾼다. 
		 * @return 리턴값은 최대시간 내에 갈수 있는 최대 경유지의 개수다.
		 */
		int cnt=0;
		int min, max=0;
		int sum=list.get(0).getTime();
		int i;
		int index=0;
		max = 10000;
		while(sum<=maxTime) {
			min = max;
			for(i=1;i<list.size();i++) {
				if(list.get(i).getTime()<min && list.get(i).isCheck()==false) {
					min = list.get(i).getTime();
					index = i;
				}
			}
			list.get(index).setCheck(true);
			if(sum+min>maxTime) break;
			cnt++;
			sum += min;
		}
		return cnt;
	}

	@Override
	public void PrintRoute() {
		/**
		 * TravelPoint 배열을 처음부터 확인하면서 경유유무가 체크 되어있는
		 * 객체만을 확인해 차례대로 출력한다.
		 */
		int cnt = this.count();
		System.out.print("여행 루트는 "+startName+ " -> ");
		for(int i=1;i<list.size();i++) {
			if(list.get(i).isCheck()==true)
				System.out.format("%s -> ", list.get(i).getName());
		}
		System.out.print(startName + "입니다. 주어진 "+ maxTime+ "시간 이내에 방문이 가능한 국가(도시)는 최대"+ cnt+ "개 입니다.\n");
	}
	
	public void setName() {
		/**
		 * private 접근자인 출발지 이름을 입력하기 위한 함수
		 */
		startName = list.get(0).getName();
	}
}

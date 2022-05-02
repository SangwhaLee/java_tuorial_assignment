package Assign07;
/**
 * 이 {@code TravelPoint} 객체는 한번 여행을 떠날때 거쳐가는 경유지와 
 * 도착까지 걸리는 시간을 저장하기 위한 클래스이다. 클래스의 필드로는 경유지의 이름과
 * 시간, 그리고 경유 했는지 안했는지를 확인하기 위한 체크 값 세가지를 필드로 가지고 있다.
 * @author 이상화
 *
 */

public class TravelPoint {
	private int time;
	private String name;
	private boolean check=false;
	public TravelPoint(int time, String name) {
		this.time = time;
		this.name = name;
	}
	public String getName() {
		/**
		 * private 접근자인 이름을 리턴하기 위한 함수
		 */
		return name;
	}
	public int getTime() {
		/**
		 * private 접근자인 시간을 리턴하기 위한 함수
		 */
		return time;
	}
	public boolean isCheck() {
		/**
		 * private 접근자인 체크를 수정하기 위한 함수
		 */
		return check;
	}
	public void setCheck(boolean check) {
		/**
		 * private 접근자인 체크를 리턴하기 위한 함수
		 */
		this.check = check;
	}
}

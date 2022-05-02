package Assign07;
/**
 * 경유지를 등록하고 경유하는 경유지의 개수를 구하기 위한 메소드를 정의해놓은 interface
 * @author 이상화
 *
 */

public interface PointNum {
	public int count();
	public void register(String name, int time);
	public void PrintRoute();
}

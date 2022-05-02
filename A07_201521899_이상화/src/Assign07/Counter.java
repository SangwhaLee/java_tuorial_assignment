package Assign07;
import java.util.*;
/**
 * {@code Counter}�� interface�� PointNum�� ��ӹ޴´�. �ش� Ŭ������
 * ������ �� �������� ��ϰ� ���� ��ο� �ð����� �� �� �ִ� �ִ� �������� ����ϱ� ����
 * ��ü�̴�. Ŭ���� �ʵ�δ� ������ �� �ִ� �ִ�ð��� ������� �̸��� �д�. �����ڿ��� �Ű������μ�
 * �ִ�ð��� �Է¹޴´�. 
 * @author �̻�ȭ
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
		 * @param int, String ���ڿ��� �̸��� ������ �ð��� �Է¹޴´�.�Է¹��� �̸��� �ð��� TravelPoint
		 * �� �����ڸ� ���� ���ο� ��ü�� �����Ͽ� TravelPoint �迭�� �߰��Ѵ�.
		 */
		TravelPoint x = new TravelPoint(time, name);
		list.add(x);
	}

	@Override
	public int count() {
		/**
		 * �ſ� ū �������� �������� ���س��� ������ �������� ������ �迭���� ���� ������
		 * ���� ���ʴ�� Ȯ���Ѵ�. ���� Ȯ�εǴ� ���� �������� �ִ�ð����� ũ�� �ʴٸ�
		 * ���� ���ϰ� �ش� ��ü�� ���������� TRUE�� �ٲ۴�. 
		 * @return ���ϰ��� �ִ�ð� ���� ���� �ִ� �ִ� �������� ������.
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
		 * TravelPoint �迭�� ó������ Ȯ���ϸ鼭 ���������� üũ �Ǿ��ִ�
		 * ��ü���� Ȯ���� ���ʴ�� ����Ѵ�.
		 */
		int cnt = this.count();
		System.out.print("���� ��Ʈ�� "+startName+ " -> ");
		for(int i=1;i<list.size();i++) {
			if(list.get(i).isCheck()==true)
				System.out.format("%s -> ", list.get(i).getName());
		}
		System.out.print(startName + "�Դϴ�. �־��� "+ maxTime+ "�ð� �̳��� �湮�� ������ ����(����)�� �ִ�"+ cnt+ "�� �Դϴ�.\n");
	}
	
	public void setName() {
		/**
		 * private �������� ����� �̸��� �Է��ϱ� ���� �Լ�
		 */
		startName = list.get(0).getName();
	}
}

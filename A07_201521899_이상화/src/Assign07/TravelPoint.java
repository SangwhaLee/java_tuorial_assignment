package Assign07;
/**
 * �� {@code TravelPoint} ��ü�� �ѹ� ������ ������ ���İ��� �������� 
 * �������� �ɸ��� �ð��� �����ϱ� ���� Ŭ�����̴�. Ŭ������ �ʵ�δ� �������� �̸���
 * �ð�, �׸��� ���� �ߴ��� ���ߴ����� Ȯ���ϱ� ���� üũ �� �������� �ʵ�� ������ �ִ�.
 * @author �̻�ȭ
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
		 * private �������� �̸��� �����ϱ� ���� �Լ�
		 */
		return name;
	}
	public int getTime() {
		/**
		 * private �������� �ð��� �����ϱ� ���� �Լ�
		 */
		return time;
	}
	public boolean isCheck() {
		/**
		 * private �������� üũ�� �����ϱ� ���� �Լ�
		 */
		return check;
	}
	public void setCheck(boolean check) {
		/**
		 * private �������� üũ�� �����ϱ� ���� �Լ�
		 */
		this.check = check;
	}
}

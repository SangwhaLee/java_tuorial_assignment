package Assign05;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Move now = new Move();//Move Ŭ���� ��ü ����
		int choice=0;
		
		
		
		System.out.println("�̷� �ⱸ ã�� ���α׷��Դϴ�. �̷��� ũ��� ���� 10, ���� 10�Դϴ�.");
		System.out.println("����� A������ ��ǥ�� A(2,1) �Դϴ�. ������ B������ ��ǥ�� B(2,10) �Դϴ�.");
		System.out.println("�̷ο� ���ڽ��ϱ�?(yes,no)");
		String check = s.nextLine();
		while(check.equals("yes")) {//yes�� ���α׷� ���� no�� �ٷ� ����
			System.out.printf("���� ��ġ�� %d, %d �Դϴ�. ü���� %d�Դϴ�.\n", now.y+1, now.x+1, now.health);
			//���ü��� ���ؼ� x,y�� ���� 2���� �迭 ���� ���� ������ ���, ���� �迭 ��ǥ������ 1�߰�.
			if(now.x==9 && now.y==1) {//�ⱸ�� ������ ��� �ٷ� ���α׷� ����
				System.out.print("�ⱸ�Դϴ�.");
				break;
			}
			
			if(now.health ==0) {//ü���� 0�� ������ ��� Ư�� �޴� ���
				System.out.print("���� ü���� 0�Դϴ�. �̵��� �� �����ϴ�.");
				System.out.println("��� �ұ��? (5:�ٽ��ϱ�)");
			}
			else System.out.println("��� �ұ��? (1:���� �̵�, 2:�Ʒ��� �̵�, 3:�·� �̵�, 4:��� �̵�, 5:�ٽ��ϱ�)");
			choice = s.nextInt();
			switch(choice) {//�޴����� ���ÿ� ���� �޶���
			case 1:
				if(!now.health_check())//ü���� 0�̸� �ٽ� ������ ���ư�
					break;
				if(now.up(now.x, now.y)) {
					System.out.println("�̵��Ͽ����ϴ�.");
				}
				break;
				
			case 2:
				if(!now.health_check())
					break;
				if(now.down(now.x, now.y)) {
					System.out.println("�̵��Ͽ����ϴ�.");
				}
				break;
			
			case 3:
				if(!now.health_check())
					break;
				if(now.left(now.x, now.y)) {
					System.out.println("�̵��Ͽ����ϴ�.");
				}
				break;
				
			case 4:
				if(!now.health_check())
					break;
				if(now.right(now.x, now.y)) {
					System.out.println("�̵��Ͽ����ϴ�.");
				}
				break;
				
			case 5:
				System.out.println("�ٽ� �ϰڽ��ϱ�?(yes,no)");//5�� �޴��� ���ý� ��Ȯ��
				String restart = s.next();
				if(restart.equals("yes")) {
					now.reset();//��ǥ�� ���� ü���� ����
					break;
				}
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
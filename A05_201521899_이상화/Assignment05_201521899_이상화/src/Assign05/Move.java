package Assign05;

import java.util.*;

public class Move{
	Scanner sc = new Scanner(System.in);
	Maze mass = new Maze();//MazeŬ������ �̱������� ��ü �������� ȣ��
	
	public int x =0;
	public int y= 1;
	public int health = 30;	
	
	public boolean enter_green() {//�ʷϻ����� �����Ҷ� ����ϴ� method
		System.out.println("���ĭ�Դϴ�. ü���� 2 �����մϴ�. �̵��Ͻðڽ��ϱ�?(yes,no)");
		String check = sc.nextLine();
		if(check.equals("yes"))
			return true;//�ʷϻ� ���Կ� ����
		else return false;//���Կ� �ݴ�
	}
	
	
	public boolean up(int x, int y) {
		int temp = y-1;//�̷� ĭ��θ� ���� �ö󰡴� ������ 2���� �迭 ��ǥ������ ���� �۾���
		if(temp<0) {//�̱� ���� ������ ������
			System.out.println("�̱� ���� �����߽��ϴ�.");
			return false;
		}
		else if(mass.maze[temp][x]==2) {//ȸ������ �����Ϸ� �Ҷ�
			System.out.println("ȸ�� �����δ� �̵��� �� �����ϴ�.");
			return false;
		}
		else if(mass.maze[temp][x]==3){//�ʷϻ� ���� �����Ϸ� �Ҷ�
			boolean ok = enter_green();//������ ������ method ���
			if(ok) {
				this.y--;//2���� �迭�� ��ǥ�� ����
				health= health-2;//�ʷϻ��� ȸ�� 2����
				return true;
			}
			else return false;
		}
		this.y--;
		health--;//�̵��� ü�� 1 ����
		return true;
	}
	
	public boolean down(int x, int y) {
		int temp = y+1;//2���� �迭���� ��ǥ ����
		if(temp>=mass.row) {//�̱��� ���� ������ ������ ���
			System.out.println("�̱� ���� �����߽��ϴ�.");
			return false;
		}
		else if(mass.maze[temp][x]==2) {//ȸ�� ������ �����ϴ� ���
			System.out.println("ȸ�� �����δ� �̵��� �� �����ϴ�.");
			return false;
		}
		else if(mass.maze[temp][x]==3){//�ʷϻ� ������ �����ϴ� ���
			boolean ok = enter_green();
			if(ok) {
				this.y++;
				health= health-2;//ü�� 2����
				return true;
			}
			else return false;
		}
		this.y++;
		health--;//�Ϲ������� ü�� 1����
		return true;
	}
	
	public boolean left(int x, int y) {
		int temp = x-1;//2�����迭�� ��ǥ
		if(temp<0) {
			if(mass.maze[y][x]==4) {//�Ա��� ������ �ִ� ����� ��� ������ �������θ� ����
				System.out.println("�Ա��Դϴ�.�̵��� �� �����ϴ�.");
				return false;
			}
			System.out.println("�̱� ���� �����߽��ϴ�.");
			return false;
		}
		else if(mass.maze[y][temp]==2) {
			System.out.println("ȸ�� �����δ� �̵��� �� �����ϴ�.");
			return false;
		}
		else if(mass.maze[y][temp]==3){
			boolean ok = enter_green();
			if(ok) {
				this.x--;
				health = health-2;
				return true;
			}
			else return false;
		}
		this.x--;
		health--;
		return true;
	}
	
	public boolean right(int x, int y) {
		int temp = x+1;
		if(temp>=mass.col) {
			System.out.println("�̱� ���� �����߽��ϴ�.");
			return false;
		}
		else if(mass.maze[y][temp]==2) {
			System.out.println("ȸ�� �����δ� �̵��� �� �����ϴ�.");
			return false;
		}
		else if(mass.maze[y][temp]==3){
			boolean ok = enter_green();
			if(ok) {
				this.x++;
				health= health-2;
				return true;
			}
			else return false;
		}
		this.x++;
		health--;
		return true;
	}
	
	public void reset() {//�ٽ��ϱ⸦ ������� ȣ���� method
		x = 0;
		y = 1;
		health = 30;
	}	
	
	public boolean health_check() {//���� ü���� 0�̸� ��������
		if(health==0) {
			return false;
		}
		return true;
	}
}

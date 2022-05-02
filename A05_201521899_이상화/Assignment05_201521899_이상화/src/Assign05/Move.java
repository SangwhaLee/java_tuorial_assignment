package Assign05;

import java.util.*;

public class Move{
	Scanner sc = new Scanner(System.in);
	Maze mass = new Maze();//Maze클래스의 미궁정보를 객체 생성으로 호출
	
	public int x =0;
	public int y= 1;
	public int health = 30;	
	
	public boolean enter_green() {//초록색블럭에 진입할때 사용하는 method
		System.out.println("녹색칸입니다. 체력이 2 감소합니다. 이동하시겠습니까?(yes,no)");
		String check = sc.nextLine();
		if(check.equals("yes"))
			return true;//초록색 진입에 찬성
		else return false;//진입에 반대
	}
	
	
	public boolean up(int x, int y) {
		int temp = y-1;//미로 칸대로면 위로 올라가는 거지만 2차원 배열 좌표상으론 수가 작아짐
		if(temp<0) {//미궁 범위 밖으로 나갈때
			System.out.println("미궁 끝에 도달했습니다.");
			return false;
		}
		else if(mass.maze[temp][x]==2) {//회색벽에 진입하려 할때
			System.out.println("회색 벽돌로는 이동할 수 없습니다.");
			return false;
		}
		else if(mass.maze[temp][x]==3){//초록색 블럭에 진입하려 할때
			boolean ok = enter_green();//위에서 선언한 method 사용
			if(ok) {
				this.y--;//2차원 배열의 좌표상 수정
				health= health-2;//초록색은 회복 2감소
				return true;
			}
			else return false;
		}
		this.y--;
		health--;//이동시 체력 1 감소
		return true;
	}
	
	public boolean down(int x, int y) {
		int temp = y+1;//2차원 배열상의 좌표 증가
		if(temp>=mass.row) {//미궁의 범위 밖으로 나가는 경우
			System.out.println("미궁 끝에 도달했습니다.");
			return false;
		}
		else if(mass.maze[temp][x]==2) {//회색 벽으로 진입하는 경우
			System.out.println("회색 벽돌로는 이동할 수 없습니다.");
			return false;
		}
		else if(mass.maze[temp][x]==3){//초록색 벽으로 진입하는 경우
			boolean ok = enter_green();
			if(ok) {
				this.y++;
				health= health-2;//체력 2감소
				return true;
			}
			else return false;
		}
		this.y++;
		health--;//일반적으로 체력 1감소
		return true;
	}
	
	public boolean left(int x, int y) {
		int temp = x-1;//2차원배열상 좌표
		if(temp<0) {
			if(mass.maze[y][x]==4) {//입구로 나갈수 있는 방법은 출발 블럭에서 왼쪽으로만 가능
				System.out.println("입구입니다.이동할 수 없습니다.");
				return false;
			}
			System.out.println("미궁 끝에 도달했습니다.");
			return false;
		}
		else if(mass.maze[y][temp]==2) {
			System.out.println("회색 벽돌로는 이동할 수 없습니다.");
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
			System.out.println("미궁 끝에 도달했습니다.");
			return false;
		}
		else if(mass.maze[y][temp]==2) {
			System.out.println("회색 벽돌로는 이동할 수 없습니다.");
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
	
	public void reset() {//다시하기를 골랐을때 호출할 method
		x = 0;
		y = 1;
		health = 30;
	}	
	
	public boolean health_check() {//현재 체력이 0이면 부정리턴
		if(health==0) {
			return false;
		}
		return true;
	}
}

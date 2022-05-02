package Assign05;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Move now = new Move();//Move 클래스 객체 생성
		int choice=0;
		
		
		
		System.out.println("미로 출구 찾기 프로그램입니다. 미로의 크기는 가로 10, 세로 10입니다.");
		System.out.println("출발지 A지점의 좌표는 A(2,1) 입니다. 도착지 B지점의 좌표는 B(2,10) 입니다.");
		System.out.println("미로에 들어가겠습니까?(yes,no)");
		String check = s.nextLine();
		while(check.equals("yes")) {//yes면 프로그램 실해 no면 바로 종료
			System.out.printf("현재 위치는 %d, %d 입니다. 체력은 %d입니다.\n", now.y+1, now.x+1, now.health);
			//가시성을 위해서 x,y의 값을 2차원 배열 값과 같은 순서로 출력, 원래 배열 좌표값에서 1추가.
			if(now.x==9 && now.y==1) {//출구에 도착한 경우 바로 프로그램 종료
				System.out.print("출구입니다.");
				break;
			}
			
			if(now.health ==0) {//체력이 0에 도달한 경우 특정 메뉴 출력
				System.out.print("현재 체력이 0입니다. 이동할 수 없습니다.");
				System.out.println("어떻게 할까요? (5:다시하기)");
			}
			else System.out.println("어떻게 할까요? (1:위로 이동, 2:아래로 이동, 3:좌로 이동, 4:우로 이동, 5:다시하기)");
			choice = s.nextInt();
			switch(choice) {//메뉴에서 선택에 따라 달라짐
			case 1:
				if(!now.health_check())//체력이 0이면 다시 앞으로 돌아감
					break;
				if(now.up(now.x, now.y)) {
					System.out.println("이동하였습니다.");
				}
				break;
				
			case 2:
				if(!now.health_check())
					break;
				if(now.down(now.x, now.y)) {
					System.out.println("이동하였습니다.");
				}
				break;
			
			case 3:
				if(!now.health_check())
					break;
				if(now.left(now.x, now.y)) {
					System.out.println("이동하였습니다.");
				}
				break;
				
			case 4:
				if(!now.health_check())
					break;
				if(now.right(now.x, now.y)) {
					System.out.println("이동하였습니다.");
				}
				break;
				
			case 5:
				System.out.println("다시 하겠습니까?(yes,no)");//5번 메뉴를 선택시 재확인
				String restart = s.next();
				if(restart.equals("yes")) {
					now.reset();//좌표와 현재 체력을 리셋
					break;
				}
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
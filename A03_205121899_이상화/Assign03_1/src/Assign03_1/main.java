package Assign03_1;
import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice;
		int stc=0;
		int i=0;
		String temp;
		
		Virtual first = new Virtual();
		Virtual[] machine = new Virtual[30];
		
		first.cpu=0;
		first.ram=0;
		first.disk=0;
		first.total =0;
		
		System.out.format("CPU는 몇 개를 설정할까요(현재 %d개 남음)?:", first.cpu);
		first.cpu = s.nextInt();
		System.out.print("\n");
		System.out.format("RAM은 몇 GB를 설정할까요(현재 %dGB 사용가능)?:", first.ram);
		first.ram = s.nextInt();
		System.out.print("\n");
		System.out.format("DISK는 몇 GB를 설정할까요 (현재 %dGB 사용가능)?:", first.disk);
		first.disk = s.nextInt();
		
		do {
			System.out.println(">>가상머신 관리자 화면입니다.");
			System.out.format("현재 CPU %d개, RAM %dGB, DISK %dGB 가 사용가능합니다. 현재 구동 중인 가상머신은 %d개 입니다.\n", first.cpu, first.ram, first.disk, first.total);
			System.out.print("어떤 작업을 진행하시겠습니까? (1.가상머신 생성, 2:가상머신 삭제, 3:가상머신 목록, 4:종료)");
			choice = s.nextInt();
			switch(choice) {
			case 1:
				if(first.cpu==0) {
					System.out.println("할당 가능한 CPU 자원이 없습니다");
					continue;
				}
				else if(first.ram==0) {
					System.out.println("할당 가능한 RAM 자원이 없습니다");
					continue;
				}
				else if(first.disk==0){
					System.out.println("할당 가능한 DISK 자원이 없습니다");
					continue;
				}
				System.out.println("가상머신을 생성합니다.");
				machine[stc] = new Virtual();
				System.out.print("가상머신의 이름은 무엇입니까?:");
				machine[stc].name = s.next();
				System.out.print("\n");
				System.out.format("CPU는 몇 개를 할당할까요?(현재 %d개 남음):",first.cpu);
				machine[stc].cpu = s.nextInt();
				System.out.print("\n");
				System.out.format("RAM은 몇 GB를 할당할까요?(현재 %dGB 사용가능)", first.ram);
				machine[stc].ram= s.nextInt();
				System.out.print("\n");
				System.out.format("DISK는 몇 GB를 할당할까요?(현재 %dGB 사용가능)", first.disk);
				machine[stc].disk= s.nextInt();
				System.out.print("\n");
				System.out.println("가상머신이 생성되었습니다.");
				System.out.println("+-----+-----+-----+-----+\n" + 
						"|Name | CPU | RAM | DISK |\r\n" + 
						"+-----+-----+-----+-----+");
				for(i=0;i<stc+1;i++) {
					System.out.format("| %s | %3d | %3d | %3d |\n", machine[stc].name, machine[stc].cpu, machine[stc].ram, machine[stc].disk);
					System.out.println("+-----+-----+-----+-----+");
				}
				first.cpu = first.cpu - machine[stc].cpu;
				first.ram = first.ram - machine[stc].ram;
				first.disk = first.disk - machine[stc].disk;
				stc++;
				first.total++;
				break;
			
			case 2:
				if(first.total ==0) {
					System.out.println("현재 생성된 가상머신이 없습니다.");
					continue;
				}
				System.out.print("삭제할 가상머신의 이릉은 무엇입니까?:");
				temp = s.next();
				System.out.print("\n");
				for(i=0;i<stc;i++) {
					if(machine[i].name.equals(temp)) {
						System.out.format("가상머신 %s이 삭제되어 자원이 회수되었습니다.\n", machine[i].name);
						first.cpu += machine[i].cpu;
						first.ram += machine[i].ram;
						first.disk += machine[i].disk;
						machine[i].cpu = 0;
						machine[i].ram = 0;
						machine[i].disk = 0;
						machine[i].check =1;
					}
				}
				break;
				
			case 3:
				System.out.println("+-----+-----+-----+-----+\n" + 
						"| Name | CPU | RAM | DISK |\r\n" + 
						"+-----+-----+-----+-----+");
				for(i=0;i<stc;i++) {
					if(machine[i].check ==0) {
					System.out.format("| %s | %3d | %3d | %3d |\n", machine[i].name, machine[i].cpu, machine[i].ram, machine[i].disk);
					System.out.println("+-----+-----+-----+-----+");
					}
				}
				break;
				
			case 4:
				System.out.println("작업을 종료합니다.");
				continue;
			}
		}while(choice!=4);
		
	}
}

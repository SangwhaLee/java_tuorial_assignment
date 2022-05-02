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
		
		System.out.format("CPU�� �� ���� �����ұ��(���� %d�� ����)?:", first.cpu);
		first.cpu = s.nextInt();
		System.out.print("\n");
		System.out.format("RAM�� �� GB�� �����ұ��(���� %dGB ��밡��)?:", first.ram);
		first.ram = s.nextInt();
		System.out.print("\n");
		System.out.format("DISK�� �� GB�� �����ұ�� (���� %dGB ��밡��)?:", first.disk);
		first.disk = s.nextInt();
		
		do {
			System.out.println(">>����ӽ� ������ ȭ���Դϴ�.");
			System.out.format("���� CPU %d��, RAM %dGB, DISK %dGB �� ��밡���մϴ�. ���� ���� ���� ����ӽ��� %d�� �Դϴ�.\n", first.cpu, first.ram, first.disk, first.total);
			System.out.print("� �۾��� �����Ͻðڽ��ϱ�? (1.����ӽ� ����, 2:����ӽ� ����, 3:����ӽ� ���, 4:����)");
			choice = s.nextInt();
			switch(choice) {
			case 1:
				if(first.cpu==0) {
					System.out.println("�Ҵ� ������ CPU �ڿ��� �����ϴ�");
					continue;
				}
				else if(first.ram==0) {
					System.out.println("�Ҵ� ������ RAM �ڿ��� �����ϴ�");
					continue;
				}
				else if(first.disk==0){
					System.out.println("�Ҵ� ������ DISK �ڿ��� �����ϴ�");
					continue;
				}
				System.out.println("����ӽ��� �����մϴ�.");
				machine[stc] = new Virtual();
				System.out.print("����ӽ��� �̸��� �����Դϱ�?:");
				machine[stc].name = s.next();
				System.out.print("\n");
				System.out.format("CPU�� �� ���� �Ҵ��ұ��?(���� %d�� ����):",first.cpu);
				machine[stc].cpu = s.nextInt();
				System.out.print("\n");
				System.out.format("RAM�� �� GB�� �Ҵ��ұ��?(���� %dGB ��밡��)", first.ram);
				machine[stc].ram= s.nextInt();
				System.out.print("\n");
				System.out.format("DISK�� �� GB�� �Ҵ��ұ��?(���� %dGB ��밡��)", first.disk);
				machine[stc].disk= s.nextInt();
				System.out.print("\n");
				System.out.println("����ӽ��� �����Ǿ����ϴ�.");
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
					System.out.println("���� ������ ����ӽ��� �����ϴ�.");
					continue;
				}
				System.out.print("������ ����ӽ��� �̸��� �����Դϱ�?:");
				temp = s.next();
				System.out.print("\n");
				for(i=0;i<stc;i++) {
					if(machine[i].name.equals(temp)) {
						System.out.format("����ӽ� %s�� �����Ǿ� �ڿ��� ȸ���Ǿ����ϴ�.\n", machine[i].name);
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
				System.out.println("�۾��� �����մϴ�.");
				continue;
			}
		}while(choice!=4);
		
	}
}

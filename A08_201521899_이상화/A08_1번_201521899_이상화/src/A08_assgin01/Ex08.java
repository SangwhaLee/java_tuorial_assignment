package A08_assgin01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08 {
	private static String[] movie = new String[5];
	private static String[] movie_type = new String[5];
	private static int[] movie_age = new int[5];
	private static String[] type = { "�׼�", "������", "���", "����" };
	private static int[] age = { 9, 12, 15, 18 };
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] ar) {
	int menu = 0;
	
	for (int i = 0; i < 5; i++) {
		movie[i] = "";
		movie_type[i] = "";
		movie_age[i] = 0;
	}
	
	while (menu != 4) {
		System.out.println("��ȭ�� ���� ���α׷� ");
		System.out.println("1.��ȸ");
		System.out.println("2.��ȭ �߰�");
		System.out.println("3.��ȭ ����");
		System.out.println("4.����");
		System.out.print("�Է� : ");
		try {
		menu = sc.nextInt();
		if (menu == 1) {
			view();
		} else if (menu == 2) {
			insert();
		} else if (menu == 3) {
			delete();
		}
		}
	catch(InputMismatchException e){
		System.out.println("���ڳ� Ư�����ڴ� �Է��Ͻ� �� �����ϴ�.\nȭ�鿡 ���� ���ڸ��� �Է����ֽʽÿ�");
		sc.nextLine();
	}
		}
	}
	public static void view() {
		System.out.println("�󿵰�\t\t ��ȭ ����\t\t ��ȭ �帣\t ��ȭ ���");
		for (int i = 0; i < 10; i++) {
			try {
			if (movie[i] == "") {
				continue;
			}
			else {
				System.out.print(i + 1 + "�� \t\t");
				System.out.print(movie[i] + "\t\t");
				System.out.print(movie_type[i] + "\t");
				System.out.print(movie_age[i] + "\t");
			}
			System.out.println();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			break;
		}
		}
	}
	
	public static void insert() {
		int insert = 0;
		System.out.println("��� �ִ� �󿵰�");
		for (int i = 0; i < 5; i++) {
			if (movie[i] == "")
				System.out.print(i + 1 + " ");
		}
		try {
		System.out.println();
		System.out.print("��ȭ�� �߰��� �󿵰� �Է� : ");
		insert = sc.nextInt();
		if (movie[insert - 1] != "") {
			System.out.println("�ش� �󿵰��� �� ���� ��ȭ�� �ֽ��ϴ�. �ٽ� �۾��� �ּ���");
		} else {
			sc.nextLine();
			System.out.print("��ȭ ���� : ");
			movie[insert - 1] = sc.nextLine();
			System.out.print("��ȭ �帣 (1.�׼�, 2.������, 3.���, 4.����) : ");
			int data = sc.nextInt();
			movie_type[insert - 1] = type[data - 1];
			System.out.print("��ȭ ��� (1.9, 2.12, 3.15, 4.18 ): ");
			data = sc.nextInt();
			movie_age[insert - 1] = age[data - 1];
			System.out.println("����� �Ϸ� �Ǿ����ϴ�.");
		}
		}
		catch(InputMismatchException e) {
			System.out.println("���ڳ� Ư�����ڴ� �Է��ϽǼ� �����ϴ�.\n ȭ�鿡 ��Ÿ�� ���� �߿��� ��� �Է��Ͻʽÿ�");
			sc.nextLine();
		}
		catch( ArrayIndexOutOfBoundsException e) {
			System.out.println("ȭ�鿡 ��Ÿ�� ���� �߿��� ��� �Է��Ͻʽÿ�");
			if(insert>=1 && insert<=5)
				movie[insert-1]="";
		}
	}
	
	public static void delete() {
		int delete = 0;
		System.out.println("������ �󿵰�");
		for (int i = 0; i < 10; i++) {
			try {
			if (movie[i] != "")
				System.out.print(i + 1 + " ");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				break;
			}
		}
		System.out.println();
		System.out.print("��ȭ�� ������ �󿵰� �Է� : ");
		delete = sc.nextInt();
		try {
		if (movie[delete - 1] == "") {
			System.out.println("�ش� �󿵰��� ��� �ֽ��ϴ�.");
		} else {
			movie[delete - 1] = "";
			movie_type[delete - 1] = "";
			movie_age[delete - 1] = 0;
			System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
		}
		}
		catch(InputMismatchException e) {
			System.out.println("���ڳ� Ư�����ڴ� �Է��ϽǼ� �����ϴ�.\nȭ�鿡 ��Ÿ�� ���� �߿��� ��� �Է��Ͻʽÿ�");
			sc.nextLine();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�󿵰� ��ȣ�� ���� ���� �Է����ּ���");
		}
	}

}

package A08_assgin01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08 {
	private static String[] movie = new String[5];
	private static String[] movie_type = new String[5];
	private static int[] movie_age = new int[5];
	private static String[] type = { "액션", "스릴러", "멜로", "공포" };
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
		System.out.println("영화관 관리 프로그램 ");
		System.out.println("1.조회");
		System.out.println("2.영화 추가");
		System.out.println("3.영화 제거");
		System.out.println("4.종료");
		System.out.print("입력 : ");
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
		System.out.println("문자나 특수문자는 입력하실 수 없습니다.\n화면에 나온 숫자만을 입력해주십시오");
		sc.nextLine();
	}
		}
	}
	public static void view() {
		System.out.println("상영관\t\t 영화 제목\t\t 영화 장르\t 영화 등급");
		for (int i = 0; i < 10; i++) {
			try {
			if (movie[i] == "") {
				continue;
			}
			else {
				System.out.print(i + 1 + "관 \t\t");
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
		System.out.println("비어 있는 상영관");
		for (int i = 0; i < 5; i++) {
			if (movie[i] == "")
				System.out.print(i + 1 + " ");
		}
		try {
		System.out.println();
		System.out.print("영화를 추가할 상영관 입력 : ");
		insert = sc.nextInt();
		if (movie[insert - 1] != "") {
			System.out.println("해당 상영관에 상영 중인 영화가 있습니다. 다시 작업해 주세요");
		} else {
			sc.nextLine();
			System.out.print("영화 제목 : ");
			movie[insert - 1] = sc.nextLine();
			System.out.print("영화 장르 (1.액션, 2.스릴러, 3.멜로, 4.공포) : ");
			int data = sc.nextInt();
			movie_type[insert - 1] = type[data - 1];
			System.out.print("영화 등급 (1.9, 2.12, 3.15, 4.18 ): ");
			data = sc.nextInt();
			movie_age[insert - 1] = age[data - 1];
			System.out.println("등록이 완료 되었습니다.");
		}
		}
		catch(InputMismatchException e) {
			System.out.println("문자나 특수문자는 입력하실수 없습니다.\n 화면에 나타난 숫자 중에서 골라 입력하십시오");
			sc.nextLine();
		}
		catch( ArrayIndexOutOfBoundsException e) {
			System.out.println("화면에 나타난 숫자 중에서 골라 입력하십시오");
			if(insert>=1 && insert<=5)
				movie[insert-1]="";
		}
	}
	
	public static void delete() {
		int delete = 0;
		System.out.println("상영중인 상영관");
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
		System.out.print("영화를 제거할 상영관 입력 : ");
		delete = sc.nextInt();
		try {
		if (movie[delete - 1] == "") {
			System.out.println("해당 상영관은 비어 있습니다.");
		} else {
			movie[delete - 1] = "";
			movie_type[delete - 1] = "";
			movie_age[delete - 1] = 0;
			System.out.println("제거 완료 되었습니다.");
		}
		}
		catch(InputMismatchException e) {
			System.out.println("문자나 특수문자는 입력하실수 없습니다.\n화면에 나타난 숫자 중에서 골라 입력하십시오");
			sc.nextLine();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("상영관 번호와 같은 수만 입력해주세요");
		}
	}

}

package Assign03_2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		alpha abc = new alpha();
		
		char op1, op2;
		System.out.println("������ AI ê������ ��ȭ�Դϴ�. AI ê���� �������̰� â�����Դϴ�. ���� �����ϰ� �ſ� ģ���� �µ��� ������ �ֽ��ϴ�."); 
		System.out.println("AIê��: �ȳ��ϼ���, ê���Դϴ�.");
		System.out.println("���: ���� �ð��� �н��� ������ �غ��ڽ��ϴ�.\n");
		while(true) {
		System.out.println("AIê��:��, �E���� ����� ���ĺ� 2���� �Է��� �ּ���.");
		
		op1 = s.next().charAt(0);
		op2 = s.next().charAt(0);
		
		if(abc.which_bigger(op1, op2))
			System.out.format("AIê��: ���� %c�� ���� %d, ���� %c�� ���� %d �Դϴ�. ���� ����� ����̸�, %d �Դϴ�.\nb", op1, (int)op1, op2, (int)op2, abc.what_diff(op1, op2));
		else {
			System.out.format("AIê��: ���� %c�� ���� %d, ���� %c�� ���� %d �Դϴ�. ������ ���׺��� �۽��ϴ�.\n", op1,(int)op1, op2,(int)op2);
			System.out.println("���� ����� ������ �Ǵ� ���� �н����� ���� �����Դϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
			break;
			}
		}
			
	}

}

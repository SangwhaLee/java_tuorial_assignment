package Assign07;
/**
 * 5���� ���̽��� ���� MainŬ�������� �ѹ��� �����ϰ�
 * �� ����� �� �� �ֵ��� ����� ���� TestCase ���� Ŭ����
 * @author �̻�ȭ
 */

public class Test {
	/**
	 * �ټ����� ���̽����� �� ���̽��� ������ �Է��� ����� Counter ��ü��
	 * Count �޼ҵ尡 ���� ���� ���������� ������ �Է¹޾� ������ ���
	 */
	int TotalScore=0;
	
	public void TestScore() {
		Case1 a = new Case1();
		Case2 b = new Case2();
		Case3 c = new Case3();
		Case4 d = new Case4();
		Case5 e = new Case5();
		
		TotalScore += a.Correct_answer();
		TotalScore += b.Correct_answer();
		TotalScore += c.Correct_answer();
		TotalScore += d.Correct_answer();
		TotalScore += e.Correct_answer();
		
		if(TotalScore==100)
			System.out.println("�����մϴ�. �հ��Դϴ�.");
		else
			System.out.format("%d���Դϴ�. ������ �ٽ� ������ �ּ���", TotalScore);
		}
	}

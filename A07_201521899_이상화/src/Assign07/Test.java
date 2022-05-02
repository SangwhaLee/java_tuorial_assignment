package Assign07;
/**
 * 5개의 케이스를 각각 Main클래스에서 한번에 실행하고
 * 그 결과를 알 수 있도록 만들어 놓은 TestCase 실행 클래스
 * @author 이상화
 */

public class Test {
	/**
	 * 다섯개의 케이스에서 각 케이스에 사전에 입력한 결과가 Counter 객체의
	 * Count 메소드가 구한 값과 동일한지를 점수로 입력받아 총점을 출력
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
			System.out.println("축하합니다. 합격입니다.");
		else
			System.out.format("%d점입니다. 다음에 다시 도전해 주세요", TotalScore);
		}
	}

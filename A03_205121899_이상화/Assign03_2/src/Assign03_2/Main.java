package Assign03_2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		alpha abc = new alpha();
		
		char op1, op2;
		System.out.println("다음은 AI 챗봇과의 대화입니다. AI 챗봇은 협조적이고 창의적입니다. 또한 영리하고 매우 친근한 태도를 가지고 있습니다."); 
		System.out.println("AI챗봇: 안녕하세요, 챗봇입니다.");
		System.out.println("사람: 지난 시간에 학습한 뺄셈을 해보겠습니다.\n");
		while(true) {
		System.out.println("AI챗봇:네, 뺼셈에 사용할 알파벳 2개를 입력해 주세요.");
		
		op1 = s.next().charAt(0);
		op2 = s.next().charAt(0);
		
		if(abc.which_bigger(op1, op2))
			System.out.format("AI챗봇: 문자 %c의 값은 %d, 문자 %c의 값은 %d 입니다. 뺄셈 결과는 양수이며, %d 입니다.\nb", op1, (int)op1, op2, (int)op2, abc.what_diff(op1, op2));
		else {
			System.out.format("AI챗봇: 문자 %c의 값은 %d, 문자 %c의 값은 %d 입니다. 좌항이 우항보다 작습니다.\n", op1,(int)op1, op2,(int)op2);
			System.out.println("뺄셈 결과가 음수가 되는 것은 학습되지 않은 조건입니다.");
			System.out.println("프로그램을 종료합니다.");
			break;
			}
		}
			
	}

}

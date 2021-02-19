package day05.ex;

/*
	문제 3 ]
		랜덤하게 두자리 숫자를 하나 발생시켜서
		사용자가 그 숫자를 알아맞추는 게임을 제작하세요.
		만들어진 숫자보다 큰 수를 입력한 경우는 
			- "큰수입니다."
		작은수를 입력한 경우는 
			- "작은 수 입니다."
		가 출력되도록 하고
		정답을 맞출때 까지 반복하도록 하세요.
 */
import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		int no1 = (int)(Math.random()*90 + 10);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("무슨 수게요??? : " );
			int no = sc.nextInt();
			
			if(no > no1) {
				System.out.println("큰 수입니다.");
			} else if(no < no1) {
				System.out.println("작은수입니다.");
			} else if(no == no1) {
				System.out.println("발생한 숫자는 " + no + " 로 정답입니다.");
				break;
			} else {
				System.out.println("잘못입력했습니다.");
			}
		}
	}
}

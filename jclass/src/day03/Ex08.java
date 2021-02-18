package day03;

/*
	문제 8 ]
		알파벳 문자 하나를 입력한 후
		그 문자가 대문자이면 소문자로
		소문자이면 대문자로 변환시켜서 
		출력해주는 프로그램을 작성하세요.
		
	문자를 입력받는 방법]
		1. 문자열을 입력받고
			sc.nextLine(), sc.next()
		2. 문자열의 첫번째 위치의 문자를 뽑아낸다.
			문자열데이터.charAt(0)
			
			참고 ]
				charAt(index)
				==> 문자열의 특정위치의 문자를 반환해주는 함수
				
					예 ]
						String str = "abcd";
						
						세번째 위치의 문자
						char ch = str.charAt(2);
						
						데이터베이스에서는 위치값이 1부터 시작이었지만
						다른 모든 언어에서는 위치값의 시작이 0부터 시작한다.
				
 */
import java.util.*;
public class Ex08 {
	public static void main(String[] args) {
//		char ch = (char)(Math.random() * 256);
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력받고
		System.out.print("문자 입력 : ");
		String str = sc.nextLine();
		// 문자로 변환하고
		char ch = str.charAt(0);
		char ch1 = 0;
		// 비교하고
		/* if ~ else 해결방법
		if(ch <= 'Z') {
			// 이 경우는 대문자인 경우
			// 이 경우는 소문자로 변환시켜야 하고
			// 변환시키는 방법은
			// 	(char)(문자 + ('a' - 'A'))
			ch1 = (char)(ch + ('a' - 'A'));
		} else {
			// 소문자인 경우 대소문자의 차만큼 빼주면 된다.
			ch1 = (char)(ch -('a' - 'A'));
		}
		 */
		
		/* 3항연산자로 해결하는 방법
		*/
		
		ch1 = (ch <= 'Z') ? (char)(ch + ('a' - 'A')) : (char)(ch - ('a' - 'A'));
		
		// 결과 출력하고
		System.out.println("입력한 문자 : " + ch);
		System.out.println("변환한 문자 : " + ch1);
	}
}

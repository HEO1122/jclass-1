package day05.ex;

/*
	문제 4 ]
		다섯자리 숫자를 입력받아서
		입력받은 숫자가 회문수인지 아닌지를
		판별해주는 프로그램을 제작하세요.
		
		참고 ]
			
			회문수 : 앞에서 읽으나 뒤에서 읽으나 같은 숫자.
				예 ]
					12321
					45654
					
				아닌예 ]
					12345
					12312
 */

import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력받고
		System.out.print("다섯자리 숫자 입력 : ");
		String sno = sc.nextLine();
		
		String result = "회문수 입니다.";
		
		// 반복해서 비교하고
		for(int i = 0 ; i < 2 ; i++ ) {
			char ch = sno.charAt(i);
			char ch1 = sno.charAt(4 - i);
			/*
				다섯번째 문자 : sno.charAt(4) - i : 0
				네번째 문자 : sno.charAt(3)  - i : 1
			 */
			if(ch != ch1) {
				/*
					12345
					
						첫번째 비교하는데 1과 5를 꺼내서 비교할 것이므로
						이때 다르다는 결과가 나온다.
						이순간
							이 숫자는 회문수가 아니게 된다.
						따라서 더이상의 작업이 무의미하다.
				 */
				result = "회문수가 아닙니다.";
				break;
			}
		}
		
		// 결과 출력하고
		System.out.println("입력한 숫자 " + sno + " 는 " + result);
	}
}

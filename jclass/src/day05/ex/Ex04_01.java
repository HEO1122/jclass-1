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
public class Ex04_01 {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력받고
		System.out.print("다섯자리 숫자 입력 : ");
		/*
		String sno = sc.nextLine();
		*/
		int no = sc.nextInt();
		
		
		/*
			no : 12345
			
			no1 :
			==> 5
				54
				543
				5432
				54321
				
			==> no == no1
		 */
		
		int tmp = no;
		int no1 = 0;
		
		for(int i = 0 ; i < 5; i++ ) {
			no1 = no1 * 10 + (tmp % 10);
			tmp = tmp / 10;
			
			/*
				i : 0, no : 12345
						==> no1 : 5
							tmp : 1234
							
				i : 1
						==> no1 : 54
							tmp : 123
				...
				
			 */
		}
		
		
		String result = (no == no1) ? "회문수 입니다." : "회문수가 아닙니다.";
		// 결과 출력하고
		System.out.println("입력한 숫자 " + no + " 는 " + result);
	}
}

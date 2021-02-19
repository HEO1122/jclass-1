package day05.ex;

/*
	문제 2 ]
		다섯자리의 숫자를 랜덤하게 발생시킨후
		각자리의 합을 구해주는 프로그램을 작성하세요.
		단, 반복문을 사용해서 처리하세요.
		
		힌트 1 ]
			charAt() - 문자열의 특정위치의 문자를 꺼내주는 함수
			Integer.parseInt() - 숫자형식의 문자열을 정수로 
									변환시켜주는 함수
		
		힌트2 ]
			정수를 10 나누면 한자리가 줄어든다.
			==>
			12345 ---->
						12345 / 10 ===> 1234
						12345 % 10 ===> 5
 */
//import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		/*
		int ino = (int)(Math.random()* (99999 - 10000 + 1) + 10000);
		
		// 변수 준비
		int sum = 0;
		
		//	문자열로 처리하는 방법
		String sno = ino + "";
		// 하나씩 꺼내서 더해주고
		for(int  i = 0 ; i < 5 ; i++) {
			// 다섯번 반복해서 하나씩 꺼내고
			char ch = sno.charAt(i);
			// 문자열로 바꾸고
			String tmp = ch + "";
			// 정수로 바꾸고
			int no = Integer.parseInt(tmp);
			// 합에다 더해주고
			sum = sum + no;
		}
		 */
		
		/*
			문자열로 처리하는 방법 2]
		 */
		int ino = (int)(Math.random()* (99999 - 10000 + 1) + 10000);
		
		// 변수 준비
		int sum = 0;
		
		String sno = ino + "";
		/*
			문자 '0' 을 숫자 0으로 변환하는 방법
			 
			 	'0' - '0' = 0
		 */
		for(int i = 0 ; i < 5; i++ ) {
			char ch = sno.charAt(i);
			
			int tmp = ch - '0';
			
			sum += tmp;
		}
		
		/*
			숫자로 처리하는 방법 
		int ino = (int)(Math.random()* (99999 - 10000 + 1) + 10000);
		
		// 변수 준비
		int sum = 0;
		
		// 처리용 변수 준비
		int tmp = ino ;
		
		for(int i = 0 ; i < 5 ; i++ ) {
			sum = sum + (tmp % 10);
			tmp = tmp / 10;
		}
		 */
		
		// 결과 출력하고
		System.out.println("랜덤하게 발생한 숫자 : " + ino );
		System.out.println("각자리수를 더한 값 : " + sum);
	}
}


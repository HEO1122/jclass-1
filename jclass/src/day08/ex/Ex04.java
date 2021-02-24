package day08.ex;

/*
	문제 4 ]
		"1234-56" 의 형식과 같이 
		숫자부호숫자로 구성된 문자열을 입력받아서
		계산해주는 계산기 프로그램을 작성하세요.
		
		사용함수 ]
			
			charAt()
			length()
			substring90
			
			Integer.parseInt
			
 */

import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 수식을 입력받는다.
		System.out.print("수식 입력 : ");
		String str = sc.nextLine(); // ==> "1234-56"
		
		// 연산기호의 위치값을 기억할 변수
		int idx = 0;
		
		// 기준이 되는 연산기호의 위치값을 추출한다.
		for(int i = 0 ; i < str.length(); i++ ) {
			char ch = str.charAt(i);
			if(ch < '0' || ch > '9') {
				idx = i;
				break;
			}
		}
		
		// 각 데이터를 기억할 문자열 변수준비
		String sno1 = str.substring(0, idx);
		String sno2 = str.substring(idx + 1);
		String buho = str.substring(idx, idx+1);
		
		// 문자열 형태의 숫자를 정수로 변환해주고
		int no1 = Integer.parseInt(sno1);
		int no2 = Integer.parseInt(sno2);
		
		// 결과 기억할 변수
		int result = 0;
		
		// 연산기호에 따라서 처리
		switch(buho) {
		case "+":
			result = no1 + no2;
			break;
		case "-":
			result = no1 - no2;
			break;
		case "*":
			result = no1 * no2;
			break;
		case "/":
			result = no1 / no2;
			break;
		case "%":
			result = no1 % no2;
			break;
		}
		
		
		// 결과 출력
		System.out.println(str + " 의 결과는 [ " + result + " ] 입니다.");
	}

}

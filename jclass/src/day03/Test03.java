package day03;

/*
	문제 ]
		정수를 입력받아서
		짝수이면 "짝수입니다."
		홀수이면 "홀수입니다."
		
	(옵션)	0이면	 "0입니다."
		
		가 출력되게 프로그램을 작성하세요.
 */
import java.util.*;
public class Test03 {
	public static void main(String[] args) {
		// 할일
		// 1. 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 숫자 입력받고
		System.out.print("정수를 입력하세요! : ");
		int no = sc.nextInt();
		// 3. 짝수인지 홀수인지 판별해서 결과를 변수에 담고
		// 짝수의 정의는 2로 나눠서 떨어지는 숫자를 의미하므로...
		String result = (no % 2 == 0) ? "짝수" : "홀수";
		String result1 = (no % 2 == 0) ? ((no == 0) ? "0": "짝수") : "홀수";
		/*
			조건식의 결과값은 항상 true 또는 false 가 나와야 한다.
		 */
		// 4. 결과 출력하고
		System.out.println("입력받은 수 " + no + " 는 " + 
							result + " 입니다.");
		System.out.println("입력받은 수 " + no + " 는 " + 
				result1 + " 입니다.");
	}
}

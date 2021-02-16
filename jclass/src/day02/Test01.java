package day02;

/*
	반지름을 입력(정수)받아서
	원의 넓이를 출력해주는 프로그램을 작성하세요.
 */

import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		// 할일
		// 1. 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 입력메세지를 출력해주고
		System.out.print("원의 반지름 : ");
		// 3. 입력받고
		int rad = sc.nextInt();
		// ==> 이 경우도 숫자가 아닌 다른 문자 또는 실수형태로 입력하면 에러... 
		// 4. 넓이 계산하고
		double area = rad * rad * 3.14;
		// 5. 정보 출력하고
		System.out.println("반지름이 " + rad + " 인 원의 넓이는 " +
							area + " 입니다.");
	}
}

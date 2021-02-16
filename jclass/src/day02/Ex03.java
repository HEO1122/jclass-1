package day02;
/*
	문제 3 ]
		삼각형의 밑변과 높이를 정수로 입력받아서
		넓이를 출력해주는 프로그램을 작성하세요.
 */

import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		// 할일
		// 1. 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 2. 밑변 입력받고
		System.out.print("밑변 : ");
		int width = sc.nextInt();
		// 3. 높이 입력받고
		System.out.print("높이 : ");
		int height = sc.nextInt();
		// 4. 넓이 계산하고
		// 	정수와 실수의 연산의 결과는 실수이므로 실수형 변수를 만들어서 결과를 기억하자.
		double area = width * height / 2;
//		double area = width * height / 2.0;
		/*
			double area = width * height / 2;
			연산식을 이렇게 기술하면
			연산 결과는 정수로 만들어질 것이고
			소수점 이하는 버리는 데이터가 만들어진다.
			정수 데이터는 실수보다 항상 작으므로
			실수에 담을 수 있고
			따라서 오류는 발생하지 않는다.
			하지만 원하는 결과값은 얻지 못할 수 있다.
		 */
		// 5. 출력하고
		System.out.println("밑변 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("넓이 : " + area);
	}
}

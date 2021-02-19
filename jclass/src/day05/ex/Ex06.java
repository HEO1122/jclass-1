package day05.ex;

/*
	문제 6 ]
		두 정수를 입력받아서
		두 정수의 최소 공배수를 출력해주는 프로그램을 작성하세요.
		
		참고 ]
			최소공배수란 두 수로 나누어 떨어지는 최소 숫자를 이야기한다.
			
			2와 3의 최소 공배수는 6 이다.
			2와 7의 최소 공배수는 14이다.
			3과 7의 최소 공배수는 21이다.
			
			12 와 24의 최소 공배수는 24이다.
			
			2, 7
			==>
				7 
				8
				9
 */

import java.util.*;
public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int no1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int no2 = sc.nextInt();
		
		sc.close();
		
		// 두수중 큰수를 찾는다.
		int max = (no1 > no2)? no1 : no2;
		int result = 0;
		for(int i = max; true ; i++) {
			if(i % no1 == 0 && i % no2 == 0) {
				result = i;
				break;
			}
		}
		
		System.out.println("입력한 두수 "+ no1 + " 과 " + no2 + 
								" 의 최소 공배수는 " + result + "입니다.");
	}
}

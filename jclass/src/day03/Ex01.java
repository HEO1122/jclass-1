package day03;

/*
	문제 1 ]
		3자리의 숫자를 랜덤하게 발생시켜서 ( 100 ~ 999 )
		백자리 미만은 버린 숫자를 만들어서 출력하세요.
 */
public class Ex01 {
	public static void main(String[] args) {
		// 랜덤하게 숫자 만들고
		int no = (int)(Math.random() * (999 - 100 + 1) + 100);
		// 랜덤한 숫자 출력하고
		System.out.println("랜덤한 3자리 정수 : " + no);
		
		/* 방법 1 ] */
		no /= 100;
		System.out.println("랜덤한 3자리 100으로 나눈 숫자 : " + no);
		
		no *= 100;
		System.out.println("랜덤한 3자리 100으로 나눈 숫자에 100을 곱한 숫자 : " + no);
		
		/* 방법 2 ]
		no = no - (no % 100);
		System.out.println("랜덤한 3자리 숫자를 10이하는 버린 숫자 : " + no);
		 */
	}
}

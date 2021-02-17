package day03;
/*
	문제 5 ]
		25 ~ 95 사이의 숫자하나를 랜덤하게 발생 시킨후
		그 숫자와 가장 가까운 10의 배수를 출력해주는 프로그램을 작성하세요.
		발생한 숫자와 가까운 10의 배수를 모두 출력하세요.
		
		예 ]
			27 ==> 30이 가장 가까운 10의 배수
			32 ==> 30이 가장 가까운 10의 배수
			
 */
public class Ex05 {
	public static void main(String[] args) {
		int no = (int)(Math.random() * 71) + 25; // 34
		
		int rest = no % 10; // 4
		
		int result = (rest < 5) ? (no / 10 * 10) : ((no / 10 + 1) * 10);
		
		System.out.println("랜덤하게 발생한 숫자 " + no + " 와 가까운 10의 배수는 " + result + " 입니다.");
	}
}

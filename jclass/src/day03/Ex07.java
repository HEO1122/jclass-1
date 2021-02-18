package day03;

/*
	문제 7 ]
		
		숫자 3개를 임의로 발생할 후
		가장 큰 숫자만 선택해서 출려하는 프로그램을 작성하세요.
		단, 3항연산를 사용해서 처리하세요.
		(옵션 - 조건문으로 처리)
 */
public class Ex07 {
	public static void main(String[] args) {
		// 랜덤한 정수를 세개 발생시켜서 변수에 기억
		int no1 = (int)(Math.random() * (45 - 1 + 1) + 1);
		int no2 = (int)(Math.random() * (45 - 1 + 1) + 1);
		int no3 = (int)(Math.random() * (45 - 1 + 1) + 1);
		
		// 비교한다.
		/*
			no1 > no2 경우
				no1이 no3 보다 큰 경우
				no1이 no3 보다 작은 경우
		 */
		int max = (no1 > no2) ? (no1 > no3 ? no1: no3) :
								(no2 > no3 ? no2 : no3); 
		
		System.out.println("입력된 세 정수 " + no1 + ", " + no2 + ", " + no3 +
								" 중 제일 큰 수는 " + max + " 입니다."
							);
	}
}

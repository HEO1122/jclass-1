package day03;

/*
	문제 7 ]
		
		숫자 3개를 임의로 발생할 후
		가장 큰 숫자만 선택해서 출려하는 프로그램을 작성하세요.
		
		조건문으로 처리
			if ~ else 구문으로 처리
 */
public class Ex07_01 {
	public static void main(String[] args) {
		// 랜덤한 정수를 세개 발생시켜서 변수에 기억
		int no1 = (int)(Math.random() * (45 - 1 + 1) + 1);
		int no2 = (int)(Math.random() * (45 - 1 + 1) + 1);
		int no3 = (int)(Math.random() * (45 - 1 + 1) + 1);
		
		// 비교한다.
		int max = 0;
		
		if(no1 > no2) {
			// 참고 ] 조건문 역시 중첩해서 사용할 수 있다.
			if(no1 > no3) {
				max = no1;	// no1 > no2 ?? no3
			} else {
				max = no3;	// no3 > no1 > no2
			}
		} else { // 이 경우는 no2가 no1보다 큰 경우이다. no2 > no1
			// 따라서 큰수 no2와 no3를 비교하면 해결된다.
			if(no2 > no3) {
				max = no2; // no2 > no1 ??? no3
			} else { 
				// 이 경우는 no3가 no2보다 큰경우이고, 
				// no2는 no1보다 크므로 no3가 제일 크다.
				max = no3; // no3 > no2 > no1
			}
		}
		
		System.out.println("입력된 세 정수 " + no1 + ", " + no2 + ", " + no3 +
								" 중 제일 큰 수는 " + max + " 입니다."
							);
	}
}

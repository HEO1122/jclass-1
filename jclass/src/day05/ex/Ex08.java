package day05.ex;

/*
	문제 8 ]
		3 ~ 100 사이의 숫자를 랜덤하게 발생시켜서
		발생된 숫자가 솟수인지를 판단해서 출력해주는 프로그램을 작성하세요.
		
		참고 ]
			솟수 : 1과 자기자신으로만 나눌수 있는 수
			
			예 ]
				2, 3, 5, 7, ....
 */
public class Ex08 {
	public static void main(String[] args) {
		
		lbl:
		for(int i = 3; i <= 100; i++) {
			
			for(int j = 2; j < i ; j++ ) {
				if(i % j == 0) {
					continue lbl;
				}
			}
			System.out.print(i + ", ");
		}
	}
}

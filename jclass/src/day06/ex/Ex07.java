package day06.ex;

/*

7. 
    1 ~ 100 까지의 합을 구하는데 홀수들만의 합을 구하세요.
 */
public class Ex07 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(i < 100) {
			i++;
			if(i % 2 == 0) {
				// 이 경우는 짝수이므로 다음 회차로 진행하자.
				continue;
			}
			sum = sum + i;
		}
		
		System.out.println("1부터 100까지 홀수들의 합은 " + sum + " 입니다.");
	}

}

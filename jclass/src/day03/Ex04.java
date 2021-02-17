package day03;

/*
	문제 4 ]
		소수점이 있는 숫자를 입력받은 후
		소수이하 셋째 자리에서 반올림한 결과를 출력하세요.
		
		힌트 ]
			소수 세째자리에서 발올림을 하면
			 + 0.005
			 를 더해주고 
			 
			 그 이하는 버리면 된다. 
			 <== * 100 이 결과를 정수로 강제 형변환하면 이하는 버리는 숫자가 만들어진다.
			 그 숫자를 100으로 나눈 실수를 만들면 된다.
			 
 */
import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		// 할일
		// 1. 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 데이터 입력받고
		System.out.print("실수를 입력하세요! : ");
		double no = sc.nextDouble();
		// 3. 계산해서(반올림 계산식) --> 12.126
//		double result = ((int)((no + 0.005) * 100) ) / 100.0;
		int no1 = (int)((no + 0.005) * 100); // --> 1213.1 ---> 1213
		double no2 = no1 / 100.0; 
		// 4. 출력하고
		System.out.println("입력받은 숫자 : " + no);
		System.out.println("반올림한 숫자 : " + no2);
	}
}

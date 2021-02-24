package day07.ex;

import java.util.Arrays;

/*
	
반복문 문제
	피보나치 수열을 만들어 보세요.
	
	"피보나치 수열"이란?
	
		1  1  2  3  5  8  13  21  ....
	방법
		1  1
		+     2
			
			1 + 2 ==> 3
			
			2 + 3 ==> 5
			
	단 20개를 만들어서 출력하세요.
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] num = new int[20];
		num[0] = 1;
		num[1] = 1;
		for(int i = 2; i < 20; i++ ) {
			int no1 = num[i - 2];
			int no2 = num[i - 1];
			num[i] = no1 + no2;
		}
		
		System.out.println(Arrays.toString(num));
	}

}

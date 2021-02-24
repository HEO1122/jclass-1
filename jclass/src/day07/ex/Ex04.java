package day07.ex;

import java.util.Arrays;

/*

문제 4]
	랜덤하게 소문자를 6개를 발생시켜서
	배열에 담고
	배열에 담긴 내용을 역순으로 바꿔서 
	출력해주는 프로그램을 작성하세요.
 */
public class Ex04 {

	public static void main(String[] args) {
		char[] ch = new char[6];
		char[] ch1 = new char[6];
		
		// 랜덤한 문자 여섯개 채우고
		for(int i = 0 ; i < 6 ; i++ ) {
			char c = (char)(Math.random()*('z' - 'a' + 1) + 'a');
			ch[i] = c;
		}
		System.out.println(Arrays.toString(ch));
		
		for(int i = 0 ; i < 6 ; i++ ) {
			ch1[i] = ch[ch.length - 1 - i];
		}
		for(char c : ch1) {
			System.out.print(c + " ");
		}
		/*
			0	5		-0
			1	4		-1
			2	3		-2
			3	2		-3
			4	1		-4
			5	0		-5
			
		 */
	}

}

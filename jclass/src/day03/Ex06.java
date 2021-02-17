package day03;

/*
	문제 6 ]
		소문자를 랜덤하게 발생시켜서
		그 문자를 대문자로 변환시켜서 출력하세요.
		
		'a' - 'A' ===> 32
		'z' ==> 'Z' : 'z' - 32
		
		'z' - ('a' - 'A') = 'Z'
 */
public class Ex06 {
	public static void main(String[] args) {
		char ch = (char)(Math.random() * ('z' - 'a' + 1) + 'a');
		
		char ch1 = (char)(ch - ('a' - 'A'));
		System.out.println("랜덤하게 발생한 소문자 : " + ch);
		System.out.println("대문자로 변형한 영문자 : " + ch1);
	}
}

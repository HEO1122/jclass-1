package day03;

/*
EXTRA 2 ]
	
	문자 하나를 입력받아서
	입력받은 문자가
		숫자인지
		소문자인지
		대문자인지
		특수문자인지
	를 판별해주는 프로그램을 작성하세요.
	
	문자를 입력받는 방법 ]
		
		1. 문자열로 한 글자를 입력받는다.
		2. 입력받은 글자를 기억한 변수를 함수를 사용해서 한글자를 꺼낸다.
			
			char 변수이름 = 문자열변수.charAt(0);
 */
import java.util.*;
public class Extra02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		String str = sc.nextLine();
		
		char ch = str.charAt(0);
		
		System.out.println("입력한 문자열 : " + str);
		System.out.println("입력한 문자 : " + ch);
		
		String msg = (ch < '0' || ch > 'z') ? "특수문자" : (ch <= '9') ? ("숫자") : (((ch > '9' & ch < 'A') || (ch >'Z' & ch < 'a')) ? "특수문자": ((ch <= 'Z') ? "대문자" : "소문자") );
		
		System.out.println("입력한 문자 " + ch + " 는 " + msg + " 입니다.");
	}
}

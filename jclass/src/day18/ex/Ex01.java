package day18.ex;

/*
	문제 1 ]
		아이디 정규식 검사를 하는 프로그램을 작성해서 실행하세요.
		
		아이디 형식은
			첫글자는 소문자로 시작하고
			마지막 글자는 숫자로 끝난다.
			8로 구성된 아이디를 사용해야 한다.
			영문자와 숫자만 사용하는 것으로 한다.
 */
import java.util.regex.*;
public class Ex01 {

	public Ex01() {
		String id = "abcderaa";
		// 패턴 만들고
		String pat = "[a-z][a-zA-Z0-9]{6}[0-9]";
		Pattern pattern = Pattern.compile(pat);
		// 검사하고
		Matcher mat = pattern.matcher(id);
		// 결과 꺼내고
		if(mat.matches()) {
			System.out.println("*** 올바른 아이디 입니다. ***");
		} else {
			System.out.println("##### 형식에 맞지 않은 아이디 입니다. #####");
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}

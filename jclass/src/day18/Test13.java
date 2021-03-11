package day18;

import java.text.*;
public class Test13 {

	public Test13() {
		String sql = "INSERT INTO emp VALUES(1234, '홍길동', '총무부', 2000)";
		/*
			이 중에서 데이터만 따로 꺼내고 싶은경우는????
			
			원리 ]
				MessageFormat 에서 데이터가 들어갈 부분을 명시한 패턴을 만든다.
				
				parse() 함수를 이용해서 데이터 부분을 추출해내면 된다.
		 */
		MessageFormat form = new MessageFormat("INSERT INTO emp VALUES({0}, {1}, {2}, {3})");
		Object[] obj = null;
		try {
			obj = form.parse(sql);
			for(Object o : obj) {
				System.out.print(o + ", ");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Test13();
	}

}

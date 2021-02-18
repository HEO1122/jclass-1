package day04.ex;

/*
	10 ~ 49 까지의 수중 정수 하나를 입력받아서
		
		10 ~ 19 : 총무부
		20 ~ 29 : 영업부
		30 ~ 39 : 회계부
		40 ~ 49 : 개발부
	
	로 출력해주는 프로그램을 작성하세요.
	
	if ~ else if 구문
	
	switch ~ case 구문
	
	두가지 모두 처리하세요.
		
 */
public class Ex03 {
	public static void main(String[] args) {
		// 부서번호 발생
		int dno = (int)(Math.random() * 40 + 10);
		// 큰수 - 작은수  + 1 
		// ==> 49 - 10 + 1 ==> 40
		
		
		String dname = "";
		/*
		// 조건처리하고
		if(dno < 20) {
			dname = "총무부";
		} else if(dno < 30) {
			dname = "영업부";
		} else if(dno < 40) {
			dname = "회계부";
		} else {
			dname = "개발부";
		}
		*/
		
		switch(dno / 10) {
		case 1:
			dname = "총무부";
			break;
		case 2:
			dname = "영업부";
			break;
		case 3:
			dname = "회계부";
			break;
		default:
			dname = "개발부";
		}
		
		System.out.println("입력한 부서번호 " + dno + " 는 " + 
										dname + " 입니다.");
	}
}

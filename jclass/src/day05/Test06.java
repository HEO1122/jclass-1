package day05;

/*
	10 ~ 49 까지의 수중 정수 하나를 입력받아서
		
		10 ~ 19 : 총무부
		20 ~ 29 : 영업부
		30 ~ 39 : 회계부
		40 ~ 49 : 개발부
	
	로 계속 반복해서 출력해주는 프로그램을 작성하세요.
	
	99를 입력하는 종료되도록 하세요.
 */
import java.util.*;
public class Test06 {
	public static void main(String[] args) {
		// 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 입력받고
			System.out.print("부서번호 : ");
			int dno = sc.nextInt();
			if(dno == 99) {
				System.out.println("*** 프로그램을 종료합니다. ***");
				break;
			}
			
			// 출력용 변수만들고
			String dname = "";
			
			// 입력된 데이터를 비교해서 처리해주고
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
			case 4:
				dname = "개발부";
				break;
			default:
				dname = "없는 부서";
			}
			// 출력하고
			System.out.println("입력한 " + dno + " 부서는 " + dname +  " 입니다.");
		}
	}
}

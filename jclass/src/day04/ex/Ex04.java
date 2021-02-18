package day04.ex;

/*
	문제 4 ]
		전기요금을 계산하는 프로그램을 작성하세요.
		
		전기요금은 용도별로 
					코드		기본요금	사용요금
			가정용	1		3800	245
			산업용	2		2400	157
			교육용	3		2900	169
			상업용	4		3200	174
			
			전기요금 계산식 : 기본요금 + 사용량 * 사용요금
			
		용도 코드와 사용량을 입력받아서 전기요금을 계산해주는 프로그램을 작성하세요.
 */
import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 용도 코드 변수
		int code = 0;
		// 사용량 변수
		int qt = 0;
		
		// 사용료 변수
		int money = 0;
		int gibon = 0;
		int sayong = 0;
		
		String yongdo = "";
		
		// 입력받고
		System.out.print("사용코드 : ");
		code = sc.nextInt();
		System.out.print("사용량 : ");
		qt = sc.nextInt();
		
		switch(code) {
		case 1:
			yongdo = "가정용";
			gibon = 3800;
			sayong = 245;
//			money = 3800 + qt * 245;
			break;
		case 2:
			yongdo = "산업용";
			gibon = 2400;
			sayong = 157;
//			money = 2400 + qt * 157;
			break;
		case 3:
			yongdo = "교육용";
			gibon = 2900;
			sayong = 169;
//			money = 2900 + qt * 169;
			break;
		case 4:
			yongdo = "상업용";
			gibon = 3200;
			sayong = 174;
//			money = 3200 + qt * 174;
			break;
		}
		
		money = gibon + qt * sayong;
		
		System.out.println("용도 : " + yongdo);
		System.out.println("사용량 : " + qt);
		System.out.println("기본료 : " + gibon);
		System.out.println("사용료 : " + sayong);
		System.out.println("전기요금 : " + money);
	}
}

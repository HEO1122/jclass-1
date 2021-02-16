package day02;
/*
	문제 4 ] 변수 만드는 연습용...
		친구의 이름, 나이, 신장, 전화번호를 입력받아서
		출력해주는 프로그램을 작성하세요.
 */
import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		// 할일
		// 1. 입력도구 준비한다.
		Scanner sc = new Scanner(System.in);
		// 2. 필요한 변수를 선언한다.
		String name, tel;
		// 전화번호의 경우 숫자로 기억하면 지역번호가 변형되어서 저장이 될 것이다.
		// 따라서 문자열로 기억하자.
		int age;
		double height;
		// 3. 이름, 나이, 신장, 전화번호 순으로 입력받는다.
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		// 나이 입력
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		// 신장 입력
		System.out.print("신장 : ");
		height = sc.nextDouble();
		
		// 이 경우는 강제로 메모리에 남아있는 리턴키의 데이터를 뽑아낸다.
		sc.nextLine();
		
		// 전화번호 입력
		System.out.print("전화번호 : ");
		tel = sc.nextLine();
		// 4. 출력한다.
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("전화번호 : " + tel);
	}
}

package day05;

/*
	단을 입력받아서
	해당 단의 구구단을 출력해주는 프로그램을 작성하세요.

-----------------------------------------
	단을 출력하면 다시 단을 입력받도록 하고
	0을 입력하면 프로그램 종료되도록 
	프로그램을 작성하세요.
 */

import java.util.*;
public class Test09 {
	public static void main(String[] args) {
		// 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 입력받고
		System.out.print("몇단 ??? : ");
		int dan = sc.nextInt();
		// 해당 단 출력하고
		System.out.println("***** " + dan + " 단 *****");
		for(int i = 0 ; i < 9 ; i++) {
			System.out.println(dan + " x " + (i + 1) + " = " + (dan * (i + 1)));
		}
	}
}

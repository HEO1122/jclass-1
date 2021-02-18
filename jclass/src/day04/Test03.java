package day04;

// 구구단 5단을 출력하세요.
public class Test03 {
	public static void main(String[] args) {
		int dan = 5;
		for(int i = 0 ; i < 9 ; i++ ) {
			System.out.println(dan + " x " + (i + 1) + " = " + (dan * (i + 1)));
		}
		System.out.println();
		for(int i = 1 ; i <= 9 ; i++ ) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}
	}
}

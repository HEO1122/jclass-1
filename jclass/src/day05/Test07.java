package day05;

/*
	do ~ while 반복문을 이용해서
	구구단 7단을 출력하세요.
 */
public class Test07 {
	public static void main(String[] args) {
		// 필요한 변수 만들고
		int dan = 7;
		
		int gop = 1;
		do { // 후조건처리명령이다. 따라서 조건이 거짓이라도 한번은 실행한다.
			// 내용 출력하고
			System.out.println(dan + " x " + gop + " = " + (dan * gop));
			// 곱할 수 증가시키고
			gop++;
		} while(gop < 10);
//		} while(gop < -10); // 이경우 조건식이 거짓이라도 처리내용이 한번은 실행된다.
	}
}

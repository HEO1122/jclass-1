package day02;

/*
	대입 연산자
	==> 특정한 상수값이나 변수 값 또는 객체를 
		변수에 기억시킬때 사용하는 연산자.
 */
public class Test03 {
	public static void main(String[] args) {
		int no = 10; // 이때 = 은 대입연산자.
		System.out.println("1. no : " + no);
		
		// no에 5를 누적 연산한 결과 를 다시 no에 대입한다.
		no = no + 5;
		System.out.println("2. no : " + no);
		
		// ==>
		no += 5;
		System.out.println("3. no : " + no);
		
		// -= 
		no -= 10; // no 가 기억한 숫자에서 10을 뺀 결과를 no에 기억시킨다.
		System.out.println("4. no : " + no);
		
		// *=
		no *= 2; // no가 기억한 숫자에 2를 곱해서 no에 기억시킨다.
		System.out.println("5. no : " + no);
		
		no /= 2; // no가 기억한 숫자를 2로 나눈값을 다시 no에 기억시킨다.
		System.out.println("6. no : " + no);
		
		no %= 3; // no가 기억한 숫자를 3으로 나눈 나머지를 no기억시킨다.
		System.out.println("7. no : " + no);
	}
}

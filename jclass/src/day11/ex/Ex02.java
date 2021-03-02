package day11.ex;

/*
	문제 2 ]
		원의 정보를 기억할 클래스(Circle)을 정의하고
		이 클래스를 10개를 관리할 배열을 만들어서
			반지름, 둘레, 넓이
		를 출력하세요. 
 */
public class Ex02 {
	
	public Ex02() {
		Circle[] won = new Circle[10];
		// 각방에 Circle 인스턴스 만들어서 기억시키고
		for(int i = 0 ; i < won.length ; i++ ) {
			won[i] = new Circle();
		}
		
		// 출력하고
		for(Circle c : won) {
			c.toPrint();
		}
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}

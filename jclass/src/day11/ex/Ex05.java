package day11.ex;

/*
	문제 5 ]
		 원의 정보를 5개 기억할 배열을 만들어서
		 정보를 출력해주는 프로그램을 작성하세요.
		 
		 멤버처리는 문제 3과 동일하게 하세요.
 */
public class Ex05 {
	public Ex05() {
		Won[] won = new Won[5];
		
		// 인스턴스 셋팅
		for(int i = 0 ; i < won.length ; i++ ) {
			won[i] = new Won();
		}
		
		// 변수셋팅
		for(int i = 0 ; i < won.length ; i++ ) {
			won[i].setRad();
			won[i].setArround();
			won[i].setArea();
		}
		
		// 출력
		for(Won w : won) {
			w.toPrint();
		}
	}
	public static void main(String[] args) {
		new Ex05();
	}

}

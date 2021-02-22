package day06.ex;

/*
	문제 2 ]
		달팽기가 전봇대(100m)에 올라간다.
		낮에는 0.87m를 올라가고
		밤에는 0.35m를 미끄러져 내려온다.
		
		몇일만에 이 달팽이는 정상에 올라갈 것인가?
		단, 꼭대기에 올라가면 미끄럼은 없다.
 */
public class Ex02 {

	public static void main(String[] args) {
		int day = 0;	// 날 수 기억할 변수
		double snail = 0; // 달팽이의 현재위치 기억할 변수
		boolean complete = false;
		
		
		while(true) {
			day++; // 날짜 증가시키고
			// 달팽이 위치를 만들고
			snail = snail + 0.87;
			if( snail >= 100) {
				complete = true;
				break;
			}
			snail = snail - 0.35;
		}
		
		if(complete) { // complete <=== complete == true
			System.out.println("반복문 중간에 종료!!!");
		}
		System.out.println("달팽이는 " + day + " 일만에 정상에 올라갑니다.");
	}

}

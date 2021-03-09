package day15.sample;

public class Hap {

	public Hap() {
		System.out.println(hap(10));
	}
	
	public static void main(String[] args) {
		new Hap();
	}
	
	/*
		재귀(호출)함수
		: 함수 내부에서 다시 함수 자신을 호출하는 함수
		
		주의 사항 ]
			이런 경우 반드시 함수 실행의 종료 조건을 기술해줘야 한다.
	 */
	public int hap(int no) {
		if(no == 0) return 0;
		return no + hap(no - 1);
		//				(no - 1) + hap(no - 2)
		//							(no - 2) + hap(no - 3) 
		//													+ ... + 0;
	}
}

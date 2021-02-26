package day10.ex;

/*
문제 4 ]
	1. 정수를 입력하면 그 정수에 해당하는  삼각형 배열을 기억할 배열을 반환해주는 함수 (semo[n][3])
	2. 배열을 입력하면 배열의 삼각형들의  밑변, 높이 를 랜덤하게 셋팅해주는 함수
	3. 배열을 입력하면 배열의 삼각형들의 넓이를 입력해주는 함수
	4. 배열을 입력하면 배열의 삼각형들의 내용을 출력해주는 함수
		밑변 - 0000
		높이 - 0000
		넓이 - 0000
	5. 배열과 정수를 입력하면 배열의 정수 위치의 삼각형의
		정보를 출력해주는 함수
		
	를 만들어서 실행하세요.
 */
public class Ex04 {
	
	public Ex04() {
		int cnt = (int)(Math.random()*7 + 3);
		double[][] semo = getSemo(cnt);
		setData(semo);
		setArea(semo);
		printSemos(semo);
	}
	public static void main(String[] args) {
		new Ex04();
	}
	
	// 1. 삼각형 배열을 반환해주는 함수
	public double[][] getSemo(int cnt){
		double[][] semo = new double[cnt][3]; // 밑변, 높이, 넓이
		return semo;
	}
	
	// 2. 배열을 입력하면 밑변과 높이를 셋팅해주는 함수
	public void setData(double[][] semo) {
		for(int i = 0 ; i < semo.length ; i++ ) {
			for(int j = 0 ; j < semo[i].length ; j++ ) {
				semo[i][j] = (int)(Math.random()*99 + 1);
			}
		}
	}
	
	// 3. 넓이 계산해주는 함수
	public void setArea(double[][] semo) {
		for(int i = 0 ; i < semo.length ; i++ ) {
			semo[i][2] = semo[i][0] * semo[i][1] / 2.;
		}
	}
	
	// 4. 배열 내용 출력해주는 함수
	public void printSemos(double[][] semo) {
		for(int i = 0 ; i < semo.length ; i++ ) {
			System.out.printf("%2d 번째 삼각형 - 가로 : %2.1f, 세로 : %2.1f, 넓이 : %7.1f\n",
						(i + 1), semo[i][0], semo[i][1], semo[i][2]
					);
		}
	}
}

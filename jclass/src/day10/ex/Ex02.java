package day10.ex;

/*
	문제 2 ]
		2차원 정수 배열의 멤버변수 score 를 만들고(10 학생 5과목 - score[10][6])
		
		1. score 에 점수를 랜덤하게 입력하는 함수
		2. score 에 입력된 점수를 더해서 총점을 계산해주는 함수
		3. score 의 학생들을 총점을 기준으로 내림차순 정렬해주는 함수
		
		를 제작해서 실행하고 결과를 출력하세요.
 */
public class Ex02 {
	int[][] score = new int[10][6];
	
	public Ex02() {
		// 배열 셋팅하고
		setScore();
		// 총점 계산해서 셋팅하고
		setTotal();
		// 총점으로 정렬하고
		setSort();
		// 출력하고
		toPrint();
		
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
	
	// 점수 셋팅함수
	public void setScore() {
		for(int i = 0 ; i < score.length; i++ ) {
			for(int j = 0 ; j < score[i].length - 1 ; j++ ) {
				score[i][j] = (int)(Math.random()* 41 + 60);
			}
		}
	}
	
	// 총점 계산 함수
	public void setTotal() {
		for(int i = 0 ; i < score.length; i++ ) {
			for(int j = 0 ; j < score[i].length - 1; j++ ) {
				score[i][score[i].length - 1] += score[i][j];
			}
		}
	}
	
	// 정렬해주는 함수
	public void setSort() {
		for(int i = 0 ; i < score.length - 1 ; i++ ) {
			for(int j = i + 1 ; j < score.length ; j++ ) {
				int t1 = score[i][5];
				int t2 = score[j][5];
				if(t1 < t2) {
					int[] tmp = score[i]; // i 번째 주소 기억시키고
					score[i] = score[j]; // i 번째에 j 번째 주소 기억시키고
					score[j] = tmp; // j 번째에 i 번째의 주소 기억시키고
				}
			}
		}
	}
	
	// 출력해주는 함수
	public void toPrint() {
		for(int i = 0 ; i < score.length ; i++ ) {
			for(int j = 0 ; j < score[i].length ; j++ ) {
				System.out.printf("%3d ", score[i][j]);
			}
			System.out.println();
		}
	}
}

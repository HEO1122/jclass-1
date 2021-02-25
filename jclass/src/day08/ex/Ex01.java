package day08.ex;

import java.util.Arrays;

/*
	문제 1 ]
		5학생의 3과목 점수를 기억하는 배열을 만드세요.
		단, 점수는 70 ~ 99 점 사이로 랜덤하게 만들고 
		하나의 배열로 처리하세요.
		
		int[][] stud = new int[5][3];
 */
public class Ex01 {

	public static void main(String[] args) {
		int[][] score = new int[5][3];
		
		// 학생들 한명씩 꺼내고
		for(int i = 0 ; i < score.length ; i++ ) {
			// 과목 하나씩 꺼내고
			for(int j = 0 ; j < score[i].length ; j++ ) {
				score[i][j] = (int)(Math.random() * 30 + 70);
			}
		}
		
		for(int[] stud : score) {
			System.out.println(stud);
			System.out.println(Arrays.toString(stud));
		}
		
		for(int i = 0 ; i < score.length ; i++ ) {
			System.out.println(score[i]); // 주소만 나온다. 왜?? 배열이 담겨있으니까...
			System.out.println(score[i][0]); // 점수가 출력된다. 각 학생들의 첫번째 과목 점수...
		}
	}

}

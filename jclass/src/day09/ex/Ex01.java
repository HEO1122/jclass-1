package day09.ex;

/*
	문제 1 ]
		5학생의 3과목 점수를 기억하는 배열을 만드세요.
		단, 점수는 70 ~ 99 점 사이로 랜덤하게 만들고 
		하나의 배열로 처리하세요.
		
			==> int[][] stud = new int[5][3];
			
		3과목의 5학생의 점수를 기억할 배열을 만들고
		위 배열에서 데이터를 복사해서 채워넣으세요.
			==> int[][] score = new int[3][5];
			
		-----------------------------------------------
		stud와 score 배열을 복사하는데
		총점도 같이 기억하도록 배열을 만들어서 복사하세요.
		
			1. 학생들의 총점 계산
				==> int[][] stud1 = new int[5][4];
			2. 과목별 총점...
				==> int[][] score1 = new int[3][6];
		
		-----------------------------------------------
		학생별 총점과 과목별 총점을 같이 기억할 배열을 만들어서 복사해서 처리하세요.
		
		-----------------------------------------------------------------------------------------
		이름	국어	영어	수학	총점 	평균	석차
		홍길동	95		75		100		
		고길동	80		60		50	
		둘리
		...
		총점
		평균	
		
		이름	
		국어
		영어
		수학
		총점
		
 */

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		/*ArrayList<ArrayList<Integer>> stud = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0 ; i < 5 ; i++ ) {
			stud.add(new ArrayList<Integer>());
			for(int j = 0 ; j < 3 ; j++ ) {
				stud.get(i).add((int)(Math.random()*30 + 70));
			}
		}
		
		for(ArrayList<Integer> l : stud) {
			System.out.println(l.toString());
		}
		*/
		
		String[] name = {"홍길동", "고길동", "둘리", "희동이", "마이콜"};
		
		Object[][] stud = new Object[5][4];
		
		// 이름 채우고
		for(int i = 0 ; i < stud.length ; i++ ) {
			stud[i][0] = name[i];
			for(int j = 1 ; j < stud[i].length ; j++ ) {
				stud[i][j] = (int)(Math.random()*30 + 70);
			}
		}
		
		for(Object[] o : stud) {
			System.out.println(Arrays.toString(o));
		}
		
		Object[][] studTotal = new Object[5][5];
		
		for(int i = 0 ; i < stud.length ; i++ ) {
			System.arraycopy(stud[i], 0, studTotal[i], 0, stud[i].length);
		}
		
		for(Object[] o : studTotal) {
			System.out.println(Arrays.toString(o));
		}
		System.out.println();
		// 총점 계산
		for(int i = 0 ; i < studTotal.length ; i++ ) {
			
			int total = 0 ;
			for(int j = 1; j <studTotal[i].length - 1 ; j++) {
				total += (int) studTotal[i][j]; 
			}
			studTotal[i][studTotal[i].length - 1] = total;
		}
		
		// Object[] 은 오후에 설명...
		for(Object[] o : studTotal) {
			System.out.println(Arrays.toString(o));
		}

		System.out.println();
		
		String[] ttl = {"이름", "국어", "영어", "수학", "총점"};
		Object[][] test = new Object[6][5];
		System.arraycopy(ttl, 0, test[0], 0, ttl.length);
		
		for(int i = 1 ; i < test.length; i++ ) {
			System.arraycopy(studTotal[i-1], 0, test[i], 0, studTotal[i-1].length);
		}
		
		for(Object[] o : test) {
			System.out.println(Arrays.toString(o));
		}
	}

}

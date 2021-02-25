package day08.ex;

import java.util.Arrays;

public class Ex05_02 {

	public static void main(String[] args) {
		String[] f1 = {"홍길동", "hong", "hong@increpas.com", "010-7777-7777", "M"};
		String[] f2 = {"고길동", "Gho", "gho@increpas.com", "010-8888-8888", "M"};
		String[] f3 = {"둘리", "dooly", "dooly@increpas.com", "010-2222-2222", "M"};
		String[] f4 = {"희동이", "dongee", "dongee@increpas.com", "010-1111-1111", "M"};
		String[] f5 = {"마이콜", "mikol", "mikol@increpas.com", "010-3333-3333", "M"};
		
		String[][] friend = new String[5][5];
		/*
			f1 ~ f5 데이터를 이용해서
			friend 배열의 데이터를 채우세요.
			
							친구1		친구2		친구3		친구4		친구5
			이름		:
			아이디		:
			메일		:
			전화번호	:
			성별		:
			
			==> 
			friend 에서 데이터를 꺼내서
			
			String[][] friend1 = new String[5][5];
			
						이름	아이디	메일	전화번호 	성별
			친구1	: 
			친구2   :
			친구3	:
			친구4	:
			친구5	:
		 */
		
		for(int i = 0 ; i < friend.length ; i++ ) {
			friend[i][0] = f1[i];
			friend[i][1] = f2[i];
			friend[i][2] = f3[i];
			friend[i][3] = f4[i];
			friend[i][4] = f5[i];
		}
		
		// 출력
		for(String[] s : friend) {
			System.out.println(Arrays.toString(s));
		}
		System.out.println();
		String[][] friend1 = new String[5][5];
		
		// 복사
		for(int i = 0 ; i < friend1.length ; i++ ) {
			for(int j = 0 ; j < friend1[i].length; j++ ) {
				friend1[i][j] = friend[j][i];
			}
		}
		
		// 출력
		for(String[] s : friend1) {
			System.out.println(Arrays.toString(s));
		}
	}

}

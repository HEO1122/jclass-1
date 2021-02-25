package day08.ex;

import java.util.Arrays;

public class Ex05 {

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
			
						이름	아이디	메일	전화번호 	성별
			친구1	: 
			친구2   :
			친구3	:
			친구4	:
			친구5	:
			
		 */
		/*
			해결 방법 1 ]
				for 반복문을 이용해서
				하나씩 데이터를 꺼내서 채워넣는 방법
				
			해결 방법 2 ]
				
				깊은 복사로 채워넣는 방법
			
		 */
		
		String[][] tmp = {f1, f2, f3, f4, f5};
		
		/*
		// 해결 방법1
		for(int i = 0 ; i < friend[0].length ; i++ ) {
			friend[0][i] = f1[i];
			friend[1][i] = f2[i];
			friend[2][i] = f3[i];
			friend[3][i] = f4[i];
			friend[4][i] = f5[i];
		}
		*/
		
		// 해결방법 1- 1 : 2차원배열로 묶어서 처리하는 방법
		for(int i = 0 ; i < tmp.length ; i++ ) {
			for(int j = 0 ; j < tmp[i].length ; j++ ) {
				friend[i][j] = tmp[i][j];
			}
		}
		
		/*
		// 해결방법 2 : 깊은 복사로 해결
		System.arraycopy(f1, 0, friend[0], 0, f1.length);
		System.arraycopy(f2, 0, friend[1], 0, f2.length);
		System.arraycopy(f3, 0, friend[2], 0, f3.length);
		System.arraycopy(f4, 0, friend[3], 0, f4.length);
		System.arraycopy(f5, 0, friend[4], 0, f5.length);
		 */
		
		for(String[] f : friend) {
			System.out.println(Arrays.toString(f));
		}
	}

}

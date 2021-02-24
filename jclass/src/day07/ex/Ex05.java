package day07.ex;

import java.util.Arrays;

/*
	문제 5]
		int[][] stud = new int[5][6];
		
		int[] score = new int[6];
		
		5학생의 5과목의 점수를 기억할 배열을 만들고
		랜덤하게 점수를 입력해서
		
		맨 마지막 방에는 총점을 계산해서 넣고
		
		stud[i] = score;
		
		총점이 제일 높은 사람부터 정렬을 해서
		출력하세요.
		
	참고 ]
		배열안에 다시 배열을 넣을 수 있다.
		이때 주의 사항은 배열에서 하나를 꺼낸것은 배열이라는 것을 기억해야 한다.
 */
public class Ex05 {

	public static void main(String[] args) {
		int[][] stud = new int[5][6];
		
		/*
		int[] num = new int[6];
		stud[2] = num;
//		stud[1];
		 */
		
		for(int i = 0 ; i < stud.length ; i++ ) {
//			stud[i] ==> 배열을 꺼내게 된다.
			for(int j = 0 ; j < stud[i].length - 1 ; j++ ) {
				// stud[i] ==> 배열
				// stud[i].length ==> i번째의 배열의 길이
				int score = (int)(Math.random()*41 + 60);
				stud[i][j] = score;
				
				// 1.
				stud[i][stud[i].length - 1] += score;
			}
//			System.out.println(Arrays.toString(stud[i]));
			
			// 총점 계산
			// 지금은 i 번째 방에 들어있는 배열을 꺼낸상태이다.
			/*
			// 2.
			for(int j = 0 ; j < stud[i].length - 1 ; j++ ) {
				int no = stud[i][j];
				stud[i][stud[i].length - 1] += no;
			}
			*/
			System.out.println(Arrays.toString(stud[i]));
		}
		
		// 정렬한다.
		// 방법은 총점이 제일 높은 사람이 맨 앞에 오도록 하면 된다.
		// 이때 총점이 높으면 주소를 맨 앞자리로 옮겨준다.
		for(int i = 0 ; i < stud.length - 1 ; i++ ) {
			for(int j = i+1 ; j < stud.length; j++ ) {
				int t1 = stud[i][stud[i].length - 1];
				int t2 = stud[j][stud[j].length - 1];
				/*
				int t1 = stud[i][5];
				int t2 = stud[j][5];
				*/
				if(t2 > t1) {
					int[] tmp = stud[i]; // 배열주소를 기억할 임시변수
					stud[i] = stud[j]; // j번째 주소를 i 번째에 기억. i번째와 j번째에는 같은 주소가 기억되어있다.
					stud[j] = tmp; // 임시변수에 기억된 주소를 j번째에 바꿔주고
				}
			}
		}
		System.out.println("########## 정렬 후 ##########");
		for(int[] t : stud) {
			System.out.println(Arrays.toString(t));
		}
		
		// 문제 ] 위결과를 첫번째 과목을 기준으로 정렬해서 출력하세요.
		
		
	}
}

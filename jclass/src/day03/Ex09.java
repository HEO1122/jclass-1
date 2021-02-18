package day03;

/*
문제 9 ]
	게시물을 게시판에 출력하는데
	하나의 게시판 페이지에는 게시물을 15개를 출력할 수 있다.
	게시물의 갯수를 랜덤하게 발생시킨후
	몇개의 페이지가 필요한지 계산해서 출력해주는 
	프로그램을 작성하세요.
 */
public class Ex09 {
	public static void main(String[] args) {
		// 게시물 수 변수
		int cnt = (int)(Math.random() * 152);
		// 페이지 수 변수
		int page = 0;
		/*
			게시물 갯수가 0 개인 경우는 적어도 1페이지는 필요하다.
			게시물 갯수가 15로 나누어 떨어지는 경우는 필요한 페이지수는 
				게시물갯수 / 15
			게시물 갯수가 15로 나누어서 떨어지지 않는 경우는
				게시물 갯수 / 15 + 1
		 */
		
		/*
		// if ~ else
		if(cnt == 0) { // 게시물 갯수가 0개인 경우
			page = 1;
		} else {
			if(cnt % 15 == 0) {
				page = cnt / 15;
			} else {
				page = cnt / 15 + 1;
			}
		}
		 */
		
		// if ~ else if
		if(cnt == 0) {
			page = 1;
		} else if(cnt % 15 == 0) { 
			// 이 부분을 실행한 경우는 cnt 가 0이 아닌 경우와 
			// 15로 나누어서 떨어지는경우 실행이 된다.
			page = cnt /15;
		} else {
			// 여기를 실행하는 경우는 cnt가 0이 아닌 경우 그리고
			// 15로 나누어서 떨어지지 않는 경우에 실행이 된다.
			page = cnt / 15 + 1;
		}
		
		System.out.println("총 게시글 수 : " + cnt);
		System.out.println("총 페이지 수 : " + page);
	}
}

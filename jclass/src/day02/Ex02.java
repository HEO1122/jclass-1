package day02;

/*
문제 2 ]
	사각형의 가로와 세로의 길이를 정수로 입력받아서
	넓이를 출력해주는 프로그램을 작성하세요.
 */
import java.util.*;
public class Ex02 {
	/*
		변수 만드는 규칙 ]
			
			변수는 몇개를 만들어도 상관이 없으나
			같은 이름의 변수는 만들 수 없다.
			(변수 선언은 이미 만들어진 이름으로는 절대로 할 수 없다.)
			
			예 ]
				int no = 10;
				...
				int no = 100; ===> 절대로 안된다.
				
				==> 
				 int no = 10;
				 ...
				 no = 100;
	 */
	public static void main(String[] args) {
		// 할일
		// 1. 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 가로 입력메세지 출력하고
		System.out.print("가로 : ");
		// 3. 가로 입력받아 변수에 기억하고
		int garo = sc.nextInt();
		/*
			데이터를 꺼내는 순간 Scanner 에는 데이터가 비워진다.
			따라서 다시 받아서 사용할 수 있다.
		 */
		// 2-1. 세로로 입력메세지 출력하고
		System.out.print("세로 : ");
		// 3-1. 세로 입력받아 변수에 기억하고
		int sero = sc.nextInt();
		// 4. 넓이 계산하고
		/*
			넓이  = 가로 * 세로 인데
			가로 와 세로는 모두 정수이고
			정수(int)와 정수(int)의 연산 결과는 정수(int)이므로
			넓이 역시 정수형 데이터가 될 것이다.
		 */
		int area = garo * sero;
		// 5. 출력하고
		System.out.printf("%3s : %5d\n%3s : %5d\n%3s : %5d", 
							"가로", garo, "세로", sero, "넓이", area);
	}
}

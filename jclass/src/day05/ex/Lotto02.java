package day05.ex;

/*
	로또 1게임을 만들어서 출력하세요.
	단, while 반복문으로 처리하세요.
 */
public class Lotto02 {
	public static void main(String[] args) {
		
		// 출력변수 만들고
		String lotto = "| ";
		
		// 카운트변수 만들고
		int i = 0 ;
		
		// 반복하고
		while(i < 6) {
			// 랜덤한 숫자 만들고
			int no = (int)(Math.random()*45 + 1);
			
			// 덧붙이고
			lotto = lotto + no + " | ";
			
			// 증감식 기술하고
//			i++;
			++i;
		}
		
		// 출력해주고
		System.out.println(lotto);
	}
}

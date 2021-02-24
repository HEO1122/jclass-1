package day06.ex;

/*
	문제 5 ]
		어느 농장에 닭과 양을 사육한다.
		총 마리수는 52마리인데
		다리수를 세어보니 144개이다.
		
		과연 이 농장의 닭과 양은 몇마리씩 있는지 계산해서 출력해주는 프로그램을 작성하세요.
		
	원리 ]
		닭이 0 마리라고 가정하고 다리수 계산하고
		닭이 1 마리라고 가정하고 다리수 계산하고
		....
		닭이 52마리라고 가정하고 다리수 계산하고....
		
		단, while 반복문으로 처리하세요.
		
		-- 옵션 ]
			for 명령으로 처리하세요.
 */
public class Ex05 {
	public static void main(String[] args) {
		// 각동물의 마리수를 기억할 변수를 만든다.
		
		/*
		// 닭의 마리수 증가
		for(int i = 0; i < 53 ; i++ ) {
			// 양의 마리수 증가
			for(int j = 0 ; j < 53 ; j++) {
				int ddari = i * 2;
				int ydari = j * 4;
				if( i + j == 52 & (ddari + ydari == 144)) {
					System.out.println("닭이 " + i + " 마리이고 양이 " + j + " 마리인 경우");
					break;
				}
			}
		}
		*/
		
		int dak = 0;
		
		int yang = 0;
		while(dak < 53) {
			yang = 0;
			System.out.println("닭 : " + dak);
			System.out.println("양 : " + yang);
			System.out.println();
			while(yang < 53) {
				int d = dak * 2;
				int y = yang * 4;
				
				if(d + y == 144 & dak + yang == 52 ) {
					System.out.println("닭이 " + dak + " 마리이고 양이 " + yang + " 마리인 경우");
					break;
				}
				yang++;
			}
			dak++;
		}
		
	}
}

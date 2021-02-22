package day06.ex;

/*

1.
    주사위 두개를 던져서 합이 6이 나오는 경우를 모두 출력하세요.
    
    	a		b
    	1		1
    			2
    			3
    			4
    			5
    			6
 
    	2		1
    			2
    			3
    			4
    			5
    			6
    	
6. 
    두자리의 랜덤한 숫자 10개를 발생시켜서 합을 구하는 프로그램을 작성하세요.

7. 
    1 ~ 100 까지의 합을 구하는데 홀수들만의 합을 구하세요.
    
8.
    첫날은 1원을 저축하고 다음날은 전날의 2배를 저축한다면
    몇일째 1억원을 저축할 수 있는지 출력해주는 프로그램을 작성하세요.
    
    
 */


//     주사위 두개를 던져서 합이 6이 나오는 경우를 모두 출력하세요.
public class Ex04 {
	public static void main(String[] args) {
		int i = 0;
		
		loop:
		while(i < 6) {
			// a 주사위 눈의 갯수 : i
			i++;
			int j = 0;
			while(j < 6) {
				j++;
				if(i + j == 6) {
					System.out.println("a 주사위 :  " + i + " | b 주사위 : " + j + " - 일 때... ");
//					continue loop;
					break;
				}
			}
		}
	}
}

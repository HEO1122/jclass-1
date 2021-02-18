package day03;

/*
	문제 11 ]
		3자리 숫자를 입력받아서
		이 숫자에서 가장 가까운 100의 배수를 만들기 위해서는
		얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
		
		예 ]
			241		- 200이 가까우므로 41 빼야 한다.
			
		==>
			100으로 나눈 나머지가 50보다 작으면
				나머지를 빼주면 되고
			50 보다 크면
				100에서 나머지를 뺀 수를 더해준다.
				
				
			123	--> 100으로 나눈 나머지 23
					가까운 100의 배수는 100이므로
					123에서 23을 빼주면 된다.
					
			256	--> 100으로 나눈 나머지가 56
					가까운 100의 배수는 300이므로
					256 + (100 - 56) ==> 300
					
			따라서 기준은 50이 될 것이고
			50 보다 작은 경우는 나머지를 빼주면 되고
			그 이외의 경우는 100에서 나머지를 뺀 값을 더해주면 된다.
 */
// 0. 입력받을 준비 클래스 사용 준비
import java.util.*;
public class Ex11 {
	public static void main(String[] args) {
		// 할일
		// 1. 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 입력받아서 변수에 기억시키고
		System.out.print("세자리 숫자 입력 : ");
		int no = sc.nextInt();
		// 3. 나머지 변수에 기억시키고
		int rest = no % 100;
		// 4. 조건에 따라서 처리하고
		int result = 0;
		String msg = "";
		/*
		int result = (rest < 50) ? (no - rest): (no + (100 - rest));
		String msg = (rest < 50) ? 
						result + " 와 가까우므로 " + rest + " 빼줘야한다." : 
						result + " 와 가까우므로 " + (100 - rest) + " 를 더해줘야 한다.";
		*/
		
		if(rest < 50) {
			result = no - rest;
			msg = result + " 와 가까우므로 " + rest + " 빼줘야한다.";
		} else {
			result = no + (100 - rest);
			msg = result + " 와 가까우므로 " + (100 - rest) + " 를 더해줘야 한다.";
		}
		
		// 5. 결과 출력하고
		System.out.println("입력한 숫자 " + no + " - " + msg);
		
	}
}

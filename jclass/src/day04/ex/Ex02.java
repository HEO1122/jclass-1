package day04.ex;

/*
	0 ~ 25 까지의 수를 랜덤하게 하나를 발생시켜서
		
0		0 - 0 입니다.
3		2의 배수 - 2의 배수입니다.
2		3의 배수 - 3의 배수입니다.
1		2와 3의 배수인 경우 - 2와 3의 배수입니다. - 6의 배수
		그이외의 경우 - 나머지 수입니다.
	로 출력해주는 프로그램을 작성하세요.
 */
public class Ex02 {
	public static void main(String[] args) {
//		int no = (int)(Math.random()* (25 - 0 + 1) + 0);
		int no = (int)(Math.random()* 26);
		String result = "";
		
		/*
		int code = 0;
		if(no == 0 ) {
			code = 0;
		} else if( no % 6 == 0) {
			code = 1;
		} else if(no % 2 == 0) {
			code = 3;
		} else if(no % 3 == 0) {
			code = 2;
		} else {
			code = 4;
		}
		
		switch(code) {
		case 0:
			result = "0 입니다.";
			break;
		case 1:
			result = "2와 3의 배수입니다.";
			break;
		case 2:
			result = "3의 배수입니다.";
			break;
		case 3:
			result = "2의 배수입니다.";
			break;
		default:
			result = "나머지 경우입니다.";
		}
		*/
		
		switch(no % 6) {
		case 0:
			switch(no) {
			case 0:
				result = "0 입니다.";
				break;
			default:
				result = "2와 3의 배수입니다.";
			}
			break;
		case 4:
			result = "2의 배수입니다.";
			break;
		case 3:
			result = "3의 배수입니다.";
			break;
		case 2:
			result = "2의 배수입니다.";
			break;
		default:
			result = "나머지 수입니다.";
		}
		System.out.println("발생한 수 " + no + " 는 " + result);
	}
}

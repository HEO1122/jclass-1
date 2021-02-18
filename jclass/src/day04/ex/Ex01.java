package day04.ex;

/*
	String클래스의 equals() 함수를 사용해서 처리하세요.
	
	문자열을 입력받아서
		"M" - 남자입니다.
		"남" - 남자입니다.
		"남자" - 남자입니다.
		"남성" - 남자입니다.
		"F" - 여자입니다.
		"여" - 여자입니다.
		"여자" - 여자입니다.
		"여성" - 여자입니다.
		이외의 경우는 - 잘못입력했습니다.
	가 출력되는 프로그램을 작성하세요.
	
	if~ else if 구문
	switch ~ case 구문으로 처리하세요.
 */
import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		// 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 입력받고
		System.out.print("성별 입력 : ");
		String gen = sc.nextLine();
		String result = "";
		
		/*
		// 비교해서 처리하고
		switch(gen) {
		case "M":
			result = "남자입니다.";
			break;
		case "남":
			result = "남자입니다.";
			break;
		case "남자":
			result = "남자입니다.";
			break;
		case "남성":
			result = "남자입니다.";
			break;
		case "F":
			result = "여자입니다.";
			break;
		case "여":
			result = "여자입니다.";
			break;
		case "여자":
			result = "여자입니다.";
			break;
		case "여성":
			result = "여자입니다.";
			break;
		default:
			result = "잘못입력했습니다.";
		}
		*/
		
		/* if else if 구문으로 처리 */
		if(gen.equals("M")) {
			// gen == "M" 이렇게 비교하는 것은 주소를 비교하는 것이기 때문에
			// 원하는 결과가 안나올 수 있다.( <== 데이터자체를 비교하지 않는다. )
//			int no = 10;
			result = "남자입니다.";
		} else if(gen.equals("남")) {
			result = "남자입니다.";
		} else if(gen.equals("남자")) {
			result = "남자입니다.";
		} else if(gen.equals("남성")) {
			result = "남자입니다.";
		} else if(gen.equals("F")) {
			result = "여자입니다.";
		} else if(gen.equals("여")) {
			result = "여자입니다.";
		} else if(gen.equals("여자")) {
			result = "여자입니다.";
		} else if(gen.equals("여성")) {
			result = "여자입니다.";
		} else {
			result = "잘못입력했습니다.";
		}
		
//		System.out.println(no);
		
		/*
			*****
			참고 ]
				자바에서는 블럭({}) 안에서 만들어진 변수는
				블럭 밖으로 빠져나가면 사라지는 변수이다.
				
				블럭 밖에서 사용해야할 변수를 
				블럭 안에서 처리해야 하는 경우는
				반드시 블럭 밖에서 변수를 만들어주고
				블럭안에서 처리해줘야 한다.
		 */
		// 결과 출력하고
		System.out.println("입력한 문자열 : " + gen);
		System.out.println(result);
	}
}

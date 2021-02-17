package day03;

/*
	0 ~ 255 사이의 아스키 코드값을 가지는 랜덤한 문자를 발생시켜서
	이 문자가 영문자 인지 아닌지 판별해서 출력하세요.
 */
public class Ex02 {
	public static void main(String[] args) {
		char ch = (char)(Math.random()*256);
		
		/*
			아스키코드값 중
			영문자는 
			'A' ~ 'Z' 사이에 특수문자들이 있고 'a' ~ 'z' 
		 */
		
//		String result = (ch < 'A' || ch > 'z' || (ch > 'Z' && ch < 'a' )) ? "특수 문자 입니다." : "영문자입니다.";
		String result = (ch < 'A' || ch > 'z') ? 
								"특수문자입니다." : 
								((ch > 'Z' && ch < 'a') ? 
										"특수문자입니다." : 
										"영문자입니다."
								)
						;
	}
}

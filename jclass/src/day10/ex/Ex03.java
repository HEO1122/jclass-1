package day10.ex;

/*
	1. width 에 정수를 입력받아 대입해주는 함수
	2. height에 정수를 입력받아 대입해주는 함수
	3. width와 height 를 이용해서 사각형의 면적을 계산하고 반환해주는 함수
	4. 정수 두개를 입력받아서 위에서 만든 함수를 사용해서 사각형의 가로, 세로를 셋팅하고
		가로, 세로, 면적을 출력해주는 기능의 함수
	
	프로그램을 제작하고 실행하세요.
 */
public class Ex03 {
	int width, height;
	public Ex03() {
		getData(getSoo(), getSoo());
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
	
	// 10  ~ 45 사이의 정수를 랜덤하게 발생시켜서 반환해주는 함수
	public int getSoo() {
		return (int)(Math.random()* 36 + 10);
	}
	
	// 가로 셋팅 함수
	public void setWidth(int w) {
		width = w;
	}
	
	// 세로 셋팅함수
	public void setHeight(int h) {
		height = h;
	}
	
	public double getArea() {
		// 전역변수 width와 height를 이용해서 면적을 계산해서 반환해주는 함수
		double area = width * height;
		
		return area;
	}
	
	// 셋팅하고 출력해주는 함수
	public void getData(int w, int h) {
		// 가로셋팅
		setWidth(w);
		// 세로셋팅
		setHeight(h);
		// 면적 구하고
		double area = width * height;
		// 출력하고
		System.out.println("사각형 가로 : " + width );
		System.out.println("사각형 세로 : " + height );
		System.out.println("사각형 면적 : " + area );
	}
}

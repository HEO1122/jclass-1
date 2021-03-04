package day13;

public class Sagak01 {
	private int width, height, area;
	
	public Sagak01() {
		// 기본 생성자가 호출되어서 객체가 만들어지는 경우는
		// 5 ~ 20 사이의 정수로 가로세로가 셋팅이 되어서 사각형이 만들어지도록
		// 기본생성자에서 정의 해보자.
		/*
		width = (int)(Math.random()* 16 + 5);
		height = (int)(Math.random()* 16 + 5);
		setArea();
		*/
//		Sagak01((int)(Math.random()* 16 + 5), (int)(Math.random()* 16 + 5));
//		System.out.println("### 여기는 Sagak01 ###"); // this()  이전에 명령이 오면 에러가 발생한다.
		this((int)(Math.random()* 16 + 5), (int)(Math.random()* 16 + 5));
		System.out.println("### 여기는 Sagak01 ###");
	}
	
	public Sagak01(int w, int h) {
		width = w;
		height = h;
		setArea();
		toPrint();
	}
	
	public void setArea() {
		area = width * height;
	}
	
	public void toPrint() {
		System.out.printf("가로 : %2d, 세로 : %2d, 면적 : %3d\n", width, height, area);
	}
	public static void main(String[] args) {
		new Sagak01();
//		new this(); // 생성자 내부가 아니기 때문에 사용 못한다.
	}

}

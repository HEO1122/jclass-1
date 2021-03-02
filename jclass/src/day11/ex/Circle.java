package day11.ex;

public class Circle {
	public int rad;
	public double arround, area;
	
	public Circle() {
		// 반지름 랜덤하게 셋팅하고
		setRad();
		// 둘레 셋팅하고
		setArround();
		// 면적 셋팅하고
		setArea();
	}
	
	// 반지름 셋팅해주는 함수
	public void setRad() {
		rad = (int)(Math.random()* 11 + 5);
	}
	
	// 둘레 셋팅하는 함수
	public void setArround() {
		arround = 2 * rad * Math.PI;
	}
	
	// 면적 셋팅하는 함수
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	
	// 출력하는 함수
	public void toPrint() {
		System.out.printf("반지름 : %2d, 둘레 : %5.2f, 넓이 : %5.2f\n", rad, arround, area);
	}
}

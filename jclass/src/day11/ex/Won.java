package day11.ex;

public class Won {
	public int rad;
	public double arround, area;
	
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

package day11.ex;

public class Semo {
	// 정보기억할 변수 선언
	public int width, height;
	public double area;
	
	// 기본생성자 : 이 클래스가 객체가 될때 변수들의 기본값을 셋팅해주는 역할
	public Semo() {
		width = (int)(Math.random()*11 + 5);
		height = (int)(Math.random()*11 + 5);
		setArea();
	}
	
	// 면적 구하는 함수
	public void setArea() {
		area = width * height / 2.0;
	}
}

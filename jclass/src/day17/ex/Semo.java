package day17.ex;

import java.text.DecimalFormat;

public class Semo implements Figure {
	private int width, height;
	private double area;
	
	// 생성자
	public Semo() {}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = width * height * 0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}

	public String getsArea() {
		DecimalFormat form = new DecimalFormat("##,###,###.##");
		return form.format(area);
	}
	
	@Override
	public void toPrint() {
		System.out.println(this);
		// this 변수를 입력하면 이 객체의 toString() 자동호출...
	}
	@Override
	public String toString() {
		return "삼각형 : 밑변 - " + width + ", 높이 - " + height + ", 면적 - " + getsArea();
	}
	
	@Override
	public boolean equals(Object obj) {
		return width == ((Semo) obj).getWidth();
	}
}

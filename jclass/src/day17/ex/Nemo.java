package day17.ex;

import java.text.*;
public class Nemo implements Figure {
	private int width, height;
	private double area;
	
	// 생성자
	public Nemo() {}
	public Nemo(int width, int height) {
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
		this.area = width * height;
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
	}
	
	@Override
	public String toString() {
		return "사각형 : 가로 - " + width + ", 세로 - " + height + ", 면적 - " + getsArea();
	}

	@Override
	public boolean equals(Object obj) {
		return height == ((Nemo) obj).getHeight();
	}
}

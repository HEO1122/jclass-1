package day17.ex;

import static java.lang.Math.*;
import java.text.*;

public class Circle implements Figure {
	private int rad;
	private double arround, area;
	
	public Circle() {}
	public Circle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}

	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround() {
		this.arround = 2 * rad * PI;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = rad * rad * PI;
	}
	public void setArea(double area) {
		this.area = area;
	}
		
	public String getsData(double data) {
		DecimalFormat form = new DecimalFormat("##,###,###.##");
		return form.format(data);
	}
	
	@Override
	public void toPrint() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "동그라미 : 반지름 - " + rad + ", 둘레 - " + getsData(arround) + ", 면적 - " + getsData(area);
	}

	@Override
	public boolean equals(Object obj) {
		return area == ((Circle) obj).getArea();
	}
}

package day19;

public class Samgak implements Figure, Comparable {
	private int width, height;
	private double area;
	
	// 생성자
	public Samgak() {}
	public Samgak(int width, int height) {
		// 밑변과 높이를 입력해주면서 객체를 만들수 있는 생성자
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
		this.area = width * height / 2.0;
	}
	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public void toPrint() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "삼각형 : 밑변 - " + width + ", 높이 - " + height + ", 넓이 - " + area;
	}
	
	@Override
	public boolean equals(Object o) {
		return area == ((Samgak) o).getArea();
	}
	@Override
	public int compareTo(Object o) {
		Samgak s = (Samgak) o;
		double afterArea = s.getArea();
		
		int result = (afterArea - area < 0) ? 1 : ( (afterArea - area == 0 )? 0 : -1 );
		
		return result;
	}
}

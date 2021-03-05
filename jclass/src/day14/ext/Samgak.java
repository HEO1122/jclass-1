package day14.ext;

public class Samgak extends Figure {
	private int width, height;
	private double area;
	
	public Samgak() {}
	public Samgak(int width, int height) { // 기본생성자 오버로딩
		this.width = width;
		this.height = height;
		// 삼각형의 밑변과 높이가 정해지면 면적도 계산이 되므로 여기서 처리하자.
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
	// getArea() 오버라이딩
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() { // setArea() 오버로딩
		this.area = width * height / 2.0;
	}
	public void toPrint() { // Figure.toPrint() 오버라이딩(함수의 재정의)
		System.out.printf("밑변이 %2d 이고 높이가 %2d 이고 넓이가 %5.1f 인 삼각형\n", 
																	width, height, area);
	}
}

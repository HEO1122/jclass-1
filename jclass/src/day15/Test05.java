package day15;

public class Test05 {

	public Test05() {
		Grand g1 = new Son();
		g1.abc();	// ###### 여기는 Father 클래스의 abc() 함수 #####
		
		Grand g2 = new Father();
		g2.abc();	// ###### 여기는 Father 클래스의 abc() 함수 #####
		
		Grand g3 = new Son();
//		g3.xyz();	// Grand 클래스에는 xyz() 함수가 멤버로 존재하지 않기 때문에 사용할 수 없다.
	
		System.out.println("g1 instanceof Grand : " + (g1 instanceof Grand));
		System.out.println("g1 instanceof Father : " + (g1 instanceof Father));
		System.out.println("g2 instanceof Son : " + (g2 instanceof Son));
		
		System.out.println("g1 : " + g1);
	}

	public static void main(String[] args) {
		new Test05();
	}

}

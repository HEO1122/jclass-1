package day16;

public class Test04 {

	public Test04() {
//		TpInner01.GInner gi01 = TpInner01.new GInner();
		TpInner01 t1 = new TpInner01();
		TpInner01.GInner gi01 = t1.new GInner(); // 전역 내부클래스 사용방법
		System.out.println("GInner.no1 : " + gi01.no1);
		System.out.println();
		
		// Top Level Inner Class
		TpInner01.TPCls t2 = new TpInner01.TPCls();
		
		t2.xyz();
	}

	public static void main(String[] args) {
		new Test04();
	}

}

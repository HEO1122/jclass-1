package day13;

public class Test07_01 {
	String args = "Test";
	public Test07_01() {
		
	}
	
	// 일반함수 abc
	public void abc() {
		System.out.println("나는 일반 함수 : abc() ");
	}
	
	public static void main(String[] args) {
		Test07_01 t07 = new Test07_01();
		int no = Test07.no;
//		int num = Test07.num;
		int no2 = Test07.calc();
//		abc();
		
		Test07 t1 = new Test07();
		Test07 t2 = new Test07();
		
		System.out.println("t1.no : " + t1.no);
		System.out.println("t2.no : " + t2.no);
		
		t1.no = 50;
		System.out.println("### no 수저후 ###");
		System.out.println("t1.no : " + t1.no);
		System.out.println("t2.no : " + t2.no);
		
		t07.args = "test07";
	}

}

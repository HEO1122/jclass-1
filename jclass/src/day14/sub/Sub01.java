package day14.sub;

class Sub01 {
	private int no = 10;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	// 여기까지가 변수의 은닉화...
	
	public Sub01() {
		System.out.println("*** 여기는 Sub01 기본 생성자 ***");
	}

}

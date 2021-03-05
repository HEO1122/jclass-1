package day14;
/*
	JFrame을 상속받은 클래스를 만들어보자.
 */
import javax.swing.*;
public class Test03 extends JFrame {

	public Test03() {
//		super();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼 기능구현
		setSize(450, 500); //  창 사이즈
		// JFrame 을 상속 받았기 때문에
		// 자동적으로 JFrame의 멤버는 이클래스가 가지고 있는 상태가 됬다.
		// 따라서 상속해준 클래스의 멤버는 모두 사용할 수 있게 됬다.
		setVisible(true); // 만들어진 창이 보여지게...
	}
	
	public static void main(String[] args) {
		new Test03();
	}

}

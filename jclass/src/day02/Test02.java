package day02;

/*
	친구의 이름을 입력받아서(showInputDialog()
	메시지 창을 띄워서 출력(showMessageDialog())해주는 프로그램을 작성하세요.
 */
import javax.swing.*; // 사용할 클래스의 위치를 알려주는 명령
public class Test02 {
	
	public static void main(String[] args) {
		// 할일
		// 입력창을 띄워서 입력데이터를 변수에 기억시킨다.
		String name = JOptionPane.showInputDialog("친구의 이름을 입력하세요!");
		
		System.out.println("입력받은 친구의 이름 : " + name);
		// 출력창을 띄워서 데이터를 출력한다.
		JOptionPane.showMessageDialog(null, "친구이름 : " + name);
	}
}

package day02;

/*
���� 2 ]
	�簢���� ���ο� ������ ���̸� ������ �Է¹޾Ƽ�
	���̸� ������ִ� ���α׷��� �ۼ��ϼ���.
 */
import javax.swing.*;
public class Ex02_01 {
	public static void main(String[] args) {
		// ����
		// 1. �Էµ��� �غ��ϰ�
		/*
			���⼭�� javax.swing ������ �̹� �ڵ��Ǿ��ִ�
			JOptionPane �̶�� Ŭ������
			���ڿ��� �޼����� �Է¹޴� ����� �Լ�
			showInputDialog() �� ����ؼ� ���ڿ��� �Է¹޵����Ѵ�.
			
			�� �Լ��� GUI â�� ������� �Է¹޴´�.
			(�Է¸޼��� â�� ���� �Է¹޴� �Լ��̴�.)
			
			�̶� �Էµ����ʹ� ���ڿ��� �Է¹ް� �ȴ�.
			
			���� ������ ������ ���� 
			���� ����� Ÿ������ ��ȯ������� �Ѵ�.
		 */
		// 2. �Է¸޼��� ����ϰ�
			// showInputDialog() �Լ��� �Ű������� �ԷµǴ� ���ڿ���
			// �Է¸޼����� ��µǱ� ������ ���⼭�� �ʿ����.
		// 3. �Է¹޾� ������ ����ϰ�
		String garo = JOptionPane.showInputDialog("���θ� �Է��ϼ���!");
		String sero = JOptionPane.showInputDialog("���θ� �Է��ϼ���!");
		
		// ������ ��ȯ�ϰ�
		int width = Integer.parseInt(garo);
		int height = Integer.parseInt(sero);
		
		// 4. ���� ����ϰ�
		int result = width * height;
		// 5. ����ϰ�
		System.out.printf("%3s : %4d\n%3s : %4d\n%3s : %4d",
							"����",width,"����",height,"����",result);
		
		// ��¿� ���ڿ� ���� ������ ����ϰ�
		String msg = "���� : " + width + "\n���� : " + height + "\n���� : " + result;
		// ����ϰ�
		JOptionPane.showMessageDialog(null, msg);
		/*
			��¿��� GUI �� ���ۿ� ���Ǵ� JOptionPane Ŭ������ �Լ��� ����ؼ� ó���Ѵ�.
			showMessageDialog()
		 */
	}
}

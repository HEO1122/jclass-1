package day02;

/*
	�������� �Է�(����)�޾Ƽ�
	���� ���̸� ������ִ� ���α׷��� �ۼ��ϼ���.
 */

import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		// ����
		// 1. �Էµ��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// 2. �Է¸޼����� ������ְ�
		System.out.print("���� ������ : ");
		// 3. �Է¹ް�
		int rad = sc.nextInt();
		// ==> �� ��쵵 ���ڰ� �ƴ� �ٸ� ���� �Ǵ� �Ǽ����·� �Է��ϸ� ����... 
		// 4. ���� ����ϰ�
		double area = rad * rad * 3.14;
		// 5. ���� ����ϰ�
		System.out.println("�������� " + rad + " �� ���� ���̴� " +
							area + " �Դϴ�.");
	}
}

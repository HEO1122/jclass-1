package day17;

import static java.lang.Math.*; // static import
public class Test04 {

	public Test04() {
		for(int i = 0 ; i < 10 ; i++ ) {
			int no = (int)((random()*10 + 1) * PI);
			System.out.println(no);
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}

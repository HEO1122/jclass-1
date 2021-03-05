package day14.ext;

import static java.lang.Math.*;
public class Test09 {

	public Test09() {
		Figure f1 = new Samgak((int)(random()*10) + 1, (int)(random()*10) + 1);
		f1.toPrint();
	}

	public static void main(String[] args) {
		new Test09();
	}

}

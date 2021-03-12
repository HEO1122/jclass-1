package day17.ex;

import static java.lang.Math.*;
public class Ex03 {

	public Ex03() {
		Figure[] fig = new Figure[10];
		setFig(fig);
		
		for(Figure f : fig) {
			f.toPrint();
		}
	}
	
	// Figure 배열 채워주는 함수
	public void setFig(Figure[] f) {
		loop:
		for(int i = 0 ; i < f.length ; i++ ) {
			int no = (int)(random()*3);
			switch(no){
			case 0:
				f[i] = new Circle((int)(random()*10 + 1));
				break;
			case 1:
				f[i] = new Semo((int)(random()*10 + 1), (int)(random()*10 + 1));
				break;
			case 2:
				f[i] = new Nemo((int)(random()*10 + 1), (int)(random()*10 + 1));
				break;
			}
			
			String sCls = f[i].getClass().getName();
			
			for(int j = 0 ; j < i ; j++ ) {
				String pre = f[j].getClass().getName();
				if(pre.equals(sCls)) {
					if(f[i].equals(f[j])) {
						i--;
						continue loop;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}

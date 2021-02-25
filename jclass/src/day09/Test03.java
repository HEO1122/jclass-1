package day09;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		int[][] no = new int[10][2];
		
		loop:
		for(int i = 0 ; i < 10 ; i++ ) {
			no[i][0] = (int)(Math.random()*100 + 1);
			for(int j = 0 ; j < i ; j++) {
				if(no[j][0] == no[i][0]) {
					i--;
					continue loop;
				}
			}
			no[i][1] = 1;
		}
		
		System.out.println(Arrays.deepToString(no));
	}

}

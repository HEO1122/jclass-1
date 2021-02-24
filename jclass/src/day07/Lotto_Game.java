package day07;

import javax.swing.*;
public class Lotto_Game {

	public static void main(String[] args) {
		while(true) {
			String sno = JOptionPane.showInputDialog("금액을 입력하세요!");
			if(sno.equals("q")) {
				JOptionPane.showMessageDialog(null, "*** 프로그램을 종료합니다 ! ***");
				break;
			}
			int money = 0;
			int cnt = 0;
			int page = 0 ;
			try {
				money = Integer.parseInt(sno);
				cnt = money / 1000;
				page = (cnt % 5 == 0)? cnt / 5 : cnt / 5 + 1;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "### 숫자형식이 아닙니다. ###");
				continue;
			}
			
			for(int p = 0 ; p < page; p++) {
				int row = (p == page - 1)? ((cnt % 5 == 0) ? 5 : cnt % 5) : 5 ;
				int[][] lotto = new int[row][6];
				for(int i = 0 ; i < row; i++ ) {
					loop:
					for(int j = 0 ; j < 6; j++ ) {
						lotto[i][j] = (int)(Math.random()*45 + 1);
						// 중복 체크
						for(int k = 0 ; k < j ; k++ ) {
							if(lotto[i][j] == lotto[i][k]) {
								j--;
								continue loop;
							}
						}
						
					}
					
					// 정렬하기
					for(int j = 0 ; j < lotto[i].length - 1 ; j++) {
						for(int k = j + 1 ; k < lotto[i].length ; k++ ) {
							if(lotto[i][j] > lotto[i][k]) {
								int tmp = lotto[i][j];
								lotto[i][j] = lotto[i][k];
								lotto[i][k] = tmp;
							}
						}
					}
				}
				
				String msg = "";
				for(int[] t : lotto) {
					for(int tmp : t) {
						msg = msg + tmp + " ";
					}
					msg = msg + "\n";
				}
				
				JOptionPane.showMessageDialog(null, msg);
			}
		}
	}

}

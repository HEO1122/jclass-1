package day05.ex;

/*
	구구단을 출력하는데
	
	2 x 1  = 2 		3 x 1 = 3		4 x 1 = 4		5 x 1 = 5
	2 x 2  = 4		3 x 2 = 6		4 x 2 = 8		5 x 2 = 10
	...  
	2 x 9  = 18		3 x 9 = 27		4 x 9 = 36		5 x 9 = 45
	
	6 x 1 = 6		7 x 1 = 7		8 x 1 = 8		9 x 1 = 9
	...
	
 */
public class Extra03 {
	public static void main(String[] args) {
		for(int i = 0 ; i < 2 ;i++) {
			for(int j = 0 ; j < 9 ; j++) {
				for(int k = 0 ; k < 4 ; k++ ) {
					int dan = 4*i + k + 2;
					String str = (k == 3) ? "\n" : "\t";
//					String gugu = dan + " x " + (j + 1) + " = " + (dan *(j+1));
					System.out.printf("%2d %s %2d %s %2d %s",
										dan,"x", (j + 1), "=", dan *(j+1), str);
				}
			}
			System.out.println();
		}
	}
}

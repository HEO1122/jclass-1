package day06;

/*

**			:  i 가 0일 때
****		:  i 가 1일 때
******
********
**********

==> a * 0 + b*0 + c 
	
	j < (i + 1) * 2 

 */
public class Test01 {
	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < (i + 1) * 2 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

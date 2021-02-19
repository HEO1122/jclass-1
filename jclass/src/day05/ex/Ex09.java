package day05.ex;

/*
 +1 +1
0 1 2 3 4	
1 2 3 4 5	+1
2 3 4 5 6	+1
3 4 5 6 7	+1
4 5 6 7 8	+1

----------------------

1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9


x * i + y * j + z ==> i + j + z		==> i: 0 , j: 0 ==> 1 따라서 x=1
 */
public class Ex09 {
	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print(i + j + 1 + " ");
			}
			System.out.println();
		}
	}
}

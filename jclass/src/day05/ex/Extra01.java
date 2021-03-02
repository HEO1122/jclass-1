package day05.ex;

/*
	extra 01 ]
1	
	*
	**
	***
	****
	*****
	
----------------------------------------------
2
	*****
	****
	***
	**
	*
	
-------------------------------------------------
3
####*
###**
##***
#****
*****

*	i	

4	0	
3	1
2	2
1	3
0	4

j > 4 - ( 1 + i)

f(x, y) = a*x + b*y + c


a * i + b * j + c



---------------------------------------------------
4
			i   ' '
 *****		0	0
  ****		1	1
   ***		2	2
    **		3	3
     *		4	4
---------------------------------------------------
 무한도전 ]
5. 	홀수를 입력하면 그 수에 해당하는 마름모를 출력해주는 프로그램...
 
    *
   ***
  *****
 *******
  *****
   ***
    *

예 ]
	3
 *
***
 *

	5
  *
 ***
*****
 ***
  *

 */
public class Extra01 {
	public static void main(String[] args) {
		/*
		for(int i = 0 ; i < 5; i++ ) {
			for(int j = 0 ; j < (i + 1); j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2
		for(int i = 0 ; i < 5; i++ ) {
			for(int j = 0 ; j < 5 - i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		 */
		
		/*
		// 3
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++ ) {
				char ch = ' ';
				if(j > (3 - i)) {
					ch = '*';
				}
				System.out.print(ch);
			}
			System.out.println();
		}
		*/
		
		// 4.
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5; j++ ) {
				char ch = '*';
				if(j < i) {
					ch = ' ';
				}
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
}

package day05;

/*

11111	- i : 0
22222	- i : 1
33333	- i : 2
44444
55555

 */
public class Test16 {
	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ; j++ ) {
				System.out.print((i + 1) + " ");
			}
			System.out.println();
		}
	}
}

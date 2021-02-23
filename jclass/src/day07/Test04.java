package day07;


/*
	'A' ~ 'J'  까지의 문자를 랜덤하게 100개 발생한 후
	각각의 문자가 몇개씩 발생했는지 
	횟수를 출력하고
	그래프 형식으로 출력하세요.
		
		예 ]
			
			A [7] 	: *******
			B [10] 	: ********** 
 */
public class Test04 {

	public static void main(String[] args) {
		// 문자를 기억할 배열을 만드는 것이 아니고
		// 10개의 문자가 발생한 카운트를 기억할 배열을 만든다.
		int[] cnt = new int[10];
		
		// 100회 반복한다.
		for(int i = 0 ; i < 100 ; i++ ) {
			// 랜덤하게 문자발생시킨다.
			/*
				참고 ]
					A : A + 0 : A - A
					B : A + 1 : B - A
					C : A + 2 : C - A
			 */
			
			char ch = (char)(Math.random() * 10 + 'A');
			// 만약 발생한 문자가 C  라면 세번째 방에 +1 해주면 된다.
			// 이때 세번째 방의 위치값은 'C' - 'A'
			
			// 인데스
			int idx = ch - 'A';
			
			// 인덱스에 해당하는 방의 카운트 +1
			cnt[idx] += 1;
		}
		
		// 이제 각 문자의 출현 횟수를 출력한다.
		for(int i = 0 ; i < cnt.length ; i++ ) {
			int count = cnt[i];
			System.out.println((char)('A' + i) + " : " + count);
		}
		System.out.println();
		// 그래프 형식으로 출력
		for(int i = 0 ; i < cnt.length ; i++) {
			char ch = (char)('A' + i);
			/*
				i 		: 0 1 2 ... 9
				문자 	: A B C ... J
				A 		: 'A' + 0 		: 'A'의 아스키 코드값은 65
				B		: 'A' + 1		: 65 + 1 ==> 66 ==> 문자로 변형하면 B
			 */
			int count = cnt[i];
			
			// 문자 출력하고
			System.out.print(ch + " : ");
			// * 횟수만큼 출력하고
			for(int j = 0 ; j < count; j++ ) {
				System.out.print("*");
			}
			// 줄바꿈하고
			System.out.println();
		}
	}

}

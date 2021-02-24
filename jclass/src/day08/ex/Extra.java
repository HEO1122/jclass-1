package day08.ex;

/*
	extra 1]
		
		다섯명의 친구의 정보를 기억할 배열을 만들고
		친구의 이름을 입력하면 
		해당 친구의 정보를 출력해주는 프로그램을 작성하세요.
		기억할 정보는
			이름, 아이디, 이메일, 전화번호, 성별
		을 기억하도록 하고
		하나의 배열로 관리하도록 하세요.
 */
import java.util.*;
public class Extra {

	public static void main(String[] args) {
		// 한사람당 다섯개의 정보를 기억하는 배열을 다섯명을 관리할 배열을 만든다.
		String[][] friend = {
				{"홍길동", "hong", "hong@increpas.com", "010-7777-7777", "M"},
				{"고길동", "Gho", "gho@increpas.com", "010-8888-8888", "M"},
				{"둘리", "dooly", "dooly@increpas.com", "010-2222-2222", "M"},
				{"희동이", "dongee", "dongee@increpas.com", "010-1111-1111", "M"},
				{"마이콜", "mikol", "mikol@increpas.com", "010-3333-3333", "M"}
		};
		
		// 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 이름입력받고
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();
			
			// 반복 종료 조건
			if(name.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			/*
			for(int i = 0 ; i < friend.length; i++ ) {
				// 한명씩 이름을 꺼내본다.
				String tmp = friend[i][0];
				
				if(tmp.equals(name)) {
					System.out.printf("%-8s : %3s\n", "친구이름", friend[i][0]);
					System.out.printf("%-8s : %3s\n", "아 이 디", friend[i][1]);
					System.out.printf("%-8s : %3s\n", "이 메 일", friend[i][2]);
					System.out.printf("%-8s : %3s\n", "전화번호", friend[i][3]);
					System.out.printf("%-8s : %3s", "친구성별", friend[i][4]);
				}
			}
			*/
			int idx = 0;
			
			switch(name) {
			case "홍길동":
				idx = 0;
				break;
			case "고길동":
				idx = 1;
				break;
			case "둘리":
				idx = 2;
				break;
			case "희동이":
				idx = 3;
				break;
			case "마이콜":
				idx = 4;
				break;
			}

			System.out.printf("%-8s : %3s\n", "친구이름", friend[idx][0]);
			System.out.printf("%-8s : %3s\n", "아 이 디", friend[idx][1]);
			System.out.printf("%-8s : %3s\n", "이 메 일", friend[idx][2]);
			System.out.printf("%-8s : %3s\n", "전화번호", friend[idx][3]);
			System.out.printf("%-8s : %3s", "친구성별", friend[idx][4]);
			
			System.out.println();
			System.out.println();
		}
		
		
		
	}

}

package day12.ex;

/*
	문제 1 ]
		노래 한곡의 데이터를 기억할 클래스 Song 을 정의하고
		10곡의 데이터를 입력해서
		곡명을 입력하면 해당 곡의 정보를 출력해주는 프로그램을 작성하세요.
		
		곡 정보는
			곡명(title), 작곡가(composer), 가수(singer), 장르(genre)
		를 기억하도록 하세요.
		
		단, 변수는 은닉화 하세요!(public --- x, private --- O)
		
		extra ]
			가수이름을 입력하면 해당 곡들이 출력되게 하세요.
 */

import java.util.*;
public class Ex01 {
	Scanner sc; // 이 상태는 아직 입력도구를 준비한 상태는 아니고 변수만 준비된 상태이다.
	
	public Ex01() {
		sc  = new Scanner(System.in);
		Song[] list = getList();
		// 배열에 입력된 내용 출력하고
		toPrint(list);
		System.out.println();
		// 타이틀 입력받아서 출력해주고
		exec(list);
		
		sc.close();
	}
	
	// 10곡의 노래를 기억하고 반환해주는 함수
	public Song[] getList() {
		Song[] song = new Song[10];
		
		// 데이터 준비
		String[] title = {"잠이 오질 않네요", "여수 밤바다", "Dynamite", "Celebrity", "밤하늘의 별을",
				"Lovesick Girls", "Don't Call Me", "취기를 빌려", "Beautiful Beautiful", "오늘도 난 봄을 기다려"};
		String[] singer = {"장범준", "장범준", "BTS", "아이유", "경서",
				"BLACKPINK", "샤이니", "산들", "ONF", "케이시"};
		String[] composer = {"장범준", "장범준", "David Stewart", "아이유", "강봄",
				"제니", "Kenzie", "새봄", "황현", "조영수"};
		String[] genre = {"발라드", "발라드", "K-POP", "발라드", "발라드",
				"K-POP", "K-POP", "발라드", "K-POP", "발라드"};
		
		// 데이터 채워주고
		for(int i = 0 ; i < 10 ; i++ ) {
			song[i] = new Song();
			
			// 각 인스턴스에 데이터를 채워준다.
			song[i].setTitle(title[i]);
			song[i].setComposer(composer[i]);
			song[i].setSinger(singer[i]);
			song[i].setGenre(genre[i]);
		}
		
		return song;
	}
	
	// 모든기능 조합해서 처리하는 함수 - 입력받은 데이터를 기준으로 출력만 해주는 함수
	public void exec(Song[] s) {
//		할일
		while(true) {
			// 1. 곡명을 입력받는다.
			String stitle = getTitle();
			if(stitle.equals("q")) {
				System.out.println("### 프로그램을 종료합니다! ###");
				return;
			}
			// 배열에서 같은 곡명의 정보를 찾아서 출력해준다.
			for(Song song : s) {
				String title = song.getTitle();
				if(title.equals(stitle)) {
					toPrint(song);
					System.out.println();
				}
			}
		}
	}
	
	// 입력받은 곡명을 반환해주는 함수
	public String getTitle() {
		// 입력도구는 준비되었으니 메세지 출력하고
		System.out.print("노래이름 : ");
		String title = sc.nextLine();
		
		return title;
	}
	
	// 배열을 입력하면 배열의 모든 곡의 정보를 출력해주는 함수
	public void toPrint(Song[] s) {
		for(Song song : s) {
			toPrint(song);
		}
	}
	
	// Song객체를 입력하면 배열의 인덱스에 해당하는 곡만 출력해주는 함수
	public void toPrint(Song s) {
		String info = s.toString();
//		System.out.println(info);
		System.out.println("*** toString() 호출 : " + s);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
	
}

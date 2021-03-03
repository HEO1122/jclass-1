package day11.solv;

/*
	Student 클래스(HomeWork02)를 이용해서 ==> 함수를 이용해서 접근해라...
	우리반 친구들 5명을 관리할 배열을 만들고
	출력하는 프로그램을 각각 제작하세요.
*/
public class HomeWork02 {
	public HomeWork02() {
		// 배열 준비하고
		Student[] stud = getDataArr();
		// 실행하면 인스턴스와 데이터 모두 채워서 반환해주는 함수를 이미 만들어 뒀으니
		// 호출만하면 원하는 Student 배열을 얻을 수 있다.
		
		// 출력해준다.
		toPrint(stud);
	}
	
	public static void main(String[] args) {
		new HomeWork02();
	}
	
	// 인스턴스와 데이터 채워주는 함수
	public Student[] getDataArr() {
		// 반환값 변수 만들고
		Student[] st = new Student[5];
		
		for(int i = 0 ; i < st.length ; i++ ) {
			st[i] = new Student();
		}
		
		// 데이터 삽입용 배열을 준비
		String[] name = {"윤태성", "최용훈", "허수경", "최다연", "김기은"};
		String[] id = {"tsung", "hoon", "soo", "yun", "ki"};
		String[] mail = {"tsung@increpas.com", "hoon@increpas.com", "soo@increpas.com", "yun@increpas.com", "ki@increpas.com"};
		String[] tel = {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-7777-7777", "010-5555-5555"};
		char[] gen = {'M', 'M', 'F', 'F', 'M'};
		
		//  데이터 채우고
		for(int i = 0 ; i < st.length ; i++ ) {
			String irum = name[i];
			String aidi = id[i];
			String juso = mail[i];
			String hp = tel[i];
			char gender = gen[i];
			
			st[i].setName(irum);
			st[i].setId(aidi);
			st[i].setMail(juso);
			st[i].setTel(hp);
			st[i].setGen(gender);
		}
		
		// 완성된 배열 반환해주고...
		return st;
	}
	
	// 출력용 함수 
	public void toPrint(Student[] st) {
		for(int i = 0 ; i < st.length ; i++ ) {
			System.out.println(st[i].toString());
		}
	}
}

package day16;

import java.io.*;
public class Test03 {

	public Test03() {
		// 파일 객체 만들고
		File file = new File("D:\\class\\java\\git\\jclass\\jclass\\src\\day15");
		// 파일리스트 가져오고
		String[] list = file.list(new MyFilter());
		// 리스트 내용 출력하고
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("---------------------------------");
		System.out.println("------- 필터링 안한 리스트 ------");
		String[] list1 = file.list();
		for(String s : list1) {
			System.out.println(s);
		}
		
	}

	public static void main(String[] args) {
		new Test03();
	}
}

class MyFilter implements FilenameFilter {
	/*
		day15 패키지의 파일중 이름이 T로 시작하는 것만 출력하고자한다.
	 */
	@Override
	public boolean accept(File dir, String name) {
		if(name.startsWith("T")) {
			return true;
		}
		return false;
	}
	
}

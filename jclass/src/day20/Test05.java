package day20;

/*
	1. 이름과 나이를 한쌍으로 한 데이터를 Map에 저장한 후
	2. 저장된 데이터를 출력하고
	3. 나이 순서대로 오름차순 정렬한 후
	4. 출력하세요.
 */

import java.util.*;
public class Test05 {
	private HashMap map;
	
	public Test05() {
		setData();
		// 출력용 리스트 만들고
		ArrayList list = getList();
		// 리스트 출력하고
		printList(list);
		
	}
	
	// map 초기화 함수
	public void setData() {
		map = new HashMap();
		// 데이터 채우고
		map.put("홍길동", 16);
		map.put("고길동", 36);
		map.put("희동이", 3);
		map.put("마이콜", 22);
		map.put("또치", 5);
	}
	
	// map의 데이터를 list로 반환해주는 함수
	public ArrayList getList() {
		Set set = map.entrySet();
		ArrayList list = new ArrayList(set);
		return list;
	}
	
	// list를 입력하면 내용을 출력해주는 함수
	public void printList(ArrayList list) {
		for(int i = 0 ; i < list.size(); i++ ) {
			Map.Entry ent = (Map.Entry) list.get(i);
			String name = (String) ent.getKey();
			int age = (int) ent.getValue();
			// 출력
			System.out.println(name + " : " + age);
		}
	}
	
	public HashMap getMap() {
		return map;
	}
	public void setMap(HashMap map) {
		this.map = map;
	}

	public static void main(String[] args) {
		new Test05();
	}

}

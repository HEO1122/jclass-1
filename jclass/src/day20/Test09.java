package day20;

import java.util.*;
public class Test09 {

	public Test09() {
		Integer[] no = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(no));
		
		// 배열을 리스트로...
		List list = Arrays.asList(no);
		for(Object o : list) {
			System.out.print(o + ", ");
		}
		System.out.println();
		
		// 리스트를 배열로...
		Integer[] num = (Integer[]) list.toArray();
		System.out.println(Arrays.toString(num));
	}

	public static void main(String[] args) {
		new Test09();
	}

}

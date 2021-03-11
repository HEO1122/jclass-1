package day17;

import java.util.*;
public class Test08 {

	public Test08() {
		Integer[] nums = new Integer[10];
		for(int i = 0 ; i < nums.length ; i++ ) {
			nums[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(nums));
		
//		ArrayList<Integer> list = new ArrayList(Arrays.asList(nums));
		List<Integer> list = Arrays.asList(nums);
		
		for(int no : list) {
			System.out.print(no + ", ");
		}
		System.out.println();
		Collections.reverse(list);
		
		nums = (Integer[]) list.toArray();
		
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		new Test08();
	}

}

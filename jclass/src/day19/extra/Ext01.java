package day19.extra;

import static java.lang.Math.*;
import java.util.*;
public class Ext01 {

	public Ext01() {
		TreeSet set = new TreeSet();
		
		while(set.size() < 10) {
			int ban = (int)(random()* 3 + 1);
			int no = (int)(random()*25+1);
			set.add(new Student("학생" + no, ban, no, getScore(), getScore(),getScore(), getScore(), getScore()));
		}
		
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
	}
	
	public int getScore() {
		return (int)(random()*41 + 60);
	}
	public static void main(String[] args) {
		new Ext01();
	}

}

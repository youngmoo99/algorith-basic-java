package day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set1 {

	public static void main(String[] args) {
		//set - 중복x 순서가 없다 
		// 중복을 제거하고자 하는 알고리즘일때 이용함 
		//HashSet
		//TreeSet
		
		//해시셋
		Set<String> set = new HashSet<String>();
		set.add("AA");
		set.add("BB");
		set.add("CC");
		set.add("BB");
		set.add("AA");
		set.add("DD ");
		
		System.out.println(set.size());
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
		
	}

}

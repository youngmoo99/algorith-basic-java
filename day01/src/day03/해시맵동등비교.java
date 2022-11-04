package day03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 해시맵동등비교 {

	public static void main(String[] args) {
		Map<Student,Integer> map = new HashMap<Student,Integer>();
		map.put(new Student(11,"홍길동"), 95);
		map.put(new Student(22,"김길동"), 92);
		map.put(new Student(33,"최길동"), 93);
		map.put(new Student(44,"송길동"), 94);
		
		Set<Student> set = map.keySet();
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			Student key = it.next();
			System.out.println(key + " "+map.get(key));
		}
	}

}


class Student {
	int sno;
	String name;
	
	public Student(int sno, String name) {
		this.sno = sno; //학번
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Student) {
			Student s = (Student) obj;
			return name.equals(s.name) && sno==s.sno;

		}else {
			return false;
		}
		
	}
}
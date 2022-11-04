package day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 동등객체판단 {

	public static void main(String[] args) {
		Set mSet = new HashSet<Member>();
		mSet.add(new Member("홍1", 10));
		mSet.add(new Member("홍2", 20));
		mSet.add(new Member("홍3", 30));
		mSet.add(new Member("홍4", 40));
		mSet.add(new Member("홍1", 50));
		
		Iterator<Member> it = mSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}

class Member {
	private String name;
	private int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	//동등 객체는 이름과 나이가 같으면 같은사람 
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
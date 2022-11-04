package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 리스트 {
	//리스트  저장이나 검색 1,2번       업데이트를 자주한다 3(linkedlist)
	//1. ArrayList - 배열을 대신해서 사용하는 컬렉션 중복가능 순서있음
	//2. Vector - 스레드를 활용한 멀티프로그램할때 동기화 처리해 준 리스트
	//3. LinkedList - 삽입 삭제 빈번하게 일어나는 경우 
	//배열의 단점은 중간에 자료가 지워진 경우 빈 상태로 그대로 진행 
	// 배열의 크기를 늘리려면 안되니깐 다른배열을 만들어서 옮겨야함 
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("AA");
		list.add("bb");
		list.add(1,"cc"); // 1번인덱스에 삽입 bb는 뒤로밀려남 
		list.add("dd");
		list.add("ee");
		
		list.remove(4);
		list.remove("AA");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		List<String> list1 = Arrays.asList("11","22","33","44"); // 리스트계열로 변경 
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}

}

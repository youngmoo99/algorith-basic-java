package day03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class 리스트3 {

	public static void main(String[] args) {
		//리스트 
		//1. ArrayList - 배열을 대신해서 사용하는 컬렉션 중복가능 순서있음
		//2. Vector - 스레드를 활용한 멀티프로그램할때 동기화 처리해 준 리스트
		//3. LinkedList - 삽입 삭제 빈번하게 일어나는 경우
		//배열의 단점은 중간에 자료가 지워진 경우 빈 상태로 그대로 진행 
		// 배열의 크기를 늘리려면 안되니깐 다른배열을 만들어서 옮겨야함 
		List<Integer> link = new LinkedList();
		link = Arrays.asList(1,2,3,4,5,6,1);
		for (int a : link) {
			System.out.println(a + " ");
		}
		System.out.println();
		//Iterator 인터페이스 반복자를 지원하는 인터페이스로 출력
		Iterator<Integer> it = link.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+ " ");
		}

	}

}

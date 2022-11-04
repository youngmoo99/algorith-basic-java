package day03;

import java.util.List;
import java.util.Vector;

public class 리스트2 {
	//리스트 
		//1. ArrayList - 배열을 대신해서 사용하는 컬렉션 중복가능 순서있음
		//2. Vector - 스레드를 활용한 멀티프로그램할때 동기화 처리해 준 리스트
		//3. LinkedList - 삽입 삭제 빈번하게 일어나는 경우
		//배열의 단점은 중간에 자료가 지워진 경우 빈 상태로 그대로 진행 
		// 배열의 크기를 늘리려면 안되니깐 다른배열을 만들어서 옮겨야함 
	public static void main(String[] args) {
		List<Board> vlist = new Vector<Board>();
		vlist.add(new Board("제목1", "내용1", "작성자1"));
		vlist.add(new Board("제목2", "내용2", "작성자2"));
		vlist.add(new Board("제목3", "내용3", "작성자3"));
		
		System.out.println(vlist.get(0));
	}

}

class Board{
	String subject;
	String content;
	String writer;
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
}

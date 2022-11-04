//package day06;
//
//import java.util.Comparator;
//
//public class LinkedList<E> {
//	class Node<E>{
//		private E data; //실제 데이터를 담을 변수 
//		private Node<E> next; //다음 노드를 가르키는 주소를 담을 변수 
//		
//		public Node(E data, Node<E> next) {
//			this.data = data;
//			this.next =next;
//		}
//	}// end Node class
//	private Node<E> head;
//	private Node<E> crnt;
//	
//	public LinkedList() {
//		head = null; // 비어 있는 리스트 조건 head == null 1개 head.next == null
//		crnt = null;
//	}
//	public E search(E obj, Comparator<? super E> c) {
//		Node<E> ptr = head; // 현재 스캔중인 노드 주소
//		
//		while(ptr !=null) {
//			if(c.compare(obj, ptr.data) == 0) {
//				crnt = ptr;
//				return ptr.data;
//			}
//			ptr=  ptr.next;
//		}
//		return null;
//		
//	}//검색
//	public void addFirst(E obj) {
//		Node<E> ptr = head;
//		head = crnt = new Node<E>(obj,ptr);
//	} // 처음 노드를 삽입하기
//	public void addLast(E obj) {
//		if(head == null) addFirst(obj);
//		else {
//			Node<E> ptr = head;
//			while(ptr.next != null) {
//				ptr = ptr.next;
//			}
//		}
//		//끝에 노드를 삽입하기 
//		public void addMid(E obj, E insertFrontData) {
//			//삽입할 "B"를 전달받아서
//			Node<E> ptr = head;
//			Node<E> fData;
//			Node<E> newData;
//			fData = search1(insertFrontData);
//			while(fData != null) {
//				newData = new Node<E>(obj,null);
//				ptr.next = fData.next;
//			}
//		}//중간에 삽입하기 
//		public void removeFirst() {
//			if(head != null) {
//				head = crnt = head.next;
//			}
//		}
//		public void removeLast() {
//			if(head != null) {
//				if(head.next == null) {
//					removeFirst();
//				}else {
//					Node<E> ptr= head;
//					Node<E> pre= head;
//					while(ptr.next != null) {
//						pre = ptr;
//					}
//					
//				}
//			}
//		}
//	}
//}

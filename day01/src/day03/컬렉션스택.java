package day03;

import java.util.Stack;

public class 컬렉션스택 {
	//스택은 후입선출
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(93);
		stack.push(91);
		stack.push(92);
		stack.push(90);
		stack.push(90); // 스택은 중복가능 
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}

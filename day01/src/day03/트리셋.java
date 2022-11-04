package day03;

import java.util.Set;
import java.util.TreeSet;

public class 트리셋 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(87);
		scores.add(88);
		scores.add(98);
		scores.add(75);
		scores.add(80);
		scores.add(85);
		
		Integer score = null;
		score = scores.first(); //가장낮은 객체
		System.out.println("가장 낮은 점수"+score);
		
		score = scores.last(); //가장 높은 객체
		System.out.println("가장 높은 점수"+score);
		
		//해당 객체 바로 아래에 있는 객체 찾기
		System.out.println(scores.lower(98));
		
		//해당 객체 바로 위에 있는 객체 찾기
		System.out.println(scores.higher(87));
	}

}

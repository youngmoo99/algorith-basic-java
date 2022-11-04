package day01;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		String[][] students = new String[10][2];

//		String[][] students = { { "0407357", "강효진" }, { "047214", "이종협" }, { "0487342", "배영미" }, { "0512478", "김예진" },
//				{}, {}, {}, {}, {}, {} };

		students[0][0] = "0407357";
		students[0][1] = "김효진";
		
		students[1][0] = "0407357";
		students[1][1] = "김길동";
		
		students[2][0] = "0407357";
		students[2][1] = "서길동";
		
		students[3][0] = "04073575";
		students[3][1] = "홍길동";

		students[4][0] = "0407357";
		students[4][1] = "배영미";

		// 입력받아서 삽입 하기 
		
//		int i=0, j=0;
//		for (; i < students.length; i++) {
//			if(students[i][0]==null) break;	
//		}
//		System.out.println(i + " ");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("학번 : ");
//		students[i][0] = sc.next();
//		
//		System.out.print("이름 : ");
//		students[i][1]  = sc.next();
//		
//		System.out.println(students[5][1]);
		
		
		
		String del_name = "배영미";
		
//		for (int i = 0; i < students.length; i++) {
//			if( students[i][1].equals(del_name)) {
//				students[i][0] = null;
//				students[i][1] = null;
//			}
//			
//		}
//		
		String search_name = "김길동";
		
		
		
		
		
		//학번순으로 정리 
		String[][] so = new String[10][2];
		int hak = Integer.parseInt(students[0][0]);
		int minhak_index = 0;
		int minhak = hak;
		
		for (int i1 = 0; i1 < students.length; i1++) {
			if (minhak > Integer.parseInt(students[i1][0])) {
				minhak = Integer.parseInt(students[i1][0]);
				minhak_index = i1;
			} 
			
		}
		System.out.println(minhak+ "  "+minhak_index);
		
	
		
	}

}

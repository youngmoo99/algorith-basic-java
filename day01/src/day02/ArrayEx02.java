package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		

//		String[][] students = { { "0407357", "강효진" }, { "047214", "이종협" }, { "0487342", "배영미" }, { "0512478", "김예진" },
//				{}, {}, {}, {}, {}, {} };
		
		//1. 2차원 배열을 만들어 두고 학번 이름 넣기
		String[][] students = new String[10][2];
		students[0][0] = "0307357";
		students[0][1] = "김효진";
		
		students[1][0] = "0465357";
		students[1][1] = "이종협";
		
		students[2][0] = "0427357";
		students[2][1] = "서상춘";
		
		students[3][0] = "0487357";
		students[3][1] = "배영미";

		students[4][0] = "0507357";
		students[4][1] = "김예진";
		
		//2. 학번을 숫자로 변경하기
		int[] s1 = new int[5]; // 학번을 숫자로 변경해서 담아 둘 1차원 배열 
		for (int i = 0; i < s1.length; i++) {
			s1[i] = Integer.parseInt(students[i][0]);
		}
		
		//3. 학번이 누가 제일 저은 사람인지 찾기
		int[] s2 = new int[5]; // 각학번 랭킹을 구하여 담아둘 1차원 배열 
		
		for (int i = 0; i < s1.length; i++) {
			int temp = 0;
			for (int j = 0; j < s1.length; j++) {
				if(s1[i] > s1[j]) temp++; //학번 비교해서 더 빠른(숫자가높은) 학번이면 temp ++  
			}
			s2[i] = temp;
		}
		for( int ss2 : s2) {
			System.out.print((ss2+1) + " "); //순위 출력
		}
		
		//4. 랭킹배열에 있는 값을 이용해서 so[][] 배열안에 넣기 
		String[][] so = new String[5][2];
		for (int i = 0; i < so.length; i++) {
			so[s2[i]][0] = students[i][0]; 
			so[s2[i]][1] = students[i][1];
		}
		System.out.println();
		for (int j = 0; j < so.length; j++) {
				System.out.println(so[j][0] +" "+so[j][1]);
		}
		
	}


}

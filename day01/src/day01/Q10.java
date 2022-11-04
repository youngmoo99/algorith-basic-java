package day01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		//자릿수 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 입력 : ");
		int num = sc.nextInt();
		
		String nums = String.valueOf(num);		
		System.out.println(num+" 은 "+nums.length()+"자리입니다.");
		
		int count=0;
		while (num >0) {
			num = num /10;
			count++;
			
		}
		System.out.println(count+"자리입니다.");
		
	}

}

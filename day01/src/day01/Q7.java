package day01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// 31P Q7 가우스 덧셈
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값 입력 : ");
		int a =sc.nextInt();
		
		double sum= 0;
		double sum2 = 0;
		double a2 = a;
		
		sum2 = (1+a2) *(a2/2);
		System.out.println((int)sum2);
		
		for (int i = 0; i < a; i++) {
			sum += (i + a - (i-1)); 
		}
		sum = sum/2;
		System.out.println("1부터 "+a+" 까지 합 : "+sum);
	}

}

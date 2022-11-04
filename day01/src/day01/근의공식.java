package day01;

import java.util.Scanner;

public class 근의공식 {

	public static void main(String[] args) {
		// 2a분의 -b 플러스마이너스 b제곱 -4ac 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a입력");
		double a = sc.nextInt();
		
		System.out.print("b입력");
		double b = sc.nextInt();
		
		System.out.print("c입력");
		double c = sc.nextInt();
		
		double x1, x2; 
		
		
	
		x1 = -b + Math.sqrt(Math.abs(b*b - 4*a*c)) / 2*a; // sqrt 제곱근, abs절댓값
	
		x2 = -b - Math.sqrt(Math.abs(b*b - 4*a*c)) / 2*a;
	
		System.out.println("근의공식 x 의값 : "+ x1+" , "+x2);

	}

}

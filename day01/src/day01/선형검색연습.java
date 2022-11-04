package day01;

import java.util.Scanner;

public class 선형검색연습 {
	static int 선행검색연습(int[] a, int n, int key) {
		int i =0;
		
		while (true) {
			if(i==n) { // 끝까지 찾고 없을경우 -1반환 
				return -1;
			}if (a[i] == key) { // 배열 값 검색할 값이랑 같은경우
				return i;
			}i++;
		}
	}
	
	public static void main(String[] args) {
		// 선형검색 또는 순차검색 
		// 원하는 키값을 갖는 요소를 만날 떄 까지 맨앞부터 순서대로 요소를 검색 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt(); // 배열 량 정하기 
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) { // 요솟수 만큼 반복
			System.out.print("x["+i+"] : "); // x[0]부터 요솟수 num까지 입력 
			x[i] = sc.nextInt();
		}
		System.out.println("검색할 값: "); // 찾을 값 입력 
		int ky=sc.nextInt();
		
		int idx = 선행검색연습(x,num,ky);
		
		if(idx==-1) {
			System.out.println("그 값의 요소가 없습니다");
		}else {
			System.out.println("그 값은 x["+idx+"] 에 있습니다.");
		}
		
		
		
	}

}

package day01;

import java.util.Scanner;

public class 이진검색연습 {
	static int 이진검색(int[] a, int n , int key) {
		int pl = 0; //검색범위의 첫 인덱스
		int pr = n-1; //검색범위의 끝 인덱스
		do {
			int pc = (pl+pr) / 2; // 중앙요소 인덱스 
			if (a[pc] == key) {//검색 성공
				return pc;
			}else if(a[pc] < key) { //검색 범위를 뒤쪽절반으로 좁힘
				pl = pc+1;
			}else { // 검색범위를 앞쪽 절반으로 좁힘
				pr = pc -1;
			}
		}while (pl<=pr);
			return -1;	//검색실패
			
		}
	

	public static void main(String[] args) {
		// 이진검색 : 요소가 오름차순 또는 내림차순으로 정렬된 배열에서 검색하는 알고리즘 
		
		//시간복잡도 
		// 이진검색 : O(log n) , 선형검색 O(n)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt(); // 배열 량 정하기 
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력 하세요 ");
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		
		for (int i = 1; i < num; i++) { // 요솟수 만큼 반복
			do {
				System.out.print("x["+i+"]: ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i-1]);
		}
		
		System.out.println("검색할 값: "); // 찾을 값 입력 
		int ky=sc.nextInt();
		
		int idx = 이진검색(x,num,ky);
		
		if(idx==-1) {
			System.out.println("그 값의 요소가 없습니다");
		}else {
			System.out.println("그 값은 x["+idx+"] 에 있습니다.");
		}
		
		

	}

}

package day02;

import java.util.Scanner;

public class 보초예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		System.out.print("검색할 값: ");
		int ky = sc.nextInt();
		int idx = 보초메소드(x, num, ky);
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다");
		}
	}

	private static int 보초메소드(int[] x, int num, int key) { // 선형검색 시간복잡도
		int i = 0;
		x[num] = key;
		while (true) {
			if (x[i] == key)
				break;
			i++;

		}
		return i == num ? -1 : i; // i 와 num이 같으면 -1 다르면 i

	}

}

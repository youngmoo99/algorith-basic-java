package day04;

import java.util.Scanner;

public class 퀵정렬 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void partition(int[] a, int n) {
		int pl = 0;
		int pr = n - 1;
		int x = a[n / 2];

		do {
			while (a[pl] < x)
				pl++;
			while (a[pr] > x)
				pr--;
			if (pl <= pr) {
				swap(a, pl++, pr--);
			}
		} while (pl <= pr);

		System.out.println("피벗값은 " + x + "입니다.");
		System.out.println("피벗 이하의 그룹");
		for (int i = 0; i <= pl - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		if (pl > pr + 1) {
			System.out.println("피벗과 같은 그룹");
			for (int i = pr + 1; i <= pl - 1; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}

		System.out.println("피벗 이상의 그룹");
		for (int i = pr + 1; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("배열을 나눕니다");
		System.out.print("요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sc.nextInt();

		}
		partition(x, nx);

	}

}

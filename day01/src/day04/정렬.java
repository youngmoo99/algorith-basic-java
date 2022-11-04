package day04;

public class 정렬 {

	int[] nums;

	// 정렬되기 전에 자료 만들어주기(초기화)
	void init() {
		nums = new int[] { 6, 4, 3, 7, 1, 9, 8 };
	}

	void display() {
		for (int n : nums) {
			System.out.printf("%3d", n);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 내부정렬- 메모리안에 올려두고 정렬하는 것 정렬할 양이 적은 것
		// 외부정렬- 정렬할 데이터가 많아서 메모리에 올려 처리하기 힘든 경우(기본 알고리즘은 내부정렬 알고리즘 도입함)
		// 정렬의 핵심요소는 교환 선택삽입
		// 버블정렬
		정렬 s = new 정렬();
		System.out.println("-------버블 정렬하기 전");
		s.init();
		s.display();
		s.bubbleSort1();
		System.out.println("--------버블 정렬하기 후 기본정렬 n-1");
		s.display();

		System.out.println("----버블 정렬하기전");
		s.init();
		s.display();
		s.bubbleSort2();
		System.out.println("-----버블 정렬하는 중에 정렬완료된것");
		s.display();

		System.out.println("----버블 정렬하기전");
		s.init();
		s.display();
		s.selectSort();
		System.out.println("-----버블 정렬하는 중에 정렬완료된것");
		s.display();

	}

	void bubbleSort1() {
		System.out.println(" 버블 정렬 중 --------->");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
				}
			}
			System.out.printf("%3d 회 : ", (i + 1));
			display();
		}
		System.out.println();
	}

	void bubbleSort2() {
		boolean flag = false;
		System.out.println(" 버블 정렬 중 --------->");
		for (int i = 0; i < nums.length; i++) {
			flag = false;
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					flag = true;
					int temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
				}
			}
			if (flag == false)
				break;
			System.out.printf("%3d 회 : ", (i + 1));
			display();
		}
		System.out.println();
	}

	void selectSort() {
		System.out.println("------- 선택정렬 중 ------->");
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
			System.out.printf("%3d", (i + 1));
			display();

		}
	}

}

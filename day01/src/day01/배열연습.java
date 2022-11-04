package day01;

public class 배열연습 {

	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = {1,2,3,4,5};
		
		a[0] = 37;
		a[1] = 2;
		a[2] = 45;
		a[3]= 46;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(b[i]);
		}

	}

}

package day0201;

import java.util.Random;

public class 배열최대값 {

	public static void main(String[] args) {
		double[] arr = {1.1, 3.3, 5.5,2.3};
		//최대값 나오게 하기 
		
		double max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println(max);
		Random rand = new Random();
		int re = rand.nextInt(30); // 0부터 29까지 난수 생성 
		System.out.println(re);

	}

}

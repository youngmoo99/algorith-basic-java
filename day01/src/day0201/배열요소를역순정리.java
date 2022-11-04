package day0201;

import java.util.Arrays;
import java.util.Collections;

public class 배열요소를역순정리 {

	public static void main(String[] args) {
		Integer[] arr = {2,5,1,3,9,6,7};
		Arrays.sort(arr,Collections.reverseOrder());
		
		for( int i : arr ) {
			System.out.print("["+i+"]  ");
		}

	}

}

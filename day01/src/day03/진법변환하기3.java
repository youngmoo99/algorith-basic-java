package day03;

public class 진법변환하기3 {

	public static void main(String[] args) {
		Util2 util2 = new Util2();
		
		System.out.println("<< 진법 변환 프로그램 >> ");
		
		//2진수르 10진수로 바꾸기
		String bn = "1110";
		System.out.println("2진수 "+bn+"을 10진수로 바꾸면"+Util2.decToDec(bn));
	}

}

class Util2 {

	public static int decToDec(String value) {
		int result = 0;
		for (int i = 0; i < value.length(); i++) {
			result = result * 2 +value.charAt(i) - '0'; // '1' - '0'
		}
		return result;
		}
		
	}
	


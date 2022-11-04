package day03;

public class 진법변환하기2 {

	public static void main(String[] args) {
		Util util = new Util();
		
		System.out.println("<< 진법 변환 프로그램 >> ");
		
		//10진수를 2진수로 바꾸기
		int n=14;
		System.out.println("10진수 "+n+"을 2진수로 바꾸면"+Util.decToBin(n));
	}

}

class Util {

	public static String decToBin(int value) {
		String result =""; // 결과값 변수
		int mok, nmg; // 몫, 나머지
		mok = value; // ex) mok =14
		while (mok !=0) { // 0이 될떄까지 2로 계속 나눔
			nmg = mok%2; 
			//숫자 0을 문자로 만들기 
			// 유니코드표에 문자0은 48 그래서 숫자(0) + 48을하면 문자 0이나옴 
			result += (char)( nmg + '0');
			mok = mok / 2;			
			System.out.println(result);
		}
		StringBuffer sb = new StringBuffer(result);
		String result1 =  sb.reverse().toString();
		return result1;
	}
	
}

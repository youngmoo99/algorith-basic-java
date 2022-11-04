package day0201;

public class 문자열예제 {

	public static void main(String[] args) {
		String s = "celebrate";
		System.out.println("문자열 길이  " + s.length());
		System.out.println("문자열 안에 특정 문자를 꺼내는 메소드 " + s.charAt(1));
		System.out.println("부분 문자열을꺼내는 메소드 substring" + s.substring(3)); // 3번 인덱스부터 뒤로 다 출력
		System.out.println("부분 문자열을꺼내는 메소드 " + s.substring(0, 3)); // 0번 인덱스부터 2번인덱스까지 출력
		System.out.println("다른문자열과 내용이 같은지 조사하는 메소드" + s.equals("abc"));
		System.out.println("다른문자열과 비교하는 메소드 " + s.compareTo("abcdefg"));
		System.out.println("문자열 검색하기 " + s.indexOf("e"));
		System.out.println("문자열 검색하기 " + s.lastIndexOf("e"));
		

	}

}

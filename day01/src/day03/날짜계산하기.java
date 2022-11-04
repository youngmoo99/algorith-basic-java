package day03;

import java.time.DayOfWeek;

public class 날짜계산하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DayOfYear dy = new DayOfYear();
		System.out.println("올해 1월 1일부터 날짜는 "+ dy.calc(2022, 1, 14));

	}

	
}

//날짜 계산하는 클래스
class DayOfYear{
	public int calc(int year, int month, int day) {
		// 1월 ~9월 까지 마지막 일을 누적해서 더함 
		int[] lastday = {0,31,28,31,30,31,30,31,31,30,31,30,31 }; // 1월부터 12월 날짜수 
		
		//윤년인지 확인하기 
		if(isLeap(year)) lastday[2] = 29;
		
		int result = 0; //누적변수 
		for (int i = 1; i < month; i++) {
			result += lastday[i];
		}
		result += day;
		return result;
		

	}
	//윤년 계산 메소드 
	private boolean isLeap(int year) {
			if( year % 4 == 0 && year % 100 !=0 || year % 400 == 0) // 윤년 조건 
				return true;
			
			else{return false;}
		
	}
	
	
	
}

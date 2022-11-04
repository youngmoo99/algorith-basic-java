package day01;

public class ArrayEx01 {

	public static void main(String[] args) {
		//1차원 배열에 데이터 입력하고 출력하기 
		int[] aa = new int[10];
		aa[0] = 100;
		aa[1] = 200;
		aa[3] = 100;
		aa[4] = 200;
		aa[5] = 100;
		aa[6] = 200;
		aa[7] = 100;
		aa[8] = 200;
		aa[9] = 100;
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i]+"\t");
		}
		
		//2차원 배열에 데이터 넣고 출력하기
		String[][] b = new String[2][3];
		b[0][0] = "a";
		b[0][1] = "b";
		b[0][2] = "c";
		b[1][0] = "d";
		b[1][1] = "e";
		b[1][2] = "f";
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		//3차원 배열에 데이터 넣고 출력하기 
		String[][][] c = new String[2][3][2];
		
		c[0][0][0] = "a";
		c[0][0][1] = "b";
		c[0][1][0] = "c";
		c[0][1][1] = "d";
		c[0][2][0] = "e";
		c[0][2][1] = "f";
		c[1][0][0] = "g";
		c[1][0][1] = "h";
		c[1][1][0] = "i";
		c[1][1][1] = "j";
		c[1][2][0] = "k";
		c[1][2][1] = "l";
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int j2 = 0; j2 < c[i][j].length; j2++) {
					System.out.print(c[i][j][j2]+ " ");
					
				}
				System.out.println();
			}
			System.out.println();
		}
		

	}

}

package day0201;

public class 보이어무어검색 {

   public static void main(String[] args) {
      String txt = "ABABCDEFGHA";
      String pat = "ABC";
      System.out.println((int) Character.MAX_VALUE);
      int idx = bmMatch(txt, pat);
      if(idx == -1) {
         System.out.println("그값의 요소가 없습니다.");
      }
      else {
         System.out.println("그 값은 x[" + idx + "]에 있습니다.");
      }
   }

   private static int bmMatch(String txt, String pat) {
      int pt; // txt커서
      int pp; // par커서
      int txtLen = txt.length();// 11
      int patLen = pat.length();// 3

      int[] skip = new int[Character.MAX_VALUE + 1];
      for (pt = 0; pt <= patLen - 1; pt++) {
         skip[pat.charAt(pt)] = patLen - pt - 1;
      }
//      for(pt = 0; pt<=Character.MAX_VALUE; pt++) {
//         System.out.print(skip[pt] + " ");
//      }
      while (pt < txtLen) {
         pp = patLen - 1;
         while (txt.charAt(pt) == pat.charAt(pp)) {
            if(pp==0)return pt;//성공
            pp--;
            pt--;
         }
         pt += ( skip[txt.charAt(pt)] > patLen - pp) ? skip[txt.charAt(pt)] : patLen - pp;
      }
      return 0;
   }

}
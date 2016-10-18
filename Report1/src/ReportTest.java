// 2013110023 노다 사오리

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReportTest {
   public static void main(String[] args) {
      InputStreamReader rd = new InputStreamReader(System.in);
      String str = "";

      System.out.println("문자열을 입력해주세요 (ctrl-z 으로 마칩니다)>>");

      try {
         while (true) {
            int c = rd.read();
            if(c == -1){
               break;
            }
            str += (char)c;
         }
      } catch (IOException e) {
         System.out.println("error!");
      }

      StringTokenizer st = new StringTokenizer(str, " ");
      String longest = "";

      while (st.hasMoreTokens()) {
         String token = st.nextToken();

         if(longest.length() < token.length()){
            longest = token;
         }
      }
      System.out.println("제일 긴 단어: " + longest);
   }
}
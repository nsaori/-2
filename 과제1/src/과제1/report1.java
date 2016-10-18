/* <문제>
 *ctrl-z가 입력될 때가지 키보드로부터 단어들을 읽고
 *사용자가 입력한 문자열에서 제일 긴 단어를 출력하는 프로그램(Report1)을 작성하시오.
 *단어는 공백으로 분리한다.
 */
//InputStreamReader, StringTokenizer

package 과제1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class report1 {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		InputStreamReader io = new InputStreamReader(System.in);
		String str = "";
		System.out.println("단어를 연속으로 입력하세요(단어는 공백으로 분리한다, 종료: ctrl-z");

		try{
			while(true){
				int c = io.read();
				if(c==-1){
					break;
				}
				str += (char)c;
			}
			System.out.println(str);
		}catch(IOException e){
			System.out.println("errer");
		}
		StringTokenizer st = new StringTokenizer(str, " ");
		String longest = "";

		while(st.hasMoreTokens()){
			String token = st.nextToken();
			if(token.length() > longest.length()){
				longest = token;
			}
		}
		System.out.println();
		System.out.println("가장 긴 단어는 " + longest);

	}

}

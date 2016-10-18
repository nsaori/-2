/* <실습#2> Scanner클래스를 사용하여 10개의 실수값을 키보드로부터 입력하여
 * 벡터에 저장한 후, 벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하시오.
 */
package 실습2;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>(10);
		Scanner scanner = new Scanner(System.in);

		 //canner클래스를 사용하여 10개의 실수값을 키보드로부터 입력하여 벡터에 저장한 후
		for(int i = 0; i < v.capacity(); i++){
			System.out.print( i + " 실수값을 입력해부세요:");
			v.add(scanner.nextDouble());
		}
		//벡터를 검색하여 가장 큰 수를 출력
		Iterator<Double> itr = v.iterator();
		double max = v.get(0);
		while(itr.hasNext()){
			Double tmp = itr.next();
			if(max <tmp){
				max = tmp;
			}
		}
		System.out.println("최대값: " + max);
	}
}

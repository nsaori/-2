//2013110023 노다 사오리

import java.util.Scanner;
import java.util.Vector;


/* <실습#2> Scanner클래스를 사용하여
 *  10개의 실수값을 키보드로부터 입력하여 벡터에 저장한 후, 
 *  벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하시오.
 * */                              
 
public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Double> v = new Vector<Double>();
		
		System.out.println("실수를 입력하세요;" );
		v.add( scanner.nextDouble());
		double max = v.get(0);
		
		for(int i = 1; i<10; i++){
			double n = scanner.nextDouble();
			v.add(n);
			if(max < v.get(i)){
				max = v.get(i);
			}
		}
		System.out.print("최대값은;" + max );

	}

}

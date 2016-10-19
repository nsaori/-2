//2013110023 노다 사오리

import java.util.*;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Scanner;

public class VectorTest {

	public static void main(String[] args) {
		//입력
		Scanner input = new Scanner(System.in);
		ArrayList<Double> arrayList = new ArrayList<Double>(10);
		
		System.out.println("10개 실수 값를 입력하세요");
		for(int i = 0; i < 10; i++ ){
			double inputData =input.nextDouble();
			arrayList.add(inputData);   //arto boxing
			
		}
		
		//계산
//		double largest = arrayList.get(0);
//		for(int i = 1; i < 10; i++){
//			if(largest < arrayList.get(i)){
//				largest = arrayList.get(i);
//			}
//		}
		
		double largest = arrayList.get(0);
		
		Iterator<Double> itr = arrayList.iterator();
		while(itr.hasNext()){   // 다음 요소있니?
			double nextElement = itr.next();
			if(largest < nextElement){
				largest = nextElement;
			}
		}
		itr.remove();
		//itr.remove();
		
		//출력
		System.out.println("가장 큰 값 = " + largest);
		
		//모든 요소 출력
		Iterator<Double> itr2 = arrayList.iterator();  //아까 사용한 건 다 써서 못쓴다.
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}

	}
	
	
	/* 시그니처
	 * return type(반환값) method's name, parameter(매계변수)
	 * 
	 *E; type 매계변수
	 *Iterator<> name = 뭐.iterator();
	 *E next() ; 다음 요소 가져온다
	 * */
	

}

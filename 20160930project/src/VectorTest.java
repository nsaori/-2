//2013110023 ��� �����

import java.util.*;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Scanner;

public class VectorTest {

	public static void main(String[] args) {
		//�Է�
		Scanner input = new Scanner(System.in);
		ArrayList<Double> arrayList = new ArrayList<Double>(10);
		
		System.out.println("10�� �Ǽ� ���� �Է��ϼ���");
		for(int i = 0; i < 10; i++ ){
			double inputData =input.nextDouble();
			arrayList.add(inputData);   //arto boxing
			
		}
		
		//���
//		double largest = arrayList.get(0);
//		for(int i = 1; i < 10; i++){
//			if(largest < arrayList.get(i)){
//				largest = arrayList.get(i);
//			}
//		}
		
		double largest = arrayList.get(0);
		
		Iterator<Double> itr = arrayList.iterator();
		while(itr.hasNext()){   // ���� ����ִ�?
			double nextElement = itr.next();
			if(largest < nextElement){
				largest = nextElement;
			}
		}
		itr.remove();
		//itr.remove();
		
		//���
		System.out.println("���� ū �� = " + largest);
		
		//��� ��� ���
		Iterator<Double> itr2 = arrayList.iterator();  //�Ʊ� ����� �� �� �Ἥ ������.
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}

	}
	
	
	/* �ñ״�ó
	 * return type(��ȯ��) method's name, parameter(�Ű躯��)
	 * 
	 *E; type �Ű躯��
	 *Iterator<> name = ��.iterator();
	 *E next() ; ���� ��� �����´�
	 * */
	

}

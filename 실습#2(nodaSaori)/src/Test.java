//2013110023 ��� �����

import java.util.Scanner;
import java.util.Vector;


/* <�ǽ�#2> ScannerŬ������ ����Ͽ�
 *  10���� �Ǽ����� Ű����κ��� �Է��Ͽ� ���Ϳ� ������ ��, 
 *  ���͸� �˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * */                              
 
public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Double> v = new Vector<Double>();
		
		System.out.println("�Ǽ��� �Է��ϼ���;" );
		v.add( scanner.nextDouble());
		double max = v.get(0);
		
		for(int i = 1; i<10; i++){
			double n = scanner.nextDouble();
			v.add(n);
			if(max < v.get(i)){
				max = v.get(i);
			}
		}
		System.out.print("�ִ밪��;" + max );

	}

}

//2013110023 ��� �����
/* <����#2> �л��� ��Ÿ���� �𷡽� Student���� 
 * �л�����(�̸�, �а�, �й�, �������)�� ��Ÿ���� �Ӽ����� �ִ�
 * (��, �й��� StringŸ������ �����Ѵ�). 
 * Ű���忡�� �л�5���� ������ �Է¹޾Ƽ�, 
 * �й��� "Ű(key)"�� �Ͽ� HashMap<String, Student>�� �����ϰ� 
 * �й����� �л��� �˻��Ͽ� �л������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
��,  ������ ���� ��������� �����Ͽ� ���α׷��� �ۼ��� ��. 
(1)�Ʒ��� ���� HashMap�� ����Ͽ� �л�5���� ������ ��.
     HashMap<String, Student> dept = new HashMap<String, Student>(); 
(2)HashMap�� ������� �ϴ� �ݺ�ó�������� �ݵ�� �ݺ���(Iterator)�� ����� ��
*/

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Student> dept = new HashMap<String, Student>(5);
		
		for(int i=0; i<5; i++){
			//�л����� �Է�
			System.out.println("�л�����(�̸�, �а�, �й�, �������) ");
			String name = scanner.next();
			String department = scanner.next();
			String stNum = scanner.next();
			double scoreAverage = scanner.nextDouble();
			//�й� �ľ�, �л���ü ����
			Student st = new Student(name, department, stNum, scoreAverage);
			//HashMap�� ����
			dept.put(stNum,st);
		}
		
		Set<String> stNumSet = dept.keySet();
		System.out.print("ã������ �й��� �Է��ϼ���:");
		String findStNum =scanner.next();
		
		Iterator<String> itr = stNumSet.iterator();
		while(itr.hasNext()){
			if(findStNum.equals(itr.next())){
				Student findSt = dept.get(findStNum);
				System.out.println(findSt.toString());
			}
		}
		
		
	}

}

//2013110012 ��� �����
import java.util.Scanner;

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
*when input, dont use iterator.
 */
public class Student {
	public static void main(String[] args) {
		
		String name, majer, number;
		double scoreAve;
		int students = 5;
	
		Scanner scanner = new Scanner(System.in);
	
		for(int i = 0; i < students; i++){
			System.out.print("�̸�; ");
			name = scanner.nextLine();
			System.out.print("�а�; ");
			majer = scanner.nextLine();
			System.out.print("�й�; ");
			number = scanner.nextLine();
			System.out.print("�������; ");
			scoreAve = scanner.nextDouble();
		}
	}

}

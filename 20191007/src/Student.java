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

public class Student {
	private String name;
	private String dept; //�а�
	private String stNum; //�й�
	private double scoreAverage;
	
	Student(String name, String dept, String stNum, double scoreAve){
		this.name = name;
		this.dept = dept;
		this.stNum =stNum;
		this.scoreAverage = scoreAve;
		
	}
	public String toString(){
		return "�̸�" + name +"�а�"+ dept+"�й�"+stNum+"�������"+scoreAverage;
			
	}
}

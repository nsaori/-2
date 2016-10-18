/*<과제#2> 학생을 나타내는 쿨래스 Student에는
 * 학생정보(이름, 학과, 학번, 학점평균)를 나타내는 속성들이 있다(단, 학번은 String타입으로 선언한다).
 * 키보드에서 학생5명의 정보를 입력받아서,
 * 학번을 "키(key)"로 하여 HashMap<String, Student>에 저장하고
 * 학번으로 학생을 검색하여 학생정보를 출력하는 프로그램을 작성하시오.
단,  다음과 같은 제약사항을 엄수하여 프로그램을 작성할 것.
(1)아래와 같은 HashMap을 사용하여 학생5명을 저장할 것.
     HashMap<String, Student> dept = new HashMap<String, Student>();
(2)HashMap을 대상으로 하는 반복처리에서는 반드시 반복자(Iterator)를 사용할 것
 */
package 과제2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class HashMapTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 HashMap<String, Student> dept = new HashMap<String, Student>(3);
		 //키보드에서 학생5명의 정보를 입력받아서,
		for(int i = 0; i<3 ; i++){
			System.out.print("이름: ");
			String name = scanner.nextLine();
			System.out.print("학과: ");
			String major = scanner.nextLine();
			System.out.print("학번: ");
			String number = scanner.nextLine();
			System.out.print("학점평균: ");
			double aveScore = scanner.nextDouble();
			scanner.nextLine();

			Student s = new Student(name,major, number,aveScore);
			//학번을 "키(key)"로 하여 HashMap<String, Student>에 저장
			dept.put(number, s);
		}
		//학번으로 학생을 검색하여 학생정보를 출력
		System.out.print("찾는 학생의 학번: ");
		String findnum = scanner.nextLine();

		if(!dept.containsKey(findnum)){
			System.out.println("학생의 정보가 없습니다.");

		}

		Set<String> keySet = dept.keySet();
		Iterator<String> itr = keySet.iterator();
		while(itr.hasNext()){
			//if(findnum == itr.next()){
			if(findnum.equals(itr.next())){
				Student findStudent = dept.get(findnum);
				System.out.println(findStudent.toString());
				System.out.println("이름: " +findStudent.name + " 학과: " + findStudent.majer + " 학번: " + findnum + " 학점평균: " + findStudent.aveScore);
				break;
			}
		}
	}
}

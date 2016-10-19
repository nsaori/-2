//2013110023 노다 사오리
/* <과제#2> 학생을 나타내는 쿨래스 Student에는 
 * 학생정보(이름, 학과, 학번, 학점평균)를 나타내는 속성들이 있다
 * (단, 학번은 String타입으로 선언한다). 
 * 키보드에서 학생5명의 정보를 입력받아서, 
 * 학번을 "키(key)"로 하여 HashMap<String, Student>에 저장하고 
 * 학번으로 학생을 검색하여 학생정보를 출력하는 프로그램을 작성하시오. 
단,  다음과 같은 제약사항을 엄수하여 프로그램을 작성할 것. 
(1)아래와 같은 HashMap을 사용하여 학생5명을 저장할 것.
     HashMap<String, Student> dept = new HashMap<String, Student>(); 
(2)HashMap을 대상으로 하는 반복처리에서는 반드시 반복자(Iterator)를 사용할 것
*/

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Student> dept = new HashMap<String, Student>(5);
		
		for(int i=0; i<5; i++){
			//학생정보 입력
			System.out.println("학생정보(이름, 학과, 학번, 학점평균) ");
			String name = scanner.next();
			String department = scanner.next();
			String stNum = scanner.next();
			double scoreAverage = scanner.nextDouble();
			//학번 파악, 학생객체 생선
			Student st = new Student(name, department, stNum, scoreAverage);
			//HashMap에 저장
			dept.put(stNum,st);
		}
		
		Set<String> stNumSet = dept.keySet();
		System.out.print("찾으려는 학번을 입력하세요:");
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

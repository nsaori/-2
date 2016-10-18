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

public class Student {
	String name, majer, number;
	double aveScore;

	Student(String name, String majer, String number, double aveScore){
		this.name = name;
		this.majer = majer;
		this.number = number;
		this.aveScore = aveScore;
	}

	public String toString(){
		return "이름: " +this.name + " 학과: " + this.majer + " 학번: " + this.number + " 학점평균: " + this.aveScore;
	}

}

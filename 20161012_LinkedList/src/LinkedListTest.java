//20161012 nodasaori

import java.util.*;
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Sun");
		myList.add("Moon");
		myList.add("University");
		myList.add(1,"Korea");
		
		printList(myList);
		
		Collections.sort(myList); //오늘자순  //Class명.매소드(	PARAMETER)
		printList(myList);
		
		Collections.reverse(myList); //내린자순
		printList(myList);
		
	}
	
	
	static void printList(LinkedList<String> list ){
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println();
	}
}


/*
Class collections
	(interface collection)

*static/instance
all method -> static ;객체없어도 실행이 가능
instance; 객체다 있어애 한다

*/
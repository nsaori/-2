//2013110023 saori

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		// input
		HashMap<String, String> dic = new HashMap<String,String>();
		dic.put("apple", "사과");
		dic.put("banana","바나나");
		dic.put("grape","포도");
		
		System.out.println(dic.get("banana")); //banana과 매핑된 value를 표시한다
		
		Set<String> keySet = dic.keySet();
		// output all elements of the keySet
		Iterator<String> itr = keySet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}

/* public V get(Object key)
 * V; key에 해당하는(mapped) value 값
 * 
 * 집합 ; 동일 값이 잇어므녀 x
 * */

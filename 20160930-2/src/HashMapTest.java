//2013110023 saori

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		// input
		HashMap<String, String> dic = new HashMap<String,String>();
		dic.put("apple", "���");
		dic.put("banana","�ٳ���");
		dic.put("grape","����");
		
		System.out.println(dic.get("banana")); //banana�� ���ε� value�� ǥ���Ѵ�
		
		Set<String> keySet = dic.keySet();
		// output all elements of the keySet
		Iterator<String> itr = keySet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}

/* public V get(Object key)
 * V; key�� �ش��ϴ�(mapped) value ��
 * 
 * ���� ; ���� ���� �վ�ǳ� x
 * */

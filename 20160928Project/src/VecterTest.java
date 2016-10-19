import java.util.Vector;

public class VecterTest {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(7);
		//v.add(new Integer(5));
		v.add(5);   //arto boxing
		v.add(new Integer(4));
		v.add(new Integer(-1));
		v.add(new Integer(10));
		
		//int result = v.get(2);   \
		int result = v.get(2);//.get(int index);
		System.out.println(result);
		
		v.add(2,3);   //.get(index,E);
		System.out.println(v.get(2));
		
		System.out.println(v.remove(1)); 
		System.out.println(v.get(1));
		System.out.println(v.remove(new Integer(5)));
		System.out.println(v.get(0));//.remove(O);
	}

}

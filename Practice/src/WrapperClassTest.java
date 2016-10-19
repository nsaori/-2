
public class WrapperClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		x = 10;
		System.out.println(x);
		
		Integer xObjInt = new Integer(10);
		System.out.println(xObjInt.toString());
		
		Integer xObjStr = new Integer("10");
		System.out.println(xObjStr);
		
		Integer yObj = 20;
		System.out.println(yObj);
		int y =yObj;
		System.out.println(y);
		
		int a = Integer.parseInt("10");
		System.out.println(a);
		
		int b = Integer.parseInt("234",8);
		System.out.println(b);	
		int bb = Integer.parseInt("16",8);
		System.out.println(bb);
	}

}

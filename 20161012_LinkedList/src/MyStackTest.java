//20161014 noda saori
import java.util.*;
public class MyStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack<String> ms = new MyStack<String>();
		
		
		ms.push("te");
		ms.push("la");
		ms.push("co");
		ms.push("Cho");
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		
		ms.push("te");
		ms.push("la");
		ms.push("co");
		ms.push("Cho");
		
		ms = reverce(ms);
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
			
	}
	
	public static <T> MyStack<T> reverce(MyStack<T> stack){
		MyStack<T> newStack = new MyStack<T>();
		for(int i=stack.size(); i>0; i--){
			newStack.push(stack.pop());
		}
		return newStack;
	}

}

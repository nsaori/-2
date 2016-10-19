//20161012,14 noda saori - jenelical

import java.util.*;
public class MyStack<T> {   // T;제네릭하게
		private Object[] data = new Object[10];  //Object type can receive all type
		private int top=-1;
		
		MyStack(){};
		
		public void push(T e){  //삽입
			if(top >= 10){
				System.out.print("스택은 포화상태입니다.");
			}
			data[++top] = e;
		}
		
		public T pop(){   //삭제
			if(top <= -1){
				System.out.println("공백스택입니다.");
				return null;
			}			
			return (T)data[top--];
		}	
		public T peek(){
			if(top <= -1){
				System.out.println("공백스택입니다.");
				return null;
			}
			return (T)data[top];
		}
		/* public T peekAll(){
			if(top <= -1){
				System.out.println("공백스택입니다.");
				return null;
			}
			private Object[] s = new Object[10];
		}*/
		public int size(){
			return top+1;
		}
		
		
}
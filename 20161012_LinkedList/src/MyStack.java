//20161012,14 noda saori - jenelical

import java.util.*;
public class MyStack<T> {   // T;���׸��ϰ�
		private Object[] data = new Object[10];  //Object type can receive all type
		private int top=-1;
		
		MyStack(){};
		
		public void push(T e){  //����
			if(top >= 10){
				System.out.print("������ ��ȭ�����Դϴ�.");
			}
			data[++top] = e;
		}
		
		public T pop(){   //����
			if(top <= -1){
				System.out.println("���齺���Դϴ�.");
				return null;
			}			
			return (T)data[top--];
		}	
		public T peek(){
			if(top <= -1){
				System.out.println("���齺���Դϴ�.");
				return null;
			}
			return (T)data[top];
		}
		/* public T peekAll(){
			if(top <= -1){
				System.out.println("���齺���Դϴ�.");
				return null;
			}
			private Object[] s = new Object[10];
		}*/
		public int size(){
			return top+1;
		}
		
		
}
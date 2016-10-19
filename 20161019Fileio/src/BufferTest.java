//ch8 p.418

import java.io.BufferedOutputStream;
import java.util.*;
import java.io.*;

public class BufferTest {

	public static void main(String[] args) {
		BufferedOutputStream outF = new BufferedOutputStream(System.out, 20);
		
		try{
			FileReader inF 
			= new FileReader("C:\\Users\\user\\Desktop\\ns\\objectPrograming2\\system.ini");
	
			int c;
			while(( c = inF.read()) != -1 ){
				outF.write((char)c);
			}
			inF.close();
			outF.close();
			
		}catch(IOException e){
			System.out.println("error");
		}
	}
}


/*
 *화면에 출력한다
 * BufferedOutputStream(System.out);
   BufferedOutputStream(System.out,20);   //20 ; buffer size
   
   FileReader("file's name");
*/
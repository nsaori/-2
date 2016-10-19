//20161014 saori
import java.io.*;   //unicode
import java.util.*;
public class StreamTest {

	public static void main(String[] args) {
		FileInputStream inFile = null;
		try{
			inFile 
				= new FileInputStream("C:\\Users\\user\\Desktop\\ns\\objectPrograming2\\20161014_inputData.txt");
			FileOutputStream outFile 
				= new FileOutputStream("C:\\Users\\user\\Desktop\\ns\\objectPrograming2\\20161014_outPutData.txt");
			int data; //binary ; int type
			while( (data=inFile.read()) != -1 ){
				System.out.print( (char)data );
				outFile.write(data);
			}
			inFile.close();
			outFile.close();
		
		}catch(IOException e){
			System.out.println("errer in file io ");
		}
		
	}

}


/*
¹®ÀÚ stream ;unicode
binary stream; 


*/
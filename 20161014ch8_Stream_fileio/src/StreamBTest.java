//20161014saori
import java.io.*;
import java.util.*;
public class StreamBTest {

	public static void main(String[] args) {
		try{
			FileReader fread 
				= new FileReader("C:\\Users\\user\\Desktop\\ns\\objectPrograming2\\20161014_inputData.txt");
			FileWriter fwrite 
				= new FileWriter("C:\\Users\\user\\Desktop\\ns\\objectPrograming2\\20161014_outPutData.txt");			
			int data;
			while((data = fread.read()) != -1){
				System.out.print(data);
				fwrite.write(data);
			}
			fread.close();
			fwrite.close();
		}catch(IOException e){
			System.out.println("errer in file io ");
		}

	}

}

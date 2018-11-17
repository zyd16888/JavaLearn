package classWork;//hello
import java.io.*;
public class TestFile {
	public static void main(String[] args){
		//FileWriter/FileReader
		try{
			FileWriter fw = new FileWriter("a.txt");//eclipse,src·����
			fw.write("hello");
			fw.close();
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}
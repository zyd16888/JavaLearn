package classWork;

import java.util.*;
import java.io.*;
public class TestList {
	public static void main(String[] args) throws IOException{
		//????getSS()?????????1~100?????????
		/*
		TestJDBC2 t = new TestJDBC2();
		List<Integer> myList = t.getSS();
		for(int i=0;i<myList.size();i++){
			System.out.print(myList.get(i)+",");
			if(i%5==0){
				System.out.println();
			}
		}
		try{
			TestJDBC2.putToFile();
		}catch(IOException e){
			System.out.println(e);
		}
		*/
		Test2.getFromFile();
	}
}
class Test2{

	//??1-100????????§Õ?????????
	public static void putToFile() throws IOException{
		List<Integer> myList = getSS();
		FileWriter fw = new FileWriter("C:\\Users\\lifulingly\\Desktop\\ss.txt");
		for(int i=0;i<myList.size();i++){
			int ss = myList.get(i);
			fw.write(String.valueOf(ss)+",");
			if(i%5==0){
				fw.write("\r\n");
			}
		}
		fw.close();
	}
	
	
	//???1-100????????
	public static void getFromFile() throws IOException{
		
		FileReader fr = new FileReader("C:\\Users\\lifulingly\\Desktop\\ss.txt");
		int i = fr.read();
		for(;i!=-1;){
		
			System.out.print((char)i);
			i = fr.read();
		}
		fr.close();
	}
	
	//????static????getSS()?????1~100????????????????ssList????
	public static List<Integer> getSS(){
		List<Integer> ssList = new ArrayList<Integer>();
		//?§Ø?????
		for(int i=2;i<=100;i++){
			boolean flag = true;
			for(int j=2;j<i;j++){
				if (i%j==0){
					flag = false;
					break;
				}
			}
			
			if(flag){
				ssList.add(i);
			}
		}
		
		return ssList;
		
	}
	
}
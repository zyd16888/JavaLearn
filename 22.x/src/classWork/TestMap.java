package classWork;

import java.util.*;
public class TestMap
{
	public static void main(String[] args){
		Map myMap = new TreeMap();
		myMap.put("hello","dkddidkdkkd");
		myMap.put("1",new Date());
		myMap.put("a",new TestList());
		
		System.out.println(myMap.get("a"));
		System.out.println(myMap.get("1"));
		System.out.println(myMap.get("hello"));
		
		
	}
}
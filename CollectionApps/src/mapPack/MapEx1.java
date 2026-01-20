package mapPack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String>  stdMap = new HashMap<Integer,String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Roll No");
		int rno = sc.nextInt();
		System.out.println("Student name");
		String sname = sc.next();
		
		stdMap.put(rno, sname);
		
		//stdMap.put(1001, "Pavan");
		//stdMap.put(1002, "Kiran");
		//stdMap.put(1003, "Lavanya");
		//stdMap.put(1004, "Priya");
		//stdMap.put(1005, "Ramana");
		
		System.out.println(stdMap);
		// Traversing
		for(Map.Entry<Integer, String> mapObj : stdMap.entrySet())
		{
			System.out.println(mapObj.getKey() + "<===>" + mapObj.getValue());
		}
		
		
		Map<Integer, String>  stdMap1 = new HashMap<Integer,String>();
		stdMap1.put(1007, "Peethi");
		stdMap1.put(1006, "Praveen");
		stdMap1.put(1009, "Venugopal");
		stdMap1.put(1008, "Bhavani");
		stdMap1.put(1010, "Ramani");
		
		System.out.println(stdMap1);
		
		stdMap.putAll(stdMap1);
		
		System.out.println(stdMap);

	}

}

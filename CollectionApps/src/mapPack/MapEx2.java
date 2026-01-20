package mapPack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String>  stdMap = new LinkedHashMap<Integer,String>();
		
		stdMap.put(1001, "Pavan");
		stdMap.put(1002, "Kiran");
		stdMap.put(1003, "Lavanya");
		stdMap.put(1004, "Priya");
		stdMap.put(1005, "Ramana");
		
		System.out.println(stdMap);
		// Traversing
		for(Map.Entry<Integer, String> mapObj : stdMap.entrySet())
		{
			System.out.println(mapObj.getKey() + "<===>" + mapObj.getValue());
		}
		
		Map<Integer, String>  stdMap1 = new LinkedHashMap<Integer,String>();
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

package CollectionPackSets;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set<String> setObj = new HashSet<String>();
		setObj.add("Pavan");
		setObj.add("Kiran");
		setObj.add("Paramesh");
		setObj.add("Pavan");
		setObj.add("Kamal");
		setObj.add("Kalyani");
		setObj.add(null);
		
		System.out.println(setObj);
		
		for(String st : setObj)
		{
			if(st!=null)				
				System.out.print(st + "\t");
		}
	}

}

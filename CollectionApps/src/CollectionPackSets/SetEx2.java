package CollectionPackSets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		Set<String> setObj = new LinkedHashSet<String>();
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

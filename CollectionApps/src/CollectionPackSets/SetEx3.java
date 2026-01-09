package CollectionPackSets;

import java.util.Set;
import java.util.TreeSet;

public class SetEx3 {

	public static void main(String[] args) {
		Set<String> setObj = new TreeSet<String>();
		setObj.add("Pavan");
		setObj.add("Kiran");
		setObj.add("Paramesh");
		setObj.add("Pavan");
		setObj.add("Kamal");
		setObj.add("Kalyani");

		
		System.out.println(setObj);
		
		for(String st : setObj)
		{
			if(st!=null)				
				System.out.print(st + "\t");
		}
	}
}

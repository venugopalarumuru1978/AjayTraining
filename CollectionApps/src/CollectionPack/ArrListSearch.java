package CollectionPack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrListSearch {

	public static void main(String[] args) {
		
		List<String> strLst = new ArrayList<String>();
		strLst.add("Pavan");
		strLst.add("Lavanya");
		strLst.add("Murali");
		strLst.add("Sahasra");
		strLst.add("Priya");
		
		System.out.println(strLst);
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to search");
		String str = sc.next();
		
		if(strLst.contains(str))
			System.out.println("String Existed");
		else
			System.out.println("String Not existed");
	}

}

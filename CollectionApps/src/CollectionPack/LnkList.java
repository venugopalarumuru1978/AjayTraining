package CollectionPack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LnkList {

	public static void main(String[] args) {

		List<Integer>  arrLst = new LinkedList<Integer>();
		arrLst.add(100);
		arrLst.add(200);
		arrLst.add(300);
		arrLst.add(100);
		arrLst.add(500);
		arrLst.add(700);
		
		System.out.println(arrLst);
		
		for(int n :arrLst)  // for each loop
		{
			System.out.print(n + "  ");
		}
		System.out.println();
		Iterator  itrLst = arrLst.iterator();
	/*
	 * next()
	 * hasNext()	
	 */
		while(itrLst.hasNext())
		{
			System.out.println(itrLst.next());
		}
		System.out.println();
		
		List<String> strLst = new LinkedList<String>();
		strLst.add("Pavan");
		strLst.add("Lavanya");
		strLst.add("Murali");
		strLst.add("Sahasra");
		strLst.add("Priya");
		
		System.out.println(strLst);
		
		for(String str :strLst)  // for each loop
		{
			System.out.print(str + "  ");
		}
		System.out.println();
		Iterator  itr1 = strLst.iterator();
	/*
	 * next()
	 * hasNext()	
	 */
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}	
	}
}

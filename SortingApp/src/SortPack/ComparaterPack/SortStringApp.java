package SortPack.ComparaterPack;

import java.util.Set;
import java.util.TreeSet;

public class SortStringApp {

	public static void main(String[] args) {
		Set<StringBuffer>  strData = new TreeSet<StringBuffer>();
		
		strData.add(new StringBuffer("Peter"));
		strData.add(new StringBuffer("Zaheer"));
		strData.add(new StringBuffer("Amar"));
		strData.add(new StringBuffer("Chandu"));
		strData.add(new StringBuffer("Baskar"));
		
		
		System.out.println(strData);
	}

}

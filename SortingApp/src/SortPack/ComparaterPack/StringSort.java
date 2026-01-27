package SortPack.ComparaterPack;

import java.util.Comparator;

public class StringSort implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer s1, StringBuffer s2) {
		// TODO Auto-generated method stub
		return s1.toString().compareTo(s2.toString());
	}

}

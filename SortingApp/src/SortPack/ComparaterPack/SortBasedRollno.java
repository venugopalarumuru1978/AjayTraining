package SortPack.ComparaterPack;

import java.util.Comparator;

public class SortBasedRollno implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return Integer.compare(s1.getRno(), s2.getRno());
	}
	

}

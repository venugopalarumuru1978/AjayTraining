package SortPack.ComparaterPack;

import java.util.Comparator;

public class SortBasedAge implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return Integer.compare(s1.getAge(), s2.getAge());
	}

}

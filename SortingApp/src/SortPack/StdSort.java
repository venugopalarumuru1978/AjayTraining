package SortPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StdSort {

	public static void main(String[] args) {

		List<Student> stdList = new ArrayList<Student>();
		
		Student std = new Student(104, "Pavan", 23);
		stdList.add(std);
		
		std = new Student(101, "Kamal", 21);
		stdList.add(std);
		
		std = new Student(105, "Lavanya", 22);
		stdList.add(std);

		std = new Student(102, "AnuRadha", 26);
		stdList.add(std);

		std = new Student(103, "Pavani", 28);
		stdList.add(std);

		for(Student s1 : stdList)
			System.out.println(s1);
		
		Collections.sort(stdList);
		
		System.out.println("After Sorting ");
		for(Student s1 : stdList)
			System.out.println(s1);
		
	}

}

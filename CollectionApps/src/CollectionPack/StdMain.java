package CollectionPack;

import java.util.ArrayList;
import java.util.List;

public class StdMain {

	public static void main(String[] args) {
		
		List<Student>  stdList = new ArrayList<Student>();
		
		Student std = new Student(1001, "Pavan","Java", 25000.00f);
		//System.out.println(std);
		
		stdList.add(std);
		std = new Student(1002, "Karan","Java", 25000.00f);
		stdList.add(std);
		std = new Student(1003, "Kamal","Python", 35000.00f);
		stdList.add(std);
		std = new Student(1004, "Komali","Python", 35000.00f);
		stdList.add(std);
		std = new Student(1005, "Jagan","Java", 25000.00f);
		stdList.add(std);
		
		System.out.println(stdList);
		
		for(Student st : stdList)
			System.out.println(st);
		
		for(Student st : stdList)
		{
			System.out.println("Roll Number : " + st.getRollno());
			System.out.println("Student Name : " + st.getSname());
			System.out.println("Student Course : " + st.getCourse());
			System.out.println("Course Fees : " + st.getFees());
			System.out.println("--------------");
		}
	}

}

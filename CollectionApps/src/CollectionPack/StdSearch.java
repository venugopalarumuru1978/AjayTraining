package CollectionPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StdSearch {

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
		
		
		for(Student st : stdList)
			System.out.println(st);
		System.out.println("============================");
		
		boolean  stdChk = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number ");
		int rno = sc.nextInt();  //1003
		
		for(Student st : stdList)
		{
			if(st.getRollno()==rno)
			{
				stdChk = true;
				System.out.println("Roll Number : " + st.getRollno());
				System.out.println("Student Name : " + st.getSname());
				System.out.println("Student Course : " + st.getCourse());
				System.out.println("Course Fees : " + st.getFees());
				break;
			}
		}
		
		if(stdChk==false)
				System.out.println("Std Not Found...");
	}

}

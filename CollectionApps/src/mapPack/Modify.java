package mapPack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Modify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String>  stdMap = new HashMap<Integer,String>();
		
		stdMap.put(1001, "Pavan");
		stdMap.put(1002, "Kiran");
		stdMap.put(1003, "Lavanya");
		stdMap.put(1004, "Priya");
		stdMap.put(1005, "Ramana");
		
		System.out.println(stdMap);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a rollno");
		int rno = sc.nextInt();
		
		if(stdMap.containsKey(rno))
		{
			System.out.println("Student Present Name : " + stdMap.get(rno));
			System.out.println("Enter new Name of student");
			String sname = sc.next();
			stdMap.replace(rno, sname);
			System.out.println(stdMap);
		}
		else
			System.out.println("Rollnumber not exist");
	}

}

package filesPack;

import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//wrapper class
		/*String st1 = "100";
		System.out.println("St1 Value : " + st1);
		System.out.println("Add : " + (st1+200));
		
		int n = Integer.parseInt(st1);
		System.out.println("N value : " + n);
		System.out.println("Add : " + (n+200));
		*/
		StudentFiles  std1 = new StudentFiles();
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("1. Add New Student\n2. Show All Students\n3. Search Student\n4. Exit");
			System.out.println("Pick Ur Choice : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				std1.AddNewStudent();
				break;
			case 2:
				std1.ShowStudentsInfo();
				break;
			case 3:
				System.out.println("Enter Course ");
				String stdcourse = sc.next();
				std1.SearchStdBasedOnCourse(stdcourse);
				break;
			case 4:
				System.out.println("Thanks for using app");
				System.exit(0);			
			}
		}
		while(true);
	}
}

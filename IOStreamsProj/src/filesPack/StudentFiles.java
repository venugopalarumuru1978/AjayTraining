package filesPack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class StudentFiles {

	public void AddNewStudent() throws Exception
	{
		// reading data from keyboard
		BufferedReader brObj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Student Name : ");
		String sname = brObj.readLine();
		
		System.out.println("Student Course : ");
		String course = brObj.readLine();
		
		System.out.println("Course Fees : ");
		float fees = Float.parseFloat(brObj.readLine());
		
		String stdinfo = sname + "\t" + course + "\t" + fees + "\n";
		
		FileWriter fwObj = new FileWriter("E:\\AjaySessions\\FilesInfo\\student.txt", true);
		fwObj.write(stdinfo);
		fwObj.close();
		System.out.println("New Student Added...");
	}
	
	public void ShowStudentsInfo() throws Exception
	{
		FileReader frObj = new FileReader("E:\\AjaySessions\\FilesInfo\\student.txt");
		BufferedReader  brObj = new BufferedReader(frObj);
	
		String finfo = brObj.readLine();
		
		while(finfo!=null)
		{
				System.out.println(finfo);
				finfo = brObj.readLine();
		}
		brObj.close();
		frObj.close();
	}
	
	public void SearchStdBasedOnCourse(String course) throws Exception
	{
		FileReader frObj = new FileReader("E:\\AjaySessions\\FilesInfo\\student.txt");
		BufferedReader  brObj = new BufferedReader(frObj);
	
		boolean courseCheck = false;
		
		String finfo = brObj.readLine();
		
		while(finfo!=null)
		{
				if(finfo.contains(course))
				{
					System.out.println(finfo);
					courseCheck = true;
				}
				finfo = brObj.readLine();
		}
		
		if(courseCheck==false)
			System.out.println("No Course exist with given Name");
		
		brObj.close();
		frObj.close();
	}
}

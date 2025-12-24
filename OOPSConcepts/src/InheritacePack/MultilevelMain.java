package InheritacePack;

class Student
{
	protected String sname, course;
	
	public void getStd(String sname, String course)
	{
		this.sname = sname;
		this.course = course;
	}
}


class Marks extends Student
{
	protected int sub1, sub2;
	public  void getMarks(int s1, int s2) {
		this.sub1 = s1;
		this.sub2 = s2;
	}
}

class Results extends Marks
{
	public void printResults()
	{
		System.out.println("Student Name : " + sname);
		System.out.println("Student Course : " + course);
		System.out.println("Sub-1 Marks : " + sub1);
		System.out.println("Sub-2 Marks : " + sub2);
		System.out.println("Total  : " + (sub1+sub2));
	}
}

public class MultilevelMain {

	public static void main(String[] args) {
		Results r1 = new Results();
		r1.getStd("Pavan", "Java");
		r1.getMarks(45, 60);
		r1.printResults();
		
	}

}

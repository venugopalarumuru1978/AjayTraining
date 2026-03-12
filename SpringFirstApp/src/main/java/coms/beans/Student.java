package coms.beans;

public class Student {

	private String sname;
	private String course;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public Student(String sname, String course) {
		super();
		this.sname = sname;
		this.course = course;
		System.out.println("Constructor");
	}
	
	
}

package SortPack;

public class Student implements Comparable<Student> {

	private int rno;
	private String sname;
	private int age;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student(int rno, String sname, int age) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		return Integer.compare(getRno(), s1.getRno());
		//return Integer.compare(getAge(), s1.getAge());
	}
	
	@Override
	public String toString() {
		return "[Roll Number =" + rno + ", Student Name=" + sname + ", Age=" + age + "]";
	}
	
	
}

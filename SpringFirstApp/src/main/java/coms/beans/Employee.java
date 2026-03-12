package coms.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String ename;
	private List<String> jobs;
	private Set<String> qualifications;
	private Map<String, Integer>  job_sals;
	private Account acc;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> getJobs() {
		return jobs;
	}
	public void setJobs(List<String> jobs) {
		this.jobs = jobs;
	}
	public Set<String> getQualifications() {
		return qualifications;
	}
	public void setQualifications(Set<String> qualifications) {
		this.qualifications = qualifications;
	}
	public Map<String, Integer> getJob_sals() {
		return job_sals;
	}
	public void setJob_sals(Map<String, Integer> job_sals) {
		this.job_sals = job_sals;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void PrintEmp()
	{
		System.out.println("Employee Name : " + this.getEname());
		System.out.println("Employee Jobs : " + this.getJobs());
		System.out.println("Employee Qualifications : " + this.getQualifications());
		System.out.println("Employee Job - Salaries : " + this.getJob_sals());
		System.out.println("Account Number : " +  this.getAcc().getAccNo());
		System.out.println("Bank Name : " +  this.getAcc().getBankName());
	}
}

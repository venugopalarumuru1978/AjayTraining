package coms.apps;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import coms.entities.Employee;

public class EmpApp2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Employee  emp = new Employee();
		System.out.println("Emp Code");
		emp.setEmpno(Integer.parseInt(br.readLine()));
		System.out.println("Emp Name ");
		emp.setEname(br.readLine());
		System.out.println("Emp Job");
		emp.setJob(br.readLine());
		System.out.println("Emp Sal");
		emp.setSalary(Float.parseFloat(br.readLine()));
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		session.persist(emp);
		trans.commit();
		
		System.out.println("New Emp is Added...");
	}
}

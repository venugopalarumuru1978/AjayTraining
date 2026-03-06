package coms.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import coms.entities.Employee;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		Employee  emp = new Employee();
		emp.setEmpno(1001);
		emp.setEname("Sravani");
		emp.setJob("Tester");
		emp.setSalary(9000.00f);
		
		session.persist(emp);
		trans.commit();
		
		System.out.println("New Emp is Added...");
	}
}

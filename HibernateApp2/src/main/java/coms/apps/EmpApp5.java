package coms.apps;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import coms.entities.Employee;
import jakarta.persistence.TypedQuery;

public class EmpApp5 {
// update emp
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.println("Emp Number");
		int eno = sc.nextInt();
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		TypedQuery qry = session.createQuery("from Employee where empno=:en");  // Employee is class name
		qry.setParameter("en", eno);
		List<Employee> emplist =  qry.getResultList();
		
		if(emplist.isEmpty())
			System.out.println("Emp Not found");
		else
		{
			Employee emp = emplist.get(0);
			System.out.println("Present name of Emp : " + emp.getEname());
			System.out.println("Enter New name of Employee");
			String ename = sc.next();
			
			qry = session.createQuery("Update Employee set ename=:ena where empno=:en");  // Employee is class name
			qry.setParameter("ena", ename);
			qry.setParameter("en", eno);
			qry.executeUpdate();
			trans.commit();
			System.out.println("Emp Updated....");
		}
	}
}

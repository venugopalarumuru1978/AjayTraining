package coms.apps;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import coms.entities.Employee;
import jakarta.persistence.TypedQuery;

public class EmpApp3 {
// show all emps
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		TypedQuery qry = session.createQuery("from Employee");  // Employee is class name
		List<Employee> emplist = qry.getResultList();
		
		for(Employee e : emplist)
			System.out.println(e.getEmpno() + "\t" + e.getEname() + "\t" + e.getJob() + "\t" + e.getSalary());
	}
}

package com.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class StdApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		Student std = new Student();
		std.setRollno(1002);
		std.setSname("Geetha");
		std.setCourse("Java");
		std.setFees(15000.00f);
		
		session.persist(std);
		trans.commit();
	}
}

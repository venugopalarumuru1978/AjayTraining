package coms.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coms.beans.Cricket;
import coms.beans.Student;

public class CrkApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  context = new ClassPathXmlApplicationContext("beanConfig.xml");
		Cricket  crk  = (Cricket)context.getBean("crkObj");
		
		System.out.println(crk.getCrno());
		System.out.println(crk.getCrname());
		System.out.println(crk.getGame());
		System.out.println(crk.getRuns());
		
		System.out.println("=============");
		Student std  = (Student)context.getBean("stdObj");
		System.out.println(std.getSname());
		System.out.println(std.getCourse());
	}

}

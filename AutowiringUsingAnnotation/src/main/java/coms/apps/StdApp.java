package coms.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coms.beans.Student;

public class StdApp {
	public static void main(String[] args)
	{
		ApplicationContext  context = new ClassPathXmlApplicationContext("beanConfig.xml");
		Student std  = (Student)context.getBean("stdObj");
		System.out.println(std.getSname());
		System.out.println(std.getLocation());
		System.out.println(std.getCurs().getCname());
		System.out.println(std.getCurs().getDuration());
		System.out.println(std.getCurs().getFees());
	}
}

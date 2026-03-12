package coms.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coms.beans.Cricket;
import coms.beans.Employee;
import coms.beans.Student;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  context = new ClassPathXmlApplicationContext("empConfig.xml");
		Employee  emp = (Employee)context.getBean("empObj");
		emp.PrintEmp();
	}
}

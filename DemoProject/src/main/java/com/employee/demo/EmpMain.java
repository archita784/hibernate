package com.employee.demo;



import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;

public class EmpMain {
	public static void main(String[] args) {
		SessionFactory factory=Hibernateutil.getSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee emp=new Employee();
		emp.setName("jo");
		emp.setCity("banglore");
		emp.setEmpid(10);
		
		session.save(emp);
		transaction.commit();
		
		
	}

}

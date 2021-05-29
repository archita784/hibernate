package com.association.OneToOne;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;





public class OneClient {
	public static void main(String[] args) {
		SessionFactory factory=HibernetUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Student std=new Student();
		
		std.setStudName("Rohan");
		std.setDepartment("CSE");
		
		Address address=new Address();
		address.setCity("Banglore");
		address.setZip(56786);
		std.setAddress(address);
		
		session.save(std);
		transaction.commit();
		
		
		Query<Student> query = session.createQuery("from Student");
		List<Student> stdList = query.list();
		stdList.forEach(System.out::println);
	}
	
}

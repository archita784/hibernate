package com.association.OneToOne;

import java.time.LocalDate;
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
		Person pr=new Person();
		
		pr.setName("rohan");
		pr.setAge(23);
		pr.setMobile(885878987);
	
		
		Licence lic=new Licence();
		lic.setIssueDate(LocalDate.of(2016, 9, 23));
		lic.setType("LMV");
		pr.setLicense(lic);
		
		session.save(pr);
		transaction.commit();
		
		
		Query<Person> query = session.createQuery("from Person");
		List<Person> personList = query.list();
		personList.forEach(System.out::println);
	}
	
}

package com.association.OneToMany;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.association.OneToOne.Student;



public class ManyClient {

	public static void main(String[] args) {
		SessionFactory factory=HibernetUtil.getSessionFactory();
		Session session=factory.openSession();
		//Transaction transaction=session.beginTransaction();
//		Publisher pub=new Publisher();
//		pub.setName("Good publications");
//		
//		Book book1=new Book("Html","Ram","tech",1900);
//		Book book2=new Book("MyStory","Roh","Self",2100);
//		/*
//		 * Book book3=new Book("CaptonCrook","Steve","fiction",900);
//		 */
	Set<Book> bookList=new HashSet<>();
//		bookList.add(book1);
//		bookList.add(book2);
//		session.save(pub);
//		transaction.commit();
//		/* bookList.add(book3); */
		
		/*
		 * System.out.println(bookList); pub.setBookList(bookList); session.save(pub);
		 * transaction.commit();
		 * 
		 * transaction=session.beginTransaction(); pub=new Publisher();
		 * pub.setName("Good publications"); session.save(pub); transaction.commit();
		 * session.close();
		 */
	Transaction transaction= session.beginTransaction();
    Publisher pub1 = new Publisher();
    pub1.setName("Good Publishers");
    session.save(pub1);
    transaction.commit();
   
    transaction = session.beginTransaction();
    Query<Publisher> query = session.createQuery("from Publisher p where p.name like:pubname");
    query.setParameter("pubname","Good Publishers");
    Publisher publisher = query.uniqueResult();
    publisher.setBookList(bookList);
    session.save(publisher);
    transaction.commit();
    session.close();

		
	
		
		 
	}
}

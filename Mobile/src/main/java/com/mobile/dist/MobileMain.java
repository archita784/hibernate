package com.mobile.dist;

import java.util.List;

import org.hibernate.query.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MobileMain {
	public static void main(String[] args) {
		SessionFactory factory = hibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Mobile mb = new Mobile();
		mb.setBrand("vivo");
		mb.setMobileId(2);
		mb.setModel("cv");
		mb.setPrice(14000);

		//session.save(mb);
		transaction.commit();

		Query<Mobile> query = session.createQuery("from Mobile");
		List<Mobile> mbList = query.list();
		mbList.forEach(System.out::println);

		// sql query
//        String sql = "select from HiberMobile where brand = ?";



      // using named parameters
     String sql = "from Mobile m where m.brand like :mybrand";
      Query newQuery = session.createQuery(sql);
      newQuery.setParameter("mybrand", "oppo");
        List<Mobile> mbbybrand = newQuery.list();



      // using method chaining
      session.createQuery(sql).setParameter("mybrand", "oppo").list().forEach(System.out::println);
      System.out.println();
      // positional parameters
      String nsql = "from Mobile e  where e.brand like ?1";
      session.createQuery(nsql).setParameter(1, "vivo").list().forEach(System.out::println);
      System.out.println();
      // to get one object
      Mobile mobile = (Mobile)session.get(Mobile.class,12);
      System.out.println(mobile);
      System.out.println();
      
      //get unique result
      sql = "from Mobile e  where e.model like :mymodel";
      newQuery = session.createQuery(sql);
      newQuery.setParameter("mymodel", "m2 pro");
      Mobile mbbymodel = (Mobile)newQuery.uniqueResult();
      System.out.println(mbbymodel);
  }



	}



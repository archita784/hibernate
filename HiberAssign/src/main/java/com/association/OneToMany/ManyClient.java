package com.association.OneToMany;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;





public class ManyClient {

	public static void main(String[] args) {
		SessionFactory factory=HibernetUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Restaurent res=new Restaurent();
		res.setName("bobies");
		res.setCity("goa");
		res.setLocation("bank road");
		
		Menu menu1=new Menu("lunch", "veg",530 );
		Menu menu2=new Menu("dinner", "Nonveg",800 );
		Menu menu3=new Menu("breakfast", "veg",230 );
		
		Set<Menu> menuList=new HashSet<>();
		menuList.add(menu1);
		menuList.add(menu2);
		menuList.add(menu3);
		

		session.save(res);
		transaction.commit();

	transaction=session.beginTransaction();
    Query<Restaurent> query = session.createQuery("from Restaurent r where r.name like:resname");
    query.setParameter("resname","royal darbar");
    Restaurent resto = query.uniqueResult();
    resto.setMenuList(menuList);
    session.save(resto);
    transaction.commit();
    session.close();

		
	
		
		 
	}
}

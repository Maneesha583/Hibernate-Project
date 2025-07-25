package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateCreate {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = new Employee(1002, "jame", 5000);
		session.save(e1);
		
		transaction.commit();
		
	
		session.close();
		factory.close();

	}

}

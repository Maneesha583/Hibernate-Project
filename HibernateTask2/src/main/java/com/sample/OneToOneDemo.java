package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//person object1
//		Person p1 = new Person();
//		p1.setpId(1001);
//		p1.setpName("Rohit");
//		BloodGroup b1=new BloodGroup();
//		b1.setBgId(1);
//		b1.setBgName("A+");
//		p1.setBg(b1);
//		//person 2
//		Person p2 = new Person();
//		p2.setpId(1002);
//		p2.setpName("Rajesh");
//		BloodGroup b2=new BloodGroup();
//		b2.setBgId(2);
//		b2.setBgName("A-");
//		p2.setBg(b2);
//		session.save(p1);
//		session.save(p2);
//		session.save(b1);
//		session.save(b2);
//		transaction.commit();
		
		//fetch the data
		
		Person per1=(Person)session.get(Person.class,1001);
		System.out.println(per1.getpName());
		System.out.println(per1.getBg().getBgName());
		
		session.close();
		factory.close();
		

	}

}

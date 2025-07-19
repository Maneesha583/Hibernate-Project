package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
//		Studentt st1=new Studentt(1001,"raju",9876545669l);
//		Course c1 = new Course(2001, "Hibernate", "10days");
//		st1.setCourse(c1);
//        
//		Studentt st2=new Studentt(1002,"rani",9876415669l);
//		Course c2 = new Course(2002, "Springboot", "30days");
//		st2.setCourse(c2);
//		
//		
//		session.save(st1);
//		session.save(st2);
//		
//		
//		Transaction transaction = session.beginTransaction();	
//		transaction.commit();
		
		Studentt s1=(Studentt)session.get(Studentt.class, 1001);
		System.out.println(s1.getsId());
		System.out.println(s1.getsName());
		System.out.println(s1.getSContact());
		System.out.println(s1.getCourse().getCid());
		System.out.println(s1.getCourse().getcName());
		System.out.println(s1.getCourse().getcDuration());
		
		session.close();
		factory.close();
		
	}

}

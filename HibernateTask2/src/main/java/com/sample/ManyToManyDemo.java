package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		Developer d1 = new Developer();
//		d1.setdId(101);
//		d1.setdName("RaM");
//		Developer d2 = new Developer();
//		d2.setdId(102);
//		d2.setdName("laxman");
//		List<Developer> dList=new ArrayList<Developer>();
//		dList.add(d1);
//		dList.add(d2);
//		
//		Project p1=new Project();
//		p1.setpId(201);
//		p1.setpName("ecommers");
//		Project p2=new Project();
//		p2.setpId(202);
//		p2.setpName("Banking");
//		Project p3=new Project();
//		p3.setpId(203);
//		p3.setpName("Website");
//		Project p4=new Project();
//		p4.setpId(204);
//		p4.setpName("Mobile");
//		
//		List<Project> pList=new ArrayList<Project>();
//		pList.add(p1);
//		pList.add(p2);
//		pList.add(p3);
//		pList.add(p4);
//		 d1.setProject(pList);
//		 d2.setProject(pList);
//		 p1.setDeveloper(dList);
//		 p2.setDeveloper(dList);
//		 p3.setDeveloper(dList);
//		 p4.setDeveloper(dList);
//		 session.save(d1);
//		 session.save(d2);
//		 session.save(p1);
//		 session.save(p2);
//		 session.save(p3);
//		 session.save(p4);
		 
		 //fetch data
		 Developer dev1=(Developer)session.get(Developer.class, 102);
		 System.out.println(dev1.getdName());
		 for(Project p:dev1.getProject()) {
			 System.out.println(p.getpName());
		 }
		 System.out.println("*******************************");
		 
		 Project pr1=(Project)session.get(Project.class, 204);
		 System.out.println(pr1.getpName());
		 for(Developer d:pr1.getDeveloper()) {
			 System.out.println(d.getdName());
		 }
		 
		//transaction.commit();
		session.close();
		factory.close();

	}

}

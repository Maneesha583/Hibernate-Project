package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

public class OneToManyDemo {

	public static void main(String[] args) {
	   SessionFactory factory = new Configuration().configure().buildSessionFactory();
	   Session session = factory.openSession();
//	   Transaction transaction = session.beginTransaction();
//	   
//	   //1st ques object
//	   Question q1=new Question();
//	   q1.setqId(301);
//	   q1.setQuestion("What is Java?");
//	   
//	   Question q2=new Question();
//	   q2.setqId(302);
//	   q2.setQuestion("What is Hibernate?");
//	   
//	   Answers a1=new Answers();
//	   a1.setaId(401);
//	   a1.setAnswer("Html is a front end language");
//	   
//	   Answers a2=new Answers();
//	   a2.setaId(402);
//	   a2.setAnswer("Java is oops language");
//	   
//	   Answers a3=new Answers();
//	   a3.setaId(403);
//	   a3.setAnswer("Hibernate is orm tool");
//	   
//	   Answers a4=new Answers();
//	   a4.setaId(404);
//	   a4.setAnswer("Java is platform independent");
//	   
//	   Answers a5=new Answers();
//	   a5.setaId(405);
//	   a5.setAnswer("hibernate is an open source");
//	   
//	   List<Answers> al1=new ArrayList<Answers>();
//	   al1.add(a2);
//	   al1.add(a4);
//	   
//	   List<Answers> al2=new ArrayList<Answers>();
//	   al2.add(a3);
//	   al2.add(a5);
//	   
//	   q1.setAns(al1);
//	   q2.setAns(al2);
//
//	   a2.setQ(q1);
//	   a3.setQ(q2);
//	   a4.setQ(q1);
//	   a5.setQ(q2);
//	   
//session.save(q1);
//session.save(q2);
//session.save(a1);
//session.save(a2);
//session.save(a3);
//session.save(a4);
//session.save(a5);
//
//transaction.commit();
	   
	   //Fetching the data
	   //All the answers of questions
	   Question qu1 = session.get(Question.class, 301);
	   System.out.println(qu1.getQuestion());
	   
	   for(Answers an:qu1.getAns()) {
		   System.out.println(an.getAnswer());
	   }
	   
	   System.out.println("*******************************");
	   
	   //Fetch question based on answer
	   Answers ans=(Answers)session.get(Answers.class, 403);
	   System.out.println(ans.getQ().getQuestion());
	   System.out.println(ans.getAnswer());
	   
session.close();
factory.close();
	}

}

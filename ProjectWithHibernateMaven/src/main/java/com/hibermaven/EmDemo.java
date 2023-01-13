package com.hibermaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Student student1 = new Student();
		student1.setId(121);
		student1.setName("Death");
		student1.setCity("Hell");
		
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Android");
		certificate1.setDuration("2 Month");
		student1.setCerti(certificate1);
		
		Student student2 = new Student();
		student2.setId(111);
		student2.setName("Sucide");
		student2.setCity("Hell");
		
		Certificate certificate2 = new Certificate();
		certificate2.setCourse("Kotlin");
		certificate2.setDuration("2.5 Month");
		student2.setCerti(certificate2);
		
		Session s = factory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		
//		Object save;
		s.save(student1);
		s.save(student2);
		
		tx.commit();
		s.close();
		factory.close();
	}

}


















package com.hibermaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// get and load ex
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		get-student:103
//		session.get() , session.load() both are nearly same 
		Student student = (Student)session.get(Student.class, 103);
		System.out.println(student);
		Address ad = (Address)session.load(Address.class, 1);
		System.out.println(ad);
		
		session.clear();
		factory.close();
	}

}


















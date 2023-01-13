package com.hibermaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args)throws IOException {
		System.out.println("Project Started");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

//        Creating student

		Student st = new Student();
		st.setId(103);
		st.setName("Rajiv");
		st.setCity("India");
		System.out.println(st); 

//		Creating object of class
		Address ad = new Address();
		ad.setStreet("street1");
		ad.setCity("DELHI");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234.32);
		
//		Reading image
		FileInputStream fis = new FileInputStream("src/main/java/yourname.jpg");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);
		
		Session session = factory.openSession();
//		session.beginTransaction(); is used to start the transaction
		session.beginTransaction();
//		session.save(st); it is used to save the transaction
		session.save(st);
		session.save(ad);
//		session.getTransaction().commit(); it is used to get the current transaction and commit it
		session.getTransaction().commit();
//		session.close(); it is used to close the transaction
		session.close();
		System.out.println("Done");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package com.hibermaven.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
//		Creating question
//		Question q1 = new Question();
//		q1.setQuestionId(1212);
//		q1.setQuestion("What is java");;
//		
////		Creating Answer
//		Answer answer = new Answer();
//		answer.setAnswerId(343);
//		answer.setAnswer("java is programming language"); 
//		answer.setQuestion(q1);
////		
//		Answer answer1 = new Answer();
//		answer1.setAnswerId(344);
//		answer1.setAnswer("With the help of java we can create software"); 
//		answer1.setQuestion(q1);
////		
//		Answer answer2 = new Answer();
//		answer2.setAnswerId(345);
//		answer2.setAnswer("java has a diffrent type of framework"); 
//		answer2.setQuestion(q1);
////		
//		List<Answer> list = new ArrayList<Answer>();
//		list.add(answer);
//		list.add(answer1);
//		list.add(answer2);
////		
//		q1.setAnswer(list);
		
////		Creating question
//		Question q2 = new Question();
//		q2.setQuestionId(242);
//		q2.setQuestion("What is collection framework");
//		
//////		Creating Answer
//		Answer answer3 = new Answer();
//		answer3.setAnswerId(344);
//		answer3.setAnswer("API to work with object in java"); 
//		answer3.setQuestion(q2);
//		q2.setAnswer(answer3);
		
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
////		save
//		s.save(q1);
//		s.save(answer);
//		s.save(answer1);
//		s.save(answer2);
////
		
		Question q = (Question)s.get(Question.class, 1212);
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
//		Below step is a Lazzy loading because when we call a size() with answer then ans will be loaded
//		System.out.println(q.getAnswer().size());
		
//		
		
		tx.commit();
		
//		Fetching
//		Question ques = (Question)s.get(Question.class, 1212);
//		System.out.println(ques.getQuestion());
//		System.out.println(ques.getAnswer().getAnswer());
		
		s.close();
		factory.close();
	}

}


















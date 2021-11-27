package com.csi.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.common.annotationfactory.AnnotationFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
private static SessionFactory  factory=new AnnotationConfiguration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		Address address=new Address("sai", "PUNE", "MAHARASHTRA", "INDIA", 411258);
		session.save(address);
		Employee e1=new Employee("SUSHIL", 979999, address);
		Employee e2=new Employee("SWATI", 95925959, address);
		
		session.save(e1);
		session.save(e2);
		transaction.commit();
		
		
		
	}
}

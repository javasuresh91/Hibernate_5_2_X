package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.dto.Address;
import com.hibernate.dto.UserDetails;

public class HibernateApp {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("Suresh");
		Address add = new Address();
		add.setCity("Erode");
		add.setPincode("635001");
		user.setHomeAddress(add);
//		user.setOfzAddress(add);
		try {
			SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
			System.out.println("User Added Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

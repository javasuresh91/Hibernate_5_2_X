package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.dto.UserDetails;

public class HibernateApp {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setName("Suresh");
		user.setAddress("XXX");
		user.setDescription("yyyy");
		user.setJoinedDate(new Date());
		try {
			SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
			System.out.println("User Added Successfully");

			user = null;
			session = sessionFactory.openSession();
			session.beginTransaction();
			user = session.get(UserDetails.class, 1); /** This is used to fetch the record from the Database */
			System.out.println(" user Name retrived using Get: "+user.getName());
			user= session.load(UserDetails.class, 1);
			System.out.println(" user Name retrived using Load: "+user.getName());
			System.out.println("If the Obejct is not in database....");
			user = session.get(UserDetails.class, 2);
			System.out.println("GET : "+user);
			user= session.load(UserDetails.class, 2);
			System.out.println("LOAD : "+user);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.dto.UserDetails;
import com.hibernate.dto.UserNameConstruction;

public class HibernateApp {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setJoinedDate(new Date());
		UserNameConstruction con = new UserNameConstruction();
		con.setDoorNo("1234");
		con.setMblNo("98652");
		user.setUserName(con);
		
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

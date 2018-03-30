package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sample {

	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/mem:h2Repo","sa","");
			Statement s = con.createStatement();
			ResultSet rs=  s.executeQuery("SELECT * FROM INFORMATION_SCHEMA.CATALOGS ");
			while(rs.next()) {
				System.out.println(rs.getString("CATALOG_NAME"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

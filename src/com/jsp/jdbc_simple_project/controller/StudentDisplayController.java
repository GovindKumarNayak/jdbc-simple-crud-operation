package com.jsp.jdbc_simple_project.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class StudentDisplayController {
	static Connection conn;
public static void main(String[] args) {
	
	try {
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		
		String url = "jdbc:mysql://localhost:3306/student-jdbc";
		String user = "root";
		String pass = "root";
		conn = DriverManager.getConnection(url,user,pass);
		Statement st = conn.createStatement();
		String displayQuery = "select * from student";
		//int id = st.executeUpdate(displayQuery);
		ResultSet res = st.executeQuery(displayQuery);
		while(res.next()) {
			int id = res.getInt("id");
			String name = res.getString("name");
			String email = res.getString("email");
  System.out.println("Id   "  + id);
  System.out.println("Name   "  +name);
  System.out.println("Email   "   + email);
  System.out.println ("========================");
		
		
		
		
		}
			} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			conn.close();
		} catch (Exception e) {
		 e.printStackTrace();
		}
	}
}
}

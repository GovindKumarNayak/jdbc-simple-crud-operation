package com.jsp.jdbc_simple_project.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class StudentDeleteController {
	static Connection conn;
public static void main(String[] args) {
	
	try {
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		
		String url = "jdbc:mysql://localhost:3306/ student-jdbc";
		String user = "root";
		String pass = "root";
		conn = DriverManager.getConnection(url,user,pass);
		Statement st = conn.createStatement();
		String deleteQuery = "delete from student where id = 123";
		int id = st.executeUpdate(deleteQuery);
		if (id!=0) {
			System.out.println("data deleted successfully");
		}
		else {
			System.out.println("given id not found");
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

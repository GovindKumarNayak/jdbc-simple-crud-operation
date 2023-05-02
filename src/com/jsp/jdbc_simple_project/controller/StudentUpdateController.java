package com.jsp.jdbc_simple_project.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class StudentUpdateController {
	static Connection conn;
public static void main(String[] args) {
	
	try {
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		String url = "jdbc:mysql://localhost:3306/student-jdbc";
		String user = "root";
		String pass = "root";
		 conn = DriverManager.getConnection(url, user, pass);
	Statement st = conn.createStatement();
	String updateQuery = "update student set name = 'ritesh' where id = 123";
	int id = st.executeUpdate(updateQuery);
	if(id !=0) {
		System.out.println("updated");
	}
	else {
		System.out.println("not updated");
	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block;
		e.printStackTrace();
	}
	
}
}

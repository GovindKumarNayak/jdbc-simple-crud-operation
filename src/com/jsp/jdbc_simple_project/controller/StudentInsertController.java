  package com.jsp.jdbc_simple_project.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class StudentInsertController {
static Connection connection;
	public static void main(String[] args) {
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/student-jdbc";
			String user = "root";
			String pass = "root";
			
			connection = DriverManager.getConnection(url,user,pass);
			
			Statement statement = connection.createStatement();
			
			String studdentInsertQuery = "insert into student values(123,'Govind','govind@gmail.com')";
			
			statement.execute(studdentInsertQuery);
			System.out.println("data addd Successfully");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}

package com.Student_Registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class CommonConnection {

public static Connection con;
	public static Connection getCon() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "Gaurav123");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return con;
	}

}
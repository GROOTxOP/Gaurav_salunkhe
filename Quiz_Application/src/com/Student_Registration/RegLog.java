package com.Student_Registration;


import java.sql.Connection;
import java.sql.PreparedStatement;

import com.Student_Registration.CommonConnection;

public class RegLog {
	public static boolean InsertToRegDB(RegLog2 rl) {
		try {
			Connection con = CommonConnection.getCon();
			String q = "INSERT into students.student_registrations(Firstname,  LastName,  Username, Password, City, Email, MobileNumber)values(?,?,?,?,?,?,?)";
			// PREPARED STATEMENT
			PreparedStatement psmt = con.prepareStatement(q);
			// SET VALUE OF PARAMETER
			psmt.setString(1, rl.getFirstname());
			psmt.setString(2, rl.getLastName());
			psmt.setString(3, rl.getUsername());
			psmt.setInt(4, rl.getPassword());
			psmt.setString(5, rl.getCity());
			psmt.setString(6, rl.getEmail());
			psmt.setInt(7, rl.getMobileNumber());
			
			// EXECUTE
			psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	} 

			
		}

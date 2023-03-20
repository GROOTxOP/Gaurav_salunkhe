package com.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.Student_Registration.CommonConnection;
import com.Student_Registration.QuestionsAdd;
public class P3 {
	private static final String String = null;

	public static void abc() throws Exception {
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Welcome Admin");
			System.out.println("\n1. Display score with detail");
			System.out.println("2. fetch score by ID");
			System.out.println("3. want to add question");
			int c = sc.nextInt();

			// 1.Display all Score
			if (c == 1) {

				Connection con = CommonConnection.getCon();
				String q = "Select * from student_registrations order by score DESC";
				PreparedStatement psmt = con.prepareStatement(q);
				ResultSet rs = psmt.executeQuery();
				while (rs.next()) {
					System.out.println("First Name : " + rs.getString(2));
					System.out.println("Last Name : " + rs.getString(3));
					System.out.println("Score : " + rs.getInt(9));
					System.out.println("\n-------------------------------------------------\n");
				}
			}

			// Fetch score by ID
			if (c == 2) {

				System.out.println("Enter student's ID");
				int Id = sc.nextInt();
				Connection con = CommonConnection.getCon();
				String q = "Select * from student_registrations Where Id='" + Id + "'";
				PreparedStatement psmt = con.prepareStatement(q);
				ResultSet rs = psmt.executeQuery();
				while (rs.next()) {
					System.out.println("Id : " + rs.getInt(1));
					System.out.println("Score : " + rs.getInt(9));
					System.out.println("\n-------------------------------------------------\n");
				}
			}

			// Question & there option
			if (c == 3) {
				QuestionsAdd.AddQuestion();
			}

			if (c > 3) {
				System.exit(0);
			}
		}
	}
}




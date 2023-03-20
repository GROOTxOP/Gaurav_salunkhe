package com.Student_Registration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.log.Log;
public class logics {
	
	private static final String r2 = null;
	private static String username;
	private static int password;
	public logics( String firstName, String LastName, String Username, int Password, String City, String Email, int MobileNumber) {
	}

	public static void logics() {

		System.out.println("Welcome Student");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n1. Student Registration");
			System.out.println("2. Student Login");
			System.out.println("3. Exit Application");
			int c = sc.nextInt();

			if (c == 1) {
				// Registration
				System.out.println("Enter your First Name : ");
				String Firstname = sc.next();

				System.out.println("Enter your Last Name : ");
				String LastName = sc.next();

				System.out.println("Enter your Username : ");
				String Username = sc.next();

				System.out.println("Enter your Password : ");
				int Password = sc.nextInt();

				System.out.println("Enter your City : ");
				String City = sc.next();

				System.out.println("Enter your Email : ");
				String Email = sc.next();

				System.out.println("Enter your Mobile number : ");
				int MobileNumber = sc.nextInt();

				// CREATE rl OBJECT TO STORE Registration Data
				RegLog2 rl = new RegLog2(Firstname, LastName, Username, Password, City, Email, MobileNumber);
				boolean answer = RegLog.InsertToRegDB(rl);
				if (answer) {
					System.out.println("Record Inserted succesfully");
				} else {
					System.out.println("Somthing went worng record not inserted");
				}
				System.out.println(rl);

			} else if (c == 2) {
				// Login
				try {
					Connection con = CommonConnection.getCon();
					Statement S = con.createStatement();
					System.out.println("Enter Username");
					String Username = sc.next();

					System.out.println("Enter Password");
					String Password = sc.next();
					String s = "Select * from student_registrations Where Username='" + Username + "' && Password='"
							+ Password + "'";

					ResultSet rs = S.executeQuery(s);
					if (rs.next()) {
						System.out.println("Login succesfully");
						RegLog3.r2();

					} else {
						System.out.println("Wrong Information");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				return;
			}

			if (c == 3) {
				// Exit
				System.out.println("Exit successfully");
				break;
			} else {
			}
		}
	}
	
				
			
}	

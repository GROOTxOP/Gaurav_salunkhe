package com.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.Student_Registration.CommonConnection;
import com.Student_Registration.logics;

public class P1 {
	public static void main(String[] args) {

		System.out.println("--------------------------------------------");
		System.out.println("      ** WELCOME TO QUIZ COMPITITION **         ");
		System.out.println("---------------------------------------------");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n1. Admin");
			System.out.println("2. Student ");
			int c = sc.nextInt();
			if (c == 1) {
				// Login
				try {

					Connection con = CommonConnection.getCon();
					Statement S = con.createStatement();
					System.out.println("Enter Admin Username");
					String Username = sc.next();

					System.out.println("Enter Admin Password");
					String Password = sc.next();

					String s = "Select * from Admin Where Username='" + Username + "' && Password='" + Password + "'";

					ResultSet rs = S.executeQuery(s);

					if (rs.next()) {
						System.out.println("Login succesfully");
						P3.abc();

					} else {
						System.out.println("Wrong Information");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (c == 2) {
				logics.logics();
			}
		}

	}
	}


			
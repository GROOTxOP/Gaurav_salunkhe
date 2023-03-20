package com.Student_Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.Student_Registration.CommonConnection;

public class QuestionsAdd {
	 int count=0;
	static PreparedStatement ps= null;
	
public static void insertQuestions(String qName,String option1,String option2,String option3,String option4, int optionc) throws SQLException{
	try {
		
		Connection con = CommonConnection.getCon();
		ps= con.prepareStatement("insert into test(QName,option1,option2,option3,option4,optionc)values(?,?,?,?,?,?)");
		ps.setString(1,qName);
		ps.setString(2,option1);
		ps.setString(3,option2);
		ps.setString(4,option3);
		ps.setString(5,option4);
		ps.setInt(6,optionc);
		
		int i=ps.executeUpdate();
		System.out.println("Record is inserted successfully...");
		
	} catch (Exception e) {
		e.printStackTrace();
	} 
}
public static  void AddQuestion() throws SQLException {
	Scanner sc = new Scanner(System.in);
	QuestionsAdd add= new QuestionsAdd();
	
	System.out.println("Enter your Question>>");
	String qName=sc.nextLine();
	
	System.out.println("Enter your Options");
	System.out.println("Optn 1>>");
	String option1= sc.nextLine();
	System.out.println("Optn 2>>");
	String option2= sc.nextLine();
	System.out.println("Optn 3>>");
	String option3= sc.nextLine();
	System.out.println("Optn 4>>");
	String option4= sc.nextLine();
	System.out.println("Please enter Answer option !!");
	int optionc=sc.nextInt();
	
	add.insertQuestions(qName, option1, option2, option3, option4, optionc);
	}

	public static void displyQuestions() throws SQLException {

		CommonConnection.getCon();
		Scanner sc = new Scanner(System.in);

		try {
			Connection con = CommonConnection.getCon();
			int count = 0;

			ps = con.prepareStatement("select * from test");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Question" + rs.getString(2));
				System.out.println("Option 1>>" + rs.getString(3));
				System.out.println("Option 2>>" + rs.getString(4));
				System.out.println("Option 3>>" + rs.getString(5));
				System.out.println("Option 4>>" + rs.getString(6));

				System.out.println("");
				System.out.println("Enter Your Answer Between Option 1 To 4 ");
				int answer = sc.nextInt();
				System.out.println("");
				int x = rs.getInt(7);
				if (answer == x) {
					count++;
					System.out.println("Your Score Is ..> " + count);
				} else {
					System.out.println("You Enter Invalid option ");
				}
			}
			System.out.println("Your Final Score Is \t," + count);
			System.out.println("--*--You Complete Quiz_Question ThankYou--*--");
			QuestionsAdd add = new QuestionsAdd();
			add.insertCount(count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
public void insertCount(int count) throws SQLException	{
	
	Connection con = CommonConnection.getCon();
	ps= con.prepareStatement("insert into student_registrations(count)values(?)");
	ps.setInt(9,count);
}
}

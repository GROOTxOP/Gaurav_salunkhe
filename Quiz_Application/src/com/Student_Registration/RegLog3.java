package com.Student_Registration;

import java.sql.SQLException;
import java.util.Scanner;

public class RegLog3 {
	public static void r2() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Are You Ready For Quiz Compitition :- (Yes / No)  ");
		String S = sc.next();

		QuestionsAdd add = new QuestionsAdd();

		if (S.equalsIgnoreCase("Yes")) {
			for (int i = 1; i <= 10; i++) {
				add.displyQuestions();
			}
		} else {
			System.out.println(" Logging out ");
		}
	}
}



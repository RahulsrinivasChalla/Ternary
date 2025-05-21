package com.ternary;

import java.util.Scanner;

public class TernaryOperator {

	public class Ternany {
		public static void main(String[] args) {
			Scanner rahul = new Scanner(System.in);
			System.out.println("ENTER MARKS : ");
			int marks = rahul.nextInt();

			String grade = (marks > 90) && (marks <= 100) ? " GRADE A"
					: (marks > 70) && (marks <= 90) ? "GRADE B"
							: (marks > 50) && (marks <= 70) ? "GRADE C"
									: (marks > 50) && (marks <= 0) ? "FAIL" : "INVALID";
			System.out.println(marks + " marks : " + grade);

			rahul.nextLine();
			System.out.println("ENTER NAME : ");
			String name = rahul.nextLine();
			System.out.println(name + " got " + grade);
			rahul.close();

		}

	}

}

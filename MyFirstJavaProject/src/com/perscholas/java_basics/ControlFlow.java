package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		int x = 7;
		if (x < 10)
			System.out.println("Less than 10");
		// else System.out.println("Greater than 10");

		// 2
		x = 15;
		if (x < 10)
			System.out.println("Less than 10");
		else
			System.out.println("Greater than 10");

		// 3
		x = 20;
		if (x < 10)
			System.out.println("Less than 10");
		else if (x < 20)
			System.out.println("Between 10 and 20");
		else
			System.out.println("Greater than 20");

		// 4
		x = 5;
		if (x < 10 || x > 20)
			System.out.println("Out of range");
		else
			System.out.println("In range");
		
		//5
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a score!!!: ");
		int score = scan.nextInt();
		if(score < 0 || score > 100) System.out.println("Score out of range");
		else if(score < 60) System.out.println("F");
		else if (score < 70) System.out.println("D");
		else if (score < 80) System.out.println("C");
		else if (score < 90) System.out.println("B");
		else if (score <= 100) System.out.println("A");
		
		//6
		System.out.println("Enter a number between 1 and 7!!!: ");
		int number = scan.nextInt();
		switch (number) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Out of range");
			break;
			
		}
		
		//7
		System.out.println("Enter your income: ");
		int income = scan.nextInt();
		System.out.println("Enter your status: ");
		System.out.println("1: Single");
		System.out.println("2: Married Filing Jointly");
		System.out.println("3: Married Filing Separately");
		System.out.println("4: Head of Household");
		int status = scan.nextInt();
		scan.close();
		switch (status) {
		case 1:
			if(income < 0) System.out.println("Income must be positive");
			else if(income <= 8350) System.out.println("Tax is 10%");
			else if(income <= 33950) System.out.println("Tax is 15%");
			else if(income <= 82250) System.out.println("Tax is 25%");
			else if(income <= 171550) System.out.println("Tax is 28%");
			else if(income <= 372950) System.out.println("Tax is 33%");
			else System.out.println("Tax is 35%");
			break;
		case 2:
			if(income < 0) System.out.println("Income must be positive");
			else if(income <= 16700) System.out.println("Tax is 10%");
			else if(income <= 67900) System.out.println("Tax is 15%");
			else if(income <= 137050) System.out.println("Tax is 25%");
			else if(income <= 208850) System.out.println("Tax is 28%");
			else if(income <= 372950) System.out.println("Tax is 33%");
			else System.out.println("Tax is 35%");
			break;
		case 3:
			if(income < 0) System.out.println("Income must be positive");
			else if(income <= 8350) System.out.println("Tax is 10%");
			else if(income <= 33950) System.out.println("Tax is 15%");
			else if(income <= 68525) System.out.println("Tax is 25%");
			else if(income <= 104425) System.out.println("Tax is 28%");
			else if(income <= 186475) System.out.println("Tax is 33%");
			else System.out.println("Tax is 35%");
			break;
		case 4:
			if(income < 0) System.out.println("Income must be positive");
			else if(income <= 11950) System.out.println("Tax is 10%");
			else if(income <= 45500) System.out.println("Tax is 15%");
			else if(income <= 117450) System.out.println("Tax is 25%");
			else if(income <= 190200) System.out.println("Tax is 28%");
			else if(income <= 372950) System.out.println("Tax is 33%");
			else System.out.println("Tax is 35%");
			break;
		default:
			System.out.println("Out of range");
			break;
			
		}
	}

}

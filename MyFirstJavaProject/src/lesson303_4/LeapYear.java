package lesson303_4;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year!!!");
		int year = scan.nextInt();
		scan.close();
		if(year % 400 == 0)
			System.out.println(year + " is a leap year.");
		else if((year % 100 != 0) && (year % 4 == 0))
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
		
		

	}

}

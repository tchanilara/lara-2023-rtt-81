package lesson303_3;

import java.util.Scanner;

public class MonetaryUnits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an amount: ");
		Scanner scan = new Scanner(System.in);
		double number = scan.nextDouble();
		scan.close();
		System.out.println(number);
		System.out.printf("%d Dollars\n", (int)number);
		int secondPart = (int)((number - (int)number)*100);
		System.out.printf("%d quarters\n", secondPart / 25);
		secondPart %= 25;
		System.out.printf("%d dime\n", secondPart / 10);
		secondPart %= 10;
		System.out.printf("%d nickels\n", secondPart / 5);
		secondPart %= 5;
		System.out.printf("%d quarters\n", secondPart);
		

	}

}

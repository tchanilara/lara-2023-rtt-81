package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double n1;
		double n2;
		Scanner scan = new Scanner(System.in);

		while (true) {
			int userSelection = calc.displayMainUserMenu(scan);
			n1 = calc.input(scan);
			n2 = calc.input(scan);

			if (userSelection == 1) {// add
				System.out.println(n1 + " + " + n2 + " = " + calc.sum(n1, n2));
			} else if (userSelection == 2) {// substract
				System.out.println(n1 + " - " + n2 + " = " + calc.substract(n1, n2));
			} else if (userSelection == 3) {// multply
				System.out.println(n1 + " * " + n2 + " = " + calc.multiply(n1, n2));
			} else if (userSelection == 4) {// divide
				if (n2 == 0) {
					System.out.println("The second number must not be 0");
					continue;
				}
				System.out.println(n1 + " / " + n2 + " = " + calc.divide(n1, n2));
			} else if (userSelection == 5) {// exit
				System.exit(0);
			} else {
				System.out.println("User input " + userSelection + " is unknonw.   Try again;");
			}
		}

	}

	public int displayMainUserMenu(Scanner input) {
		int select;
		System.out.println("1) Add operator");
		System.out.println("2) Subtract operator");
		System.out.println("3) Multiply operator");
		System.out.println("4) Divide operator");
		System.out.println("5) Exit");

		System.out.print("\nWhat do you want to do? ");
		// try {
		select = input.nextInt();
		input.nextLine();
		/*
		 * } catch(java.util.InputMismatchException e) {
		 * System.out.println("Enter an integer "); }
		 */

		return select;
	}

	public double input(Scanner scan) {
		System.out.print("Enter a number:");
		// try {
		return scan.nextDouble();
		/*
		 * } catch(java.util.InputMismatchException e) {
		 * System.out.println("Enter an double "); }
		 */

	}

	public double sum(double n1, double n2) {
		return n1 + n2;

	}

	public double substract(double n1, double n2) {
		return n1 - n2;

	}

	public double multiply(double n1, double n2) {
		return n1 * n2;

	}

	public double divide(double n1, double n2) {
		return n1 / n2;

	}

}

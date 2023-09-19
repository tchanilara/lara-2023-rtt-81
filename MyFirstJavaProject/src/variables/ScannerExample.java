package variables;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {

		System.out.print("Enter your name: ");
		// create an Object of Scanner class
		Scanner input = new Scanner(System.in);

		// read input(line of text) from the keyboard
		String name = input.nextLine();

		// prints the name
		System.out.println("My name is " + name);
		// closes the scanner
		input.close();
	}

}

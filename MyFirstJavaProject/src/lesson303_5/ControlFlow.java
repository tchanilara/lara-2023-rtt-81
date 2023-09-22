package lesson303_5;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1: Print a Multiplication Table
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}

		// 2: Find the Greatest Common Divisor
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number1 = scan.nextInt();
		System.out.print("Enter the second number: ");
		int number2 = scan.nextInt();
		scan.close();
		int gcd = number1 < number2 ? number1 : number2;
		while (true) {
			if ((number1 % gcd == 0) && (number2 % gcd == 0)) {
				break;
			} else {
				gcd--;
			}
		}
		System.out.println("The GCD is " + gcd);
		
		//3: Predict Future Tuition
		int tuition = 10000;
		int year = 0;
		int newTuition = tuition;
		while(newTuition < 2 * tuition) {
			newTuition *= 1.07;
			year++;
		}
		
		System.out.println("The tuition will be doubbled in " + year + " years");

	}

}

package lesson303_7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Task 1
		int[] numbers = new int[] { 1, 2, 3 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// Task 2
		int middle = numbers.length / 2;
		System.out.println(numbers[middle]);

		// Task 3
		String[] strings = new String[] { "red", "green", "blue", "yellow" };
		String[] newStrings = strings.clone();
		String[] newStringsShallow = strings;
		strings[1] = "pink";
		System.out.println("Source Array: " + Arrays.toString(strings));
		System.out.println("Target Array: " + Arrays.toString(newStrings));
		System.out.println("Target Array Shallowed: " + Arrays.toString(newStringsShallow));

		// Task4
		// numbers[4] = 6;

		// Task 5
		int[] task5 = new int[5];
		for (int i = 0; i < task5.length; i++) {
			task5[i] = i;
		}
		System.out.println(Arrays.toString(task5));

		// Task 6
		int[] task6 = new int[5];
		for (int i = 0; i < task5.length; i++) {
			task6[i] = 2 * i;
		}
		System.out.println(Arrays.toString(task6));

		// Task 7
		middle = task6.length / 2;
		for (int i = 0; i < task5.length; i++) {
			if (i != middle)
				System.out.println(task6[i]);

		}

		// Task 8
		middle = strings.length / 2;
		System.out.println("Source Array Before: " + Arrays.toString(strings));
		String word = strings[0];
		strings[0] = strings[middle];
		strings[middle] = word;
		System.out.println("Source Array After: " + Arrays.toString(strings));

		// Task 9
		int[] arrays = new int[] { 4, 2, 9, 13, 1, 0 };
		int elt;
		int min;
		int index;
		System.out.println("Array Before Sort: " + Arrays.toString(arrays));
		for (int i = 0; i < arrays.length - 1; i++) {
			elt = arrays[i];
			min = elt;
			index = i;
			for (int j = i + 1; j < arrays.length; j++) {
				if (arrays[j] < min) {
					min = arrays[j];
					index = j;
				}
			}
			if (index != i) {
				arrays[i] = min;
				arrays[index] = elt;
			}
		}
		System.out.println("Array in ascending order: " + Arrays.toString(arrays));
		System.out.println("The smallest number is " + arrays[0]);
		System.out.println("The biggest number is " + arrays[arrays.length - 1]);

		// Task 10 an array have the same type

		// Task 11
		Scanner scan = new Scanner(System.in);
		System.out.println("How many favorite things do you have?");
		int size = scan.nextInt();
		String[] choice = new String[size];
		for (int j = 0; j < size; j++) {
			System.out.print("Enter your thing:");
			choice[j] = scan.next();
		}
		scan.close();
		System.out.println("Your favorite  things are: " + Arrays.toString(choice));
		
		//loop null
		int number = 0;
		String[] arrayNull = new String[] {null, "bon", "soir", null, ""};
		for (String value: arrayNull) {
			if(value == null) {
				number++;
			}
		}
		System.out.println(number);
	}

}
